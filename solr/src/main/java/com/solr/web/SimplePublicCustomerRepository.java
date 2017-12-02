package com.solr.web;/**
 * Created by Administrator on 2017/12/1.
 */

import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * SimplePublicCustomerRepository
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 17:59
 **/
public interface SimplePublicCustomerRepository extends SolrCrudRepository<SimplePublicCustomer, Long> {
    List<SimplePublicCustomer> findByName(String name);
}