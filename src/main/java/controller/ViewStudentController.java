package controller;

import model.StudentBaseInfoModel;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.IStudentBaseService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author :zhang
 * @Time :2016/8/5.
 */
@Controller
@RequestMapping(value = "/view/cslg")
public class ViewStudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViewStudentController.class);
    @Autowired
    private IStudentBaseService iStudentBaseService;

    /**
     * 视图
     */
    @RequestMapping(value = "/xh/{xh}", method = RequestMethod.GET)
    public ModelAndView querySingleStudentByXh2(@PathVariable String xh,
                                                HttpServletRequest request,
                                                HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        Base64 base64 = new Base64();
        StudentBaseInfoModel studentBaseInfoModel = iStudentBaseService.querySingleStudentByXh(xh);
        modelAndView.setViewName("/views/index");
        if (null == studentBaseInfoModel) {
            modelAndView.addObject("notfound", "NOT FOUND!");
            return modelAndView;
        }
        modelAndView.addObject("studentBaseInfo", studentBaseInfoModel);
        modelAndView.addObject("zp", base64.encodeToString(studentBaseInfoModel.getZp()));
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/photo/{xh}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  ResponseEntity<StudentBaseInfoModel> testPhoto( @PathVariable String xh, HttpServletResponse response) throws IOException{
        StudentBaseInfoModel studentBaseInfoModel = iStudentBaseService.querySingleStudentByXh(xh);
        InputStream is = new ByteArrayInputStream(studentBaseInfoModel.getZp());

        ResponseEntity<StudentBaseInfoModel> responseEntity = new ResponseEntity<StudentBaseInfoModel>(studentBaseInfoModel,
                HttpStatus.OK);
        return responseEntity;
    }
}

