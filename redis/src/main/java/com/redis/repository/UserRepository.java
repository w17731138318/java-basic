package com.redis.repository;

import com.redis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/29.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
