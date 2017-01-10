package dao;

import dto.JiandanQueryDto;
import model.Jiandan;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface IJiandanDao {

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Jiandan record);

    /**
     * 查询全部条目
     *
     * @param jiandanQueryDto 查询dto
     * @return list
     */
    List<Jiandan> selectByEntitiesSelective(JiandanQueryDto jiandanQueryDto);

    int updateByPrimaryKeySelective(Jiandan record);


    /**
     * 获取数据库总条目
     *
     * @return int
     */
    int getTotalCount();

    /**
     * 分页查询
     *
     * @param jiandanQueryDto 查询dto
     * @return list
     */
    List<Jiandan> selectByLimitSelective(JiandanQueryDto jiandanQueryDto);


    //    @Cacheable("jiandanCache_redis")
    Jiandan selectById(Integer id);


    List<Jiandan> getAll();
}