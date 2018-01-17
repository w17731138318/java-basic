package com.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * WebSocketConfig 类
 * 此处@EnableWebSocketMessageBroker注解用于开启使用STOMP协议来传输基于代理（MessageBroker）的消息，
 * 这时候控制器（controller）开始支持@MessageMapping,就像是使用@requestMapping一样。
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-16 17:45
 * @see
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		/**
		 * 注册一个Stomp的节点（endpoint）,并指定使用SockJS协议。
		 */
		stompEndpointRegistry.addEndpoint("/webSocketStompEndpoint").withSockJS();
	}
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		/**
		 * 配置消息代理（MessageBroker）
		 * 设置服务器广播消息的基础路径
		 */
		registry.enableSimpleBroker("/topic");
		/**
		 * 设置客户端订阅消息的基础路径
		 */
		registry.setApplicationDestinationPrefixes("/app");
	}
}
