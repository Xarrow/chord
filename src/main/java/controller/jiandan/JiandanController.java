package controller.jiandan;

import model.Jiandan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IJiandanService;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@Controller
@RequestMapping("jiandan")
public class JiandanController {
    @Resource
    private IJiandanService iJiandanService;

    @RequestMapping("insert")
    public void insertJiandan(){
//        System.out.println("hello");
        Jiandan jiandan = new Jiandan();
        jiandan.setName("test1");
        jiandan.setExt(1);
        jiandan.setMd5("dasdnkjankda");
        jiandan.setFullpath("test1");
        iJiandanService.insertJiandan(jiandan);
    }
}
