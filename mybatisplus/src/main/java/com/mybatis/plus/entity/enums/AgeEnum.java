package com.mybatis.plus.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/10.
 */
public enum AgeEnum implements IEnum {
	ONE(1, "一岁"),
	TWO(2, "二岁");

	private int value;
	private String desc;

	AgeEnum(final int value, final String desc) {
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
