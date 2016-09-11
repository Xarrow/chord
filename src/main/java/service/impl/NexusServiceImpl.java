package service.impl;

import dao.IBaseDAO;
import dao.impl.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import service.INexusService;


/**
 * @Author zhangjian5
 * @Time 2016/9/6
 */

@Service
public class NexusServiceImpl implements INexusService {
    @Value("${jdbc_url}")
    private String mysqlStr;

    @Autowired
    private BaseDAO baseDAO;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object someTries() {
        return mysqlStr;
    }

    @Override
    public void updateAccount() {
        String sql = "update account set name = 'fuckyou' where id = 1";
        //jdbcDaoSupport
        //baseDAO.getJdbcTemplate().update(sql);

        //JdbcTemplate
        jdbcTemplate.update(sql);
    }
}
