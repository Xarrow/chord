package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Author ZhangJian
 * Time 2017/1/19
 */
public class MyInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    /**
     * 在请求之前拦截，返回true则进入请求Controller
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        logger.info("客户端 - [" + request.getRemoteAddr() + "] - " +
                "请求url - [" + request.getRequestURI() + "] " +
                "请求参数 - [" + request.getQueryString() + "]");
        return true;
    }

    /**
     * 在业务处理器处理请求执行完成后，在返回试图前拦截
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {

        if (request.getRequestURL().indexOf("api") > 0) {
            System.out.printf("你访问的是API接口");
        }
    }
}
