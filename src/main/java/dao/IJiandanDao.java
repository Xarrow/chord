package dao;

import model.Jiandan;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IJiandanDao {

    int insert(Jiandan record);

    Jiandan selectByPrimaryKey(@Param("md5") String md5, @Param("name") String name);

    List<Jiandan> selectAll();

    int updateByPrimaryKey(Jiandan record);
}