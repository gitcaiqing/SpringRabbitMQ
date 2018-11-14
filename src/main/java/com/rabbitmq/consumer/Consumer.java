package com.rabbitmq.consumer;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Consumer implements MessageListener{

	public void onMessage(Message message) {
		String msg = null;
		try {
			msg = new String(message.getBody(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("路由模式消费者消费："+msg);
	}
}
