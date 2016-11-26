package test;

import dao.impl.JiandanDao;
import model.Jiandan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/27.
 */
@Component
public class CacheTestComponent {
    private static final Logger logger = LoggerFactory.getLogger(CacheTestComponent.class);
    @Resource
    private JiandanDao jiandanDao;

    @Cacheable("jiandanCache")
    public Jiandan getJidanByIdCache(Integer id){
        logger.info("start to query database");
        return jiandanDao.selectById(id);
    }
}
