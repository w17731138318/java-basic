package com.redis.service;

import com.redis.entity.User;
import com.redis.repository.UserRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/29.
 */
@Service
public class UserService {
	@Resource
	private UserRepository userRepository;

	@Cacheable(value="User",key="#id")
	public User getOne(Long id){
		return userRepository.getOne(id);
	}

	@CachePut(value="User",key="#user.id")
	public User save(User user){
		return userRepository.save(user);
	}
	@CachePut(value="User",key="#user.id")
	public User update(User user){
		return userRepository.save(user);
	}
	@CacheEvict(value="User",key="#user.id")
	public void delete(Long id){
		userRepository.delete(id);
	}
}
