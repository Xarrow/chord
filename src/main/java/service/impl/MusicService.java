package service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import dao.IBaseDAO;
import dao.IMusicDAO;
import dao.ISingerDAO;
import dao.impl.BaseDAO;
import model.Music;
import model.Singer;
import org.apache.http.HttpHost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import service.IMusicService;
import utils.ResponseUtil;
import utils.ResponseVo;
import utils.ResultCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/21.
 */
@Service
public class MusicService extends BaseDAO implements IMusicService {
    private static  final Logger LOGGER = LoggerFactory.getLogger(MusicService.class);
    @Autowired
    private IMusicDAO iMusicDAO;
    @Autowired
    private ISingerDAO iSingerDAO;
    /**
     * 保存
     * @param music music
     */
    @Override
    @Transactional
    public void saveMusic(Music music) {
        iMusicDAO.insert(music);
    }

    /**
     * 从网易解析
     * @param singId
     * @return
     */
    @Override
    public List<Object> parseFromNetEase(String singId){
        List<Object> objectList = new ArrayList<Object>();
        if(this.isSavedBySingId(Integer.parseInt(singId))){
            objectList.add(this.selectMusicListBySingId(Integer.parseInt(singId)).get(0));
            objectList.add(null);
            return objectList;
        }else {
            String URL = "http://music.163.com/api/song/detail/?id=song_id&ids=%5Bsong_id%5D";
            Music music = new Music();
            Singer singer = new Singer();
            music.setSource(1);
            String newUrl = StringUtils.replace(URL,"song_id",singId);
            try {
                Unirest.setTimeouts(6000L,8000L);
//            Unirest.setProxy(new HttpHost("localhost",1080));
                HttpResponse<JsonNode> tmp = Unirest.get(newUrl)
                        .header("Accept", "application/json")
                        .asJson();

                JSONObject jsonObject = JSON.parseObject(tmp.getBody().toString());
                if(200==jsonObject.getInteger("code")){
                    JSONObject targetJson = jsonObject.getJSONArray("songs").getJSONObject(0);
                    music.setFullpath(targetJson.getString("mp3Url"));
                    music.setName(targetJson.getString("name")==null? singId :targetJson.getString("name"));
                    music.setSingid(targetJson.getInteger("id")==null? Integer.parseInt(singId):targetJson.getInteger("id"));
                    music.setLmusic(targetJson.getString("lMusic"));
                    music.setMmusic(targetJson.getString("mMusic"));
                    music.setHmusic(targetJson.getString("hMusic"));
                    music.setSource(1);
                    music.setCollection(targetJson.getJSONObject("album").getString("name"));
                    music.setAddtime(new Date());
                    music.setUrlpic(targetJson.getJSONObject("album").getString("blurPicUrl"));
                    music.setMd5(DigestUtils.md5DigestAsHex((music.getId()+music.getName()).getBytes()));
                    music.setMark(1);

                    JSONArray jsonArray = targetJson.getJSONObject("album").getJSONArray("artists");
                    if(null!=jsonArray&&jsonArray.size()>0){
                        for(Object singleJson:jsonArray){
                            JSONObject singerJson = (JSONObject)singleJson;
                            singer.setSingid(Integer.parseInt(singId));
                            singer.setSingerid(singerJson.getInteger("id"));
                            singer.setName(singerJson.getString("name"));
                            singer.setPic(singerJson.getString("picUrl"));
                        }
                    }
                }else {
                    LOGGER.info("{}连接网易音乐API失败");
                }
            } catch (UnirestException e) {
                LOGGER.error("Unirest异常,",e);
            }
            iMusicDAO.insert(music);
            iSingerDAO.insert(singer);
            objectList.add(music);
            objectList.add(null);
            return objectList;
        }
    }

    @Override
    public Boolean isSavedBySingId(Integer singId) {
        List<Music> musicList = this.selectMusicListBySingId(singId);
        if(null!=musicList&&musicList.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Music> selectMusicListBySingId(Integer singId) {
        return  iMusicDAO.selectBySingId(singId);
    }
}
