package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Author ZhangJian
 * Time 2017/2/13
 */
public class MyFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MyHttpServletRequestWrapper r = new MyHttpServletRequestWrapper((HttpServletRequest) servletRequest);

        logger.info("session --> " + ((HttpServletRequest) servletRequest).getSession().getId());
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        session.setAttribute("id", "fi");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    private class MyHttpServletRequestWrapper extends HttpServletRequestWrapper {
        public MyHttpServletRequestWrapper(HttpServletRequest request) {
            super(request);
        }
    }
}
