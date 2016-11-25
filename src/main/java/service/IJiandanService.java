package service;

import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import model.Jiandan;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
public interface IJiandanService {

    public int insertJiandan(Jiandan jiandan);

    JiandanResponseDto selectJiandanByLimit(JiandanQueryDto jiandanQueryDto);
}
