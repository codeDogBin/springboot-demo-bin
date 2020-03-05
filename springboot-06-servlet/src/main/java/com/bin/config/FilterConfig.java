package com.bin.config;

import com.bin.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean=
                new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
//        filterFilterRegistrationBean.setOrder(1);设置优先级
        return filterFilterRegistrationBean;
    }
}
