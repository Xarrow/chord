package service.impl;

import dao.IStudentBaseInfoDAO;
import model.StudentBaseInfoModel;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IStudentBaseService;

/**
 * 学生信息基本服务
 *
 * @author zhang jian
 * @Time 2016/7/31.
 */

@Service
public class StudentBaseService implements IStudentBaseService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StudentBaseService.class);
    private final IStudentBaseInfoDAO studentBaseInfoDAO;

    @Autowired
    public StudentBaseService(IStudentBaseInfoDAO studentBaseInfoDAO) {
        this.studentBaseInfoDAO = studentBaseInfoDAO;
    }

    /**
     * 根据学号查询
     * @param xh 学号
     * @return student
     */
    @Override
    public StudentBaseInfoModel querySingleStudentByXh(String xh) {
        StudentBaseInfoModel studentBaseInfoModel = null;
        try {
            studentBaseInfoModel = studentBaseInfoDAO.selectByPrimaryKey(xh);
        } catch (Exception ex) {
            LOGGER.info("根据学号查询用户异常:[{}]", ex);
            return null;
        }
        return studentBaseInfoModel;
    }
}
