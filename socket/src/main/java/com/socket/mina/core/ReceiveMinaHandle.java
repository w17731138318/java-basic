package com.socket.mina.core;

import com.sun.javafx.binding.Logging;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ReceiveMinaHandle
 * socket接收处理类
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-05 17:16
 * @see
 **/
@Component
public class ReceiveMinaHandle  extends IoHandlerAdapter{
	private static Logger LOGGER = LoggerFactory.getLogger(ReceiveMinaHandle.class);

	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		System.out.println("收到消息");
		System.out.println(message.toString());
		LOGGER.info(String.format("message1 : %s", message));
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("连接关闭");
		LOGGER.info("session :" + session.getId());
		super.sessionClosed(session);
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info(String.format("session [%s] ,status [%s]",session.getId(), status.toString()));
		super.sessionIdle(session, status);
	}

}
