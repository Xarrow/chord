package dao.impl;

import dao.IJiandanDao;
import dao.JiandanMapper;
import model.Jiandan;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */

@Repository
public class JiandanDaoImpl extends SqlSessionDaoSupport implements JiandanMapper{
    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int insert(Jiandan record) {
        return sqlSessionTemplate.insert("dao.JiandanMapper.insert",record);
    }

    @Override
    public Jiandan selectByPrimaryKey(@Param("md5") String md5, @Param("name") String name) {
        return null;
    }

    @Override
    public List<Jiandan> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Jiandan record) {
        return 0;
    }
}
