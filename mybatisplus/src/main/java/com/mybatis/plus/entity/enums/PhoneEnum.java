package com.mybatis.plus.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/10.
 */
public enum PhoneEnum implements IEnum {
	CMCC("10086", "中国移动"),
	CUCC("10010", "中国联通"),
	CT("10000", "中国电信");

	private String value;
	private String desc;

	PhoneEnum(final String value, final String desc) {
		this.value = value;
		this.desc = desc;
	}

	@Override
	public Serializable getValue() {
		return this.value;
	}

	public String getDesc(){
		return this.desc;
	}
}
