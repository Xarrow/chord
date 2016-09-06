package service;

import model.Singer;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/24.
 */
public interface ISingerService {
    List<Singer> querySingerBySingIdAndSingerId(Singer singer);

}
