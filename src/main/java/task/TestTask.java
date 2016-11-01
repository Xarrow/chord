package task;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author zhangjian5否
 * @Time 2016/10/31
 */
//@Component
//@EnableScheduling
//public class TestTask implements InitializingBean {
//
//    @Scheduled(cron = "0/1 * * * * ?")
//    public void sendMsg() {
//        System.out.println(System.currentTimeMillis());
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        sendMsg();
//    }
//}
