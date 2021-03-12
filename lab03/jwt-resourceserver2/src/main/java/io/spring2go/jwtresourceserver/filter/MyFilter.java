package io.spring2go.jwtresourceserver.filter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
/**
 * @author : skyji
 * @date Date : 2021-03-11 15:24
 * @Description: TODO
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter.init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("time filter start");
        long start = new Date().getTime();
        filterChain.doFilter(request,response);
        System.out.println(new Date().getTime()-start);
        System.out.println("time filter end");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter.destroy");
    }
}
