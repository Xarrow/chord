package service;

import model.StudentBaseInfoModel;

/**
 * @Author zhang
 * @Time 2016/8/1.
 */
public interface IStudentBaseService {
    /**
     * 根据学号查询
     * @param xh 学号
     * @return student
     */
   StudentBaseInfoModel querySingleStudentByXh(String xh);
}
