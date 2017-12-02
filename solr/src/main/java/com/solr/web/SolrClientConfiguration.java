package com.solr.web;/**
 * Created by Administrator on 2017/12/1.
 */

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 16:55
 * @see
 **/
@Configuration
public class SolrClientConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public SolrClient solrClient() {
        System.out.println("自定义配置SolrClient");
        return new HttpSolrClient(environment.getRequiredProperty("spring.data.solr.host"));
    }
}