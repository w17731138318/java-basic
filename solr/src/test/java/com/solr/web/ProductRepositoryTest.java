package com.solr.web;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository repository;
    private static String baseUrl = "http://localhost:8983/solr/techproducts";
    public static final SolrClient server = new HttpSolrClient(baseUrl);

    /**
     * @Description: 查询关键字
     * </p>
     */
    @Test
    public void testSoleJ(){
        try {
            SolrQuery query = new SolrQuery("*:*");
            QueryResponse resp = server.query(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test() throws IOException, SolrServerException {
//        this.repository.save(new Product("1", "Nintendo Entertainment System"));
//        this.repository.save(new Product("2", "Sega Megadrive"));
//        this.repository.save(new Product("3", "Sony Playstation"));
        server.addBean(new Product("1", "Nintendo Entertainment System"));
        server.addBean(new Product("2", "Sega Megadrive"));
        server.addBean(new Product("3", "Sony Playstation"));

        // fetch all
//        System.out.println("Products found by findAll():");
//        System.out.println("----------------------------");
//        for (Product product : this.repository.findAll()) {
//            System.out.println(product);
//        }
        System.out.println();

        // fetch a single product
        System.out.println("Products found with findByNameStartingWith('So'):");
        System.out.println("--------------------------------");
        for (Product product : this.repository.findByNameStartingWith("So")) {
            System.out.println(product);
        }
        System.out.println();
    }
}