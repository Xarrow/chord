package test;

import dao.IJiandanDao;
import dto.JiandanQueryDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author zhang
 * @Time 2016/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:*.xml","classpath:mybatis-mapping/*.xml"})
public class SpringTest {
    @Autowired
    private IJiandanDao iJiandanDao;
    @Test
    public void  demo1(){

        JiandanQueryDto jiandanQueryDto = new JiandanQueryDto();
        jiandanQueryDto.setStart(10);
        jiandanQueryDto.setOffset(20);
        iJiandanDao.selectByLimitSelective(jiandanQueryDto);
    }
}
