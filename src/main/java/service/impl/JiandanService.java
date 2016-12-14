package service.impl;

import dao.IJiandanDao;
import dto.JiandanDto;
import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import model.Jiandan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import service.IJiandanService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@Service
@EnableCaching
public class JiandanService implements IJiandanService {
    private static final Logger logger = LoggerFactory.getLogger(JiandanService.class);

    @Resource
    private IJiandanDao jiandanDao;

    @Override
    public int insertJiandan(Jiandan jiandan) {
        return 0;
    }


    @Override
    @Cacheable(value = "JiandanResponseDtoCache_redis", key = "#p0")
    public JiandanResponseDto selectJiandanByLimit(JiandanQueryDto jiandanQueryDto) {
        JiandanResponseDto jiandanResponseDto = new JiandanResponseDto();

        int totalCount = jiandanDao.getTotalCount();
        int pages = (int) Math.floor(totalCount / jiandanQueryDto.getOffset());

        jiandanResponseDto.setTotalCount(totalCount);
        jiandanResponseDto.setPageSize(jiandanQueryDto.getOffset());
        jiandanResponseDto.setStart(jiandanQueryDto.getStart());
        jiandanResponseDto.setPages(pages);

        List<Jiandan> queryList = jiandanDao.selectByLimitSelective(jiandanQueryDto);
        if (null != queryList) {
            List<JiandanDto> jianDanDtoList = new ArrayList<JiandanDto>();
            String[] ignoreProperties = new String[]{};
            for (Jiandan j : queryList) {
                JiandanDto jiandanDto = new JiandanDto();
                BeanUtils.copyProperties(j, jiandanDto, ignoreProperties);
                jianDanDtoList.add(jiandanDto);
            }
            jiandanResponseDto.setJiandanList(jianDanDtoList);
        }
        return jiandanResponseDto;

    }


    @Override
    @Cacheable(value = "jiandanCache_redis", key = "#p0")
    public Jiandan selectById(Integer id) {

        return jiandanDao.selectById(id);
    }


}
