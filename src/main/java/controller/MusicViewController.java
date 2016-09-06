package controller;

import model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.IMusicService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/8/21.
 */
@Controller
@RequestMapping(value = "/music")
public class MusicViewController {

    @Autowired
    private IMusicService iMusicService;

    @RequestMapping(value = "/view/url", method = RequestMethod.POST)
    public ModelAndView mainRestfulMusic(@RequestParam("url") String url) {
        ModelAndView modelAndView = new ModelAndView();
        Music music = new Music();
        List<Object> objectList = new ArrayList<Object>();
        if (url.indexOf("163") > 0) {
            String singId = url.split("=")[1];
            objectList = iMusicService.parseFromNetEase(singId);
        }else if(url.indexOf("qq")>0){

        }
        if (null != objectList && objectList.size() > 0) {
            music = (Music) objectList.get(0);
        }
        modelAndView.addObject("music", music);
        modelAndView.setViewName("views/musicDetail");
        return modelAndView;
    }

    @RequestMapping(value = "/163", method = {RequestMethod.GET})
    public String musicMain() {
        return "views/musicIndex";
    }

}
