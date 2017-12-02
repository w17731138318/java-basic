package com.solr.web;/**
 * Created by Administrator on 2017/12/1.
 */

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 18:18
 * @see
 **/
import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.geo.Point;
import org.springframework.data.solr.core.mapping.SolrDocument;

public class Product {

    @Id
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private Double price;

    @Field("cat")
    private List<String> category;

    @Field("store")
    private Point location;

    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<String> getCategory() {
        return this.category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Point getLocation() {
        return this.location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Product [id=" + this.id + ", name=" + this.name + ", price=" + this.price
                + ", category=" + this.category + ", location=" + this.location + "]";
    }

}
