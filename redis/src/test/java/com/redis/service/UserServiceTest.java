package com.redis.service;

import com.redis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void save(){
		User user = User.newInstance("张三", 23);
		userService.save(user);
	}
	@Test
	public void getOne(){
		userService.getOne(1l);
	}
}