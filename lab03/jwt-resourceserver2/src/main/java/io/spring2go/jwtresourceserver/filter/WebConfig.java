package io.spring2go.jwtresourceserver.filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * @author : skyji
 * @date Date : 2021-03-11 15:25
 * @Description: TODO
 */
@Configuration
public class WebConfig  {
    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        MyFilter myFilter = new MyFilter();
        registrationBean.setFilter(myFilter);
        ArrayList<String> urls = new ArrayList<>();
        urls.add("/*");//配置过滤规则
        registrationBean.setUrlPatterns(urls);
        return registrationBean;
    }
}
