package dao;



import model.Music;
import model.Singer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ISingerDAO {


    int deleteByPrimaryKey(Integer id);

    void insert(Singer record);

    void insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    @Select("select * from singer where singerId = #{singerid} and singId =#{singid}")
    List<Singer> selectBySingIdAndSingerId(Singer singer);
}