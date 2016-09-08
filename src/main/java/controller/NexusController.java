package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.INexusService;

/**
 * @Author zhangjian5
 * @Time 2016/9/6
 */
@Controller
public class NexusController {
    @Autowired
    private INexusService iNexusService;

    @RequestMapping("/nexus")
    public ModelAndView nexus() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("mysqlStr",iNexusService.someTries().toString());
        modelAndView.setViewName("views/nexus");
        return modelAndView;
    }
}
