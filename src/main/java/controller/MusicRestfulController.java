package controller;

import model.Music;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IMusicService;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/22.
 */
@RestController
@RequestMapping(value = "/music")
public class MusicRestfulController {
    private static  final Logger LOGGER = LoggerFactory.getLogger(MusicRestfulController.class);

    @Autowired
    private IMusicService iMusicService;

    @RequestMapping(value = "/restful/url",method = RequestMethod.POST)
    public Music mainRestfulMusic(@RequestParam("url") String url){
        List<Object> objectList = iMusicService.parseFromNetEase(url);
        Music music = new Music();
        if(null!=objectList&&objectList.size()>0){
            music = (Music) objectList.get(0);
        }
        return  music;
    }
}
