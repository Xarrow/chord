package dao.impl;

import dao.IJiandanDao;
import dto.JiandanQueryDto;
import model.Jiandan;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/25.
 */
@Repository
public class JiandanDao extends SqlSessionDaoSupport implements IJiandanDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }


    @Override
    public int insertSelective(Jiandan record) {
        return 0;
    }


    @Override
    public List<Jiandan> selectByEntitiesSelective(JiandanQueryDto jiandanQueryDto) {
        return sqlSessionTemplate.selectList("dao.IJiandanDao.selectByEntitiesSelective",jiandanQueryDto);
    }

    @Override
    public int updateByPrimaryKeySelective(Jiandan record) {
        return 0;
    }

    @Override
    public int getTotalCount() {
        return jdbcTemplate.queryForInt("select count(*) as totalCount from jiandan");
    }


    @Override
    public List<Jiandan> selectByLimitSelective(JiandanQueryDto jiandanQueryDto) {
        return sqlSessionTemplate.selectList("dao.IJiandanDao.selectByLimitSelective", jiandanQueryDto);
    }
}
