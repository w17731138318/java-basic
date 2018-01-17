package com.websocket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-16 17:54
 * @see
 **/
@Entity
public class Message {
	/**
	 * id
	 */
	@Id
	@GeneratedValue
	private Long id;


	/**
	 * msg
	 */
	private String msg;

	public Message() {
	}

	public Message(String msg) {
		this.msg = msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Message{" +
				"id=" + id +
				", msg='" + msg + '\'' +
				'}';
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
