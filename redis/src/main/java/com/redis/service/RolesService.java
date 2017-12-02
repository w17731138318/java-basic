package com.redis.service;/**
 * Created by Administrator on 2017/11/30.
 */

import com.redis.repository.RolesRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * RolesService
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-11-30 10:01
 **/
@Service
public class RolesService {
	@Resource
	private RolesRepository rolesRepository;
}