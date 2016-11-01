package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.impl.NexusServiceImpl;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chord-application-context.xml")
public class SpringTest {
    @Resource(name = "nexusServiceImpl")
    private NexusServiceImpl nexusService;
    @Test
    public void  demo1(){
        nexusService.updateAccount();
    }
}
