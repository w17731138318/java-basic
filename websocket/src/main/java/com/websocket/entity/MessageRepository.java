package com.websocket.entity;/**
 * Created by Administrator on 2018/1/16.
 */

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MessageRepository
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-16 17:56
 **/
public interface MessageRepository extends JpaRepository<Message, Long> {
}