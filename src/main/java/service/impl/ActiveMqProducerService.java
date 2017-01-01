package service.impl;

import javax.jms.*;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhang
 * @Time:2017/1/2
 */
@Service
public class ActiveMqProducerService implements service.ActiveMqProducerService {
    @Resource
    private JmsTemplate jmsTemplate;

    @Override
    public void sendMessage(Destination destination, String messages) {

        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(messages);
            }
        });
    }

    @Override
    public TextMessage receiveMessage(Destination destination) {
        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
        return textMessage;
    }
}
