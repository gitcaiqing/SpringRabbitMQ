package com.rabbitmq.consumer;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 消费者
 * 实现 MessageListener或ChannelAwareMessageListener(需手动确认的实现此接口)
 */
public class Consumer implements MessageListener{

	public void onMessage(Message message) {
		String msg = null;
		try {
			msg = new String(message.getBody(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("消费者消费："+msg);
	}
}
