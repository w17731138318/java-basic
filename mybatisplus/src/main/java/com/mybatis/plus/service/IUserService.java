package com.mybatis.plus.service;

import com.baomidou.mybatisplus.service.IService;
import com.mybatis.plus.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	public List<User> selectListBySQL();
}
