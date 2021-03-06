package test;

import dao.impl.JiandanDao;
import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import model.Jiandan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;
import service.IJiandanService;
import service.impl.JiandanService;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/27.
 */
@Component
@EnableCaching
public class CacheTestComponent {
    private static final Logger logger =
            LoggerFactory.getLogger(CacheTestComponent.class);
    @Resource
    private JiandanDao jiandanDao;

    @Resource
    private IJiandanService iJiandanService;


    public Jiandan getJidanByIdCache(Integer id) {
        logger.info("start to query database");
        return iJiandanService.selectById(id);
    }


    public JiandanResponseDto selectJiandanByLimitCache(JiandanQueryDto jiandanQueryDto) {
        return iJiandanService.selectJiandanByLimit(jiandanQueryDto);
    }
}
