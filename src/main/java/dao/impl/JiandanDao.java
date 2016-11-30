package dao.impl;

import dao.IJiandanDao;
import dto.JiandanQueryDto;
import model.Jiandan;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/25.
 */
@Repository
public class JiandanDao  implements IJiandanDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Resource
    private SqlSession sqlSession;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }


    @Override
    public int insertSelective(Jiandan record) {
        return sqlSessionTemplate.insert("dao.IJiandanDao.insertSelective", record);
    }


    @Override
    public List<Jiandan> selectByEntitiesSelective(JiandanQueryDto jiandanQueryDto) {
        return sqlSessionTemplate.
                selectList("dao.IJiandanDao.selectByEntitiesSelective", jiandanQueryDto);
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
        return sqlSession.
                selectList("dao.IJiandanDao.selectByLimitSelective", jiandanQueryDto);
    }


    @Override
    public Jiandan selectById(Integer id) {
        Jiandan jiandan = jdbcTemplate.queryForObject("select * from jiandan where id = ?",
                new Object[]{id}, new BeanPropertyRowMapper<Jiandan>(Jiandan.class));
        return jiandan;
    }
}
