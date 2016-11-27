package dao;



import model.Music;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMusicDAO {


    void insert(Music record);

    void insertSelective(Music record);


    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);

    List<Music> selectBySingId(Integer singId);
}