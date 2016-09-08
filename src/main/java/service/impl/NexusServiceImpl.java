package service.impl;

import dao.IBaseDAO;
import dao.impl.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import service.INexusService;


/**
 * @Author zhangjian5
 * @Time 2016/9/6
 */

@Service
public class NexusServiceImpl extends BaseDAO implements INexusService {
    @Value("${jdbc_url}")
    private  String mysqlStr;


    @Override
    public Object someTries() {
        return mysqlStr;
    }

}
