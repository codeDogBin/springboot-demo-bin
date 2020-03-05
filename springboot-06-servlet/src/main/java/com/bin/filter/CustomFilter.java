package com.bin.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * web.xml
 * <filter>
 *     <filter-name></filter-name>
 *     <filter-class></filter-class>
 * </filter>
 * <filter-mapping>
 *     <filter-name></filter-name>
 *     <url-pattern></url-pattern>
 * </filter-mapping>
 *
 */

public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter初始化方法");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomFilter执行方法");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter销毁方法");
    }
}
