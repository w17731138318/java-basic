package com.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mybatis.plus.entity.User;
import com.mybatis.plus.mapper.UserMapper;
import com.mybatis.plus.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 16:08
 * @see
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

}
