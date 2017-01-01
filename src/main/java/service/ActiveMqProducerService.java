package service;


import javax.jms.Destination;
import javax.jms.TextMessage;

/**
 * @Author: zhang
 * @Time:2017/1/2
 */
public interface ActiveMqProducerService {
    void sendMessage(Destination destination, final String messages);

    TextMessage receiveMessage(Destination destination);

}
