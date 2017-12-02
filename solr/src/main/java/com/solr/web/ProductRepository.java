package com.solr.web;
import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
/**
 * ProductRepository
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 18:19
 **/


public interface ProductRepository extends SolrCrudRepository<Product, String> {

    List<Product> findByNameStartingWith(String name);

}