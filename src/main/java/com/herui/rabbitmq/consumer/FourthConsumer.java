package com.herui.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by HeRui on 2019/2/17.
 */
public class FourthConsumer implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(FirstConsumer.class);

    public void onMessage(Message message) {
        logger.info("The fourth consumer received message : " + new String(message.getBody()));
    }
}
