package service;

import java.util.Map;

/**
 * @Author zhangjian5
 * @Time 2016/9/6
 */
public interface INexusService {
    Object someTries();

    void updateAccount();

    /**
     * 获取所有的订餐信息
     * @return list
     */
    Map<String,Object> getAll();

    Map<String, Object> customerData(String area);
}
