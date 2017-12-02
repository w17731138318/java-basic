package com.redis.entity;/**
 * Created by Administrator on 2017/11/30.
 */

/**
 * 权限
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-11-30 9:57
 * @see
 **/
public class Roles {
	private Long id;

	/*
	* 私有构造器
    */
	private Roles() {
	}

	/*
    * 构建新实例
    */
	public static Roles newInstance() {
		return new Roles();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
