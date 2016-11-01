package dao;

import java.util.List;
import model.TnFoodModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author zhangjian5
 * @Time 2016/10/13
 */
@Repository
public interface INexus {


    @Select("SELECT * FROM tn_food WHERE NAME IN (SELECT NAME FROM tn_food GROUP BY NAME) AND AREA =  #{area} order by date desc")
    List<TnFoodModel> getTnFoodByArea(String area);
}
