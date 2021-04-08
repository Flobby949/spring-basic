package top.flobby.boot.servlet.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/6
 * @description :
 */
//@WebFilter(filterName = "customFilter", urlPatterns = "/*")
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        log.info("过滤器被执行");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("过滤器被销毁");
    }
}
