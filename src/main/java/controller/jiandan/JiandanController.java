package controller.jiandan;

import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import model.Jiandan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IJiandanService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@Controller
@RequestMapping("/jiandan")
public class JiandanController {
    @Resource
    private IJiandanService iJiandanService;

    @ResponseBody
    @RequestMapping("/query/{start}/{offset}")
    public JiandanResponseDto insertJiandan(@PathVariable("start")Integer start,
                                            @PathVariable("offset")Integer offset){

        JiandanQueryDto jiandanQueryDto = new JiandanQueryDto();
        jiandanQueryDto.setStart(start);
        jiandanQueryDto.setOffset(offset);
        return iJiandanService.selectJiandanByLimit(jiandanQueryDto);
    }
}
