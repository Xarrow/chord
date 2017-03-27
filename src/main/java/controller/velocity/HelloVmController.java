package controller.velocity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhang
 * @Time:2017/3/28
 */
@Controller
@RequestMapping("vm")
public class HelloVmController {

    @RequestMapping("index")
    public String testVm() {
        return "helloVm";
    }
}
