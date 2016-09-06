package dao;


import model.StudentBaseInfoModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface IStudentBaseInfoDAO {

    int deleteByPrimaryKey(String xh);

    void insert(StudentBaseInfoModel record);

    void insertSelective(StudentBaseInfoModel record);


    StudentBaseInfoModel selectByPrimaryKey(String xh);

    List<StudentBaseInfoModel> selectByXm(String xm);

    int updateByPrimaryKeySelective(StudentBaseInfoModel record);

    int updateByPrimaryKeyWithBLOBs(StudentBaseInfoModel record);

    int updateByPrimaryKeyWithoutBLOBs(StudentBaseInfoModel record);
}