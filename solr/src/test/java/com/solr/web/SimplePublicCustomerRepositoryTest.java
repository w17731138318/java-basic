package com.solr.web;

import org.apache.solr.client.solrj.response.UpdateResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplePublicCustomerRepositoryTest {
    @Resource
    private SimplePublicCustomerRepository simplePublicCustomerRepository;
    @Resource
    private SolrTemplate solrTemplate;
    @Test
    public void test(){
        SimplePublicCustomer simplePublicCustomer = SimplePublicCustomer.newInstance(1l,"张三");
        UpdateResponse updateResponse = solrTemplate.saveBean(simplePublicCustomer);
//        SimplePublicCustomer save = simplePublicCustomerRepository.save(simplePublicCustomer);
    }
    @Test
    public void get(){
        List<SimplePublicCustomer> list = simplePublicCustomerRepository.findByName("张三");
        list.stream().forEach(e->{
            System.out.println(e);
        });

    }
}