package controller.jiandan;

import dto.JiandanQueryDto;
import dto.JiandanResponseDto;
import exception.InterestExcetion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IJiandanService;
import test.CacheTestComponent;
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

    @RequestMapping("/query")
    public ResponseVo insertJiandan(JiandanQueryDto jiandanQueryDto) {
        ResponseVo responseVo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE);
        try {
            JiandanResponseDto jiandanResponseDto = iJiandanService.selectJiandanByLimit(jiandanQueryDto);
            responseVo = ResponseUtil.buildVoBySuccessResult(true, jiandanResponseDto);
        } catch (InterestExcetion ex) {
            responseVo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE, ex.getCause());
            logger.error("查询jiandan接口异常:[{}]", String.valueOf(ex.getCause()));
        } finally {
            return responseVo;
        }

    }

    @Autowired
    private CacheTestComponent cacheTestComponent;

//    private JiandanService jiandanService;

    @RequestMapping("/test")
    public ResponseVo testJiandan(Integer id) {
        ResponseVo responseVo = ResponseUtil.buildVoBySuccessResult(true,
                (cacheTestComponent.getJidanByIdCache(id)));

        return responseVo;
    }
}
