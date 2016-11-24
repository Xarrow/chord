package service.impl;

import dao.IJiandanDao;
import dao.JiandanMapper;
import model.Jiandan;
import org.springframework.stereotype.Service;
import service.IJiandanService;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@Service
public class JiandanService implements IJiandanService {
    @Resource
    private JiandanMapper jiandanMapper;

    @Override
    public int insertJiandan(Jiandan jiandan) {
        return jiandanMapper.insert(jiandan);
    }
}
