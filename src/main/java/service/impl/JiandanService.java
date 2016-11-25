package service.impl;

import dao.IJiandanDao;
import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import model.Jiandan;
import org.springframework.stereotype.Service;
import service.IJiandanService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@Service
public class JiandanService implements IJiandanService {
    @Resource
    private IJiandanDao jiandanDao;

    @Override
    public int insertJiandan(Jiandan jiandan) {
        return 0;
    }

    @Override
    public JiandanResponseDto selectJiandanByLimit(JiandanQueryDto jiandanQueryDto) {
        JiandanResponseDto jiandanResponseDto = new JiandanResponseDto();

        int totalCount = jiandanDao.getTotalCount();
        int pages = (int) Math.floor(totalCount/jiandanQueryDto.getOffset());
        jiandanResponseDto.setTotalCount(totalCount);
        jiandanResponseDto.setPageSize(jiandanQueryDto.getOffset());
        jiandanResponseDto.setStart(jiandanQueryDto.getStart());
        jiandanResponseDto.setPages (pages);
        jiandanResponseDto.setJiandanList(
                jiandanDao.selectByLimitSelective(jiandanQueryDto));

        return jiandanResponseDto;

    }

}
