package controller.jiandan;

import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IJiandanService;
import utils.ResponseUtil;
import utils.ResponseVo;
import utils.ResultCode;

import javax.annotation.Resource;

/**
 * @Author zhang
 * @Time 2016/11/24.
 */
@RestController
@RequestMapping("/jiandan/api")
public class JiandanRestController {

    private static final Logger logger = LoggerFactory.getLogger(JiandanRestController.class);

    @Resource
    private IJiandanService iJiandanService;


    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseVo insertJiandan(JiandanQueryDto jiandanQueryDto) {
        ResponseVo responseVo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE);
        try {
            JiandanResponseDto jiandanResponseDto = iJiandanService.selectJiandanByLimit(jiandanQueryDto);
            System.out.printf(jiandanResponseDto.toString());
            responseVo = ResponseUtil.buildVoBySuccessResult(true, jiandanResponseDto);
        } catch (Exception ex) {
            responseVo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE, ex.getCause());
            logger.error("查询jiandan接口异常:[{}]", ex);
        } finally {
            return responseVo;
        }

    }


    @RequestMapping("/test")
    public ResponseVo testJiandan(Integer id) {
        ResponseVo responseVo = ResponseUtil.buildVoBySuccessResult(true,
                (iJiandanService.selectById(id)));

        return responseVo;
    }
}
