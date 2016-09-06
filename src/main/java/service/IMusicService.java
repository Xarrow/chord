package service;

import model.Music;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/21.
 */

public interface IMusicService {
    /**
     * 保存
     * @param music music
     */
    void saveMusic(Music music);


    List<Object> parseFromNetEase(String singId);

    Boolean isSavedBySingId(Integer singId);

    List<Music> selectMusicListBySingId(Integer singId);
}
