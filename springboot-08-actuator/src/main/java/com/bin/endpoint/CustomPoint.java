package com.bin.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 首先需要是一个组件
 * 然后通过@Endpoint 生命是一个端点  通过id来命名
 */
@Component
@Endpoint(id = "custom")
public class CustomPoint {

    /**
     * 端点访问时的处理方法，通过@ReadOperation注解查找
     * 注意需返回Json数据
     * @return
     */
    @ReadOperation
    @ResponseBody
    public Map<String,String> custom(){
        Map<String,String> result= new HashMap<>();
        result.put("name","hello custom and endPoi  nt");
        return  result;
    }
}
