package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.INexusService;

import javax.servlet.http.HttpServletResponse;

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
        modelAndView.addObject("mysqlStr", iNexusService.someTries().toString());
        modelAndView.setViewName("views/nexus");
        return modelAndView;
    }

    @RequestMapping(value = "/nexus/image")
    public ResponseEntity<byte[]> nexusImage() throws Throwable {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.IMAGE_JPEG);
            httpHeaders.setAccessControlAllowOrigin("fuck");


            Resource resource = new ClassPathResource("img/060912130.png");
            byte[] data = FileCopyUtils.copyToByteArray(resource.getInputStream());
            return new ResponseEntity<byte[]>(data,httpHeaders,HttpStatus.OK);
        }catch (Exception ex) {
            return  new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/nexus/video")
    public String nexusVideo(){
        return "views/nexus";
    }
}
