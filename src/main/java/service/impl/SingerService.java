package service.impl;

import dao.ISingerDAO;
import model.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import service.ISingerService;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/24.
 */
public class SingerService implements ISingerService {
    @Autowired
    private  ISingerDAO iSingerDAO;

    @Override
    public List<Singer> querySingerBySingIdAndSingerId(Singer singer) {
        return iSingerDAO.selectBySingIdAndSingerId(singer);
    }
}
