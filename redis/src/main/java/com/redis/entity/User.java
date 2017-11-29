package com.redis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/29.
 */
@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer age;

	private User() {
	}

	private User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public static User newInstance(String name, Integer age){
		return new User(name,age);
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
