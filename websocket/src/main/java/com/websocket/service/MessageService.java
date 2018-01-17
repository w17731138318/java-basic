package com.websocket.service;/**
 * Created by Administrator on 2018/1/16.
 */

import com.websocket.entity.Message;
import com.websocket.entity.MessageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * MessageService
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-16 17:57
 **/
@Service("messageService")
public class MessageService {
	@Resource
	private MessageRepository messageRepository;

	public void save(Message message){
		messageRepository.save(message);
	}
}