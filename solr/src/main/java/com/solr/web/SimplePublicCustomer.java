package com.solr.web;/**
 * Created by Administrator on 2017/12/1.
 */

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.geo.Point;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 17:38
 * @see
 **/
@SolrDocument(solrCoreName = "collection1")
public class SimplePublicCustomer {
    @Id
    @Field
    private Long id;
    @Field
    private String name;
    @Field("store")
    private Point location;

    /*
    * 私有构造器
    */
    public SimplePublicCustomer() {
    }

    public SimplePublicCustomer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
        * 构建新实例
        */
    public static SimplePublicCustomer newInstance(Long id, String name) {
        return new SimplePublicCustomer(id,name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimplePublicCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
