package com.redis.repository;/**
 * Created by Administrator on 2017/11/30.
 */

import com.redis.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * RolesRepository
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-11-30 10:01
 **/
public interface RolesRepository extends JpaRepository<Roles, Long> {
}