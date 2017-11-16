package com.mongodb.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
@Document(collection = "t_app")
public class App
{
	@Id
	private ObjectId id;
	@Field("api_key")
	private String apiKey;
	private String appname;
	private List<Object> activities;

	public App() {
	}

	public App(String apiKey, String appname, List<Object> activities) {
		this.apiKey = apiKey;
		this.appname = appname;
		this.activities = activities;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public List<Object> getActivities() {
		return activities;
	}

	public void setActivities(List<Object> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "App{" +
				"id=" + id +
				", apiKey='" + apiKey + '\'' +
				", appname='" + appname + '\'' +
				", activities=" + activities +
				'}';
	}
}
