package service.impl;

import com.alibaba.fastjson.JSONObject;
import dao.INexus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import model.TnFoodModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.DispatcherServletWebRequest;
import service.INexusService;


/**
 * @Author zhangjian5
 * @Time 2016/9/6
 */

@Service
public class NexusServiceImpl implements INexusService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NexusServiceImpl.class);
    @Value("${jdbc_url}")
    private String mysqlStr;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private INexus iNexus;

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

    /**
     * 获取所有的订餐信息
     *
     * @return list
     */
    @Override
    public Map<String, Object> getAll() {
        return null;
    }

    @Override
    public Map<String, Object> customerData(String area) {
        RequestContextHolder.getRequestAttributes().getAttribute("ts", RequestAttributes.SCOPE_GLOBAL_SESSION);
        String areaStr = area;
        List<TnFoodModel> tnFoodModelList = iNexus.getTnFoodByArea(areaStr);
        Map<String, Object> bigMap = new HashMap<String, Object>();
        Map<String, Object> dateMap = new HashMap<String, Object>();
        List<Object> nameList = new ArrayList<Object>();
        //总时间
        Set<String> dateSet = new TreeSet<String>();
        //总品类
        Set<String> nameSet = new TreeSet<String>();

        for (TnFoodModel tnFoodModel : tnFoodModelList) {
            dateSet.add(tnFoodModel.getDate());
            nameSet.add(tnFoodModel.getName());
        }
        bigMap.put("area", area);
        bigMap.put("totalNames", nameSet);
        bigMap.put("totalDate", dateSet);
        //以时间为纬度
        for (String d : dateSet) {
            List<TnFoodModel> subList = new ArrayList<TnFoodModel>();
            TnFoodModel t2 = new TnFoodModel();
            for (String n : nameSet) {
                try {
                    t2 = jdbcTemplate.queryForObject("select * from tn_food where name =? and  area=? and date = ? order by date DESC ",
                            new Object[]{n, areaStr, d},
                            new BeanPropertyRowMapper<TnFoodModel>(TnFoodModel.class));
                } catch (Exception ex) {
                    t2.setName(n);
                    t2.setArea(areaStr);
                    t2.setDate(d);
                    t2.setNum("0");
                }
                subList.add(t2);
            }

            dateMap.put(d, subList);
        }

        //以品类为维度
        for (String n : nameSet) {
            Map<String, Object> item = new HashMap<String, Object>();
            Integer num = 0;
            List<Object> tmpList = new ArrayList<Object>();
            for (String d : dateSet) {
                try {
                    num = jdbcTemplate.queryForInt("select num from tn_food where name =? and  area=? and date =? order by date desc",
                            new Object[]{n, areaStr, d});
                } catch (Exception ex) {
                    num = 0;
                }
                tmpList.add(num);
                item.put("name", n);
                item.put("type", "bar");
                item.put("data", tmpList);
            }
            nameList.add(item);
        }

        bigMap.put("nameMap", nameList);
        System.out.println(JSONObject.toJSON(bigMap));
        return bigMap;
//        System.out.println(com.alibaba.fastjson.JSONObject.toJSON(iNexus.getNumByAreaAndNameAndDate("2016-10-11","江苏软件园1+5号楼","小食记A+普通盒饭")));

    }
}
