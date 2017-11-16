package com.mongodb.dao;

import com.mongodb.entity.UserEntity;

/**
 * Created by Administrator on 2017/11/16.
 */
public interface UserDao {
	void saveUser(UserEntity user);
	UserEntity findUserByUserName(String userName);
	void updateUser(UserEntity user);
	void deleteUserById(Long id);
}
