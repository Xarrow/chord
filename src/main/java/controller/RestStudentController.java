package controller;


import model.StudentBaseInfoModel;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.IStudentBaseService;
import utils.ResponseUtil;
import utils.ResponseVo;
import utils.ResultCode;

/**
 * @Author zhang
 * @Time 2016/7/31
 */
@RestController
//use @RestController to instead of @Controller + @ResponseBody
@RequestMapping(value = "/rest/cslg")
public class RestStudentController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RestStudentController.class);

    @Autowired
    private IStudentBaseService iStudentBaseService;

    @RequestMapping(value = "/xh/get/{xh}", method = RequestMethod.GET)
    public ResponseVo querySingleStudentByXh(@PathVariable String xh) {
        ResponseVo vo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE);
        StudentBaseInfoModel studentBaseInfoModel = iStudentBaseService.querySingleStudentByXh(xh);
        if (null != studentBaseInfoModel) {
            vo = ResponseUtil.buildVoByResultCode(true, ResultCode.SUCCESS, studentBaseInfoModel);
        }
        return vo;
    }

    /**
     * 两种方式获取参数
     *
     * @param xh 学号
     * @param studentBaseInfo
     * @return
     */
    @RequestMapping(value = "/xh/post", method = RequestMethod.POST)
    public ResponseVo querySingleStudentByPostXh(@RequestParam("xh") String xh, StudentBaseInfoModel studentBaseInfo) {
        ResponseVo vo = ResponseUtil.buildVoByResultCode(false, ResultCode.FAILURE);
        StudentBaseInfoModel studentBaseInfoModel = null;
        if (null == studentBaseInfo.getXh()) {
            studentBaseInfoModel = iStudentBaseService.querySingleStudentByXh(xh);
        } else {
            studentBaseInfoModel = iStudentBaseService.querySingleStudentByXh(studentBaseInfo.getXh());
        }
        if (null != studentBaseInfoModel) {
            vo = ResponseUtil.buildVoByResultCode(true, ResultCode.SUCCESS, studentBaseInfoModel);
        }
        return vo;
    }


}
