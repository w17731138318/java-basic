package com.mybatis.plus.mapper;

import com.mybatis.plus.SuperMapper;
import com.mybatis.plus.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface UserMapper extends SuperMapper<User> {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();

	@Select("select test_id as id, name, age, test_type from user")
	List<User> selectListBySQL();

}
