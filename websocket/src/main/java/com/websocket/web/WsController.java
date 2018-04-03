package com.websocket.web;

import com.websocket.entity.Message;
import com.websocket.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

/**
 * WsController
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-17 8:49
 * @see
 **/
@Controller
public class WsController {
	@Autowired
	private MessageService messageService;

	/**
	 * 1.@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址
	 * 2.如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息
	 * @param message
	 * @return
	 * @throws Exception
	 */
	@MessageMapping("/onMessage")
	@SendTo("/topic/getResponse")
	public Message say(Message message) throws Exception {
		messageService.save(message);
		return new Message("消息已收到，内容为："+message.getMsg());
	}

	/**
	 * 精准推送
	 * @param message
	 * @return
	 */
	@MessageMapping("handle1")
	@SendToUser(value = "/topic/greetings1",broadcast = false)
	public Message handle1(Message message) {
		messageService.save(message);
		System.out.println("handle1："+message.getMsg());
		return new Message("消息已收到，内容为：精准推送，只推送到1");
	}


	/**
	 * 广播推送
	 * @param message
	 * @return
	 */
	@MessageMapping("handle2")
	@SendTo("/topic/greetings2")
	public Message handle2(Message message) {
		messageService.save(message);
		System.out.println("handle2："+message.getMsg());
		return new Message("广播推送，所有用户都收得到");
	}
}
