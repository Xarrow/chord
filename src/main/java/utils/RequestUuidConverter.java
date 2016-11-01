package utils;


import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Author zhangjian5
 * @Time 2016/10/21
 */
public class RequestUuidConverter extends ClassicConverter {

    HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        String uid ="";
        try {
            RequestContextHolder.getRequestAttributes().getAttribute("", RequestAttributes.SCOPE_GLOBAL_SESSION);
            if(RequestContextHolder.getRequestAttributes().getAttribute("MYREQUEST_UID",0)!=null) {
                uid = " -- " + RequestContextHolder.getRequestAttributes().getAttribute("MYREQUEST_UID",0);
            }
        }catch (Exception e){}
        return "uid";
    }
}
