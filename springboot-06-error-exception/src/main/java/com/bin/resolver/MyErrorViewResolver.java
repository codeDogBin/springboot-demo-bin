package com.bin.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 需要是一个bean 能够被spring容器处理 才会生效
 */
@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if(status.equals(HttpStatus.NOT_FOUND)){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/resolver404");
            return modelAndView;
        }
        return null;
    }
}
