package dao;

import java.util.List;
import model.Jiandan;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface JiandanMapper {
    int insert(Jiandan record);

    Jiandan selectByPrimaryKey(@Param("md5") String md5, @Param("name") String name);

    List<Jiandan> selectAll();

    int updateByPrimaryKey(Jiandan record);
}