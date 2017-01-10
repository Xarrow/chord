package controller.jiandan;

import dto.JiandanQueryDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.IJiandanService;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/26.
 */
@Controller
@RequestMapping(value = "jiandan/view")
public class JiandanViewController {
    private static final org.slf4j.Logger logger =
            org.slf4j.LoggerFactory.getLogger(JiandanViewController.class);
    @Resource
    private IJiandanService iJiandanService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView showJiandan(JiandanQueryDto jiandanQueryDto) {
        ModelAndView modelAndView = new ModelAndView();
//        try {
//            jiandanQueryDto.setOffset(jiandanQueryDto.getOffset()==null?10:jiandanQueryDto.getOffset());
//            jiandanQueryDto.setStart(jiandanQueryDto.getStart()==null?0:jiandanQueryDto.getStart());
//            modelAndView.setViewName("views/jiandan");
//            modelAndView.addObject("JiandanResponseDto",iJiandanService.selectJiandanByLimit(jiandanQueryDto));
//        }catch (Exception ex){
//            logger.error("{} cause a exception:{}",logger.getName(),ex);
//        }
        return modelAndView;
    }

}
