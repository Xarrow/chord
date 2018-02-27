package controller.jiandan;

import dto.JiandanQueryDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
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
        try {
            jiandanQueryDto.setOffset(jiandanQueryDto.getOffset() == null ? 10 : jiandanQueryDto.getOffset());
            jiandanQueryDto.setStart(jiandanQueryDto.getStart() == null ? 0 : jiandanQueryDto.getStart());
            modelAndView.setViewName("views/jiandan");
            modelAndView.addObject("JiandanResponseDto", iJiandanService.selectJiandanByLimit(jiandanQueryDto));
        } catch (Exception ex) {
            logger.error("{} cause a exception:{}", logger.getName(), ex);
        }
        return modelAndView;
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    public ModelAndView test2(JiandanQueryDto jiandanQueryDto,
                              @RequestHeader("user-agent") String agent) {
        logger.info("客户端来源:[{}]", agent);
        ModelAndView modelAndView = new ModelAndView();
        if (agent.toLowerCase().indexOf("chrome") > 0) {
            modelAndView.addObject("dto", jiandanQueryDto);
            modelAndView.addObject("resultMap", iJiandanService.getAll(jiandanQueryDto));
            modelAndView.setViewName("views/jiandan");
            return modelAndView;
        } else {
            modelAndView.setViewName("views/400");
            return modelAndView;
        }
    }
}
