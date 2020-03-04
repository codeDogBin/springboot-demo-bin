package com.bin.controller;
import com.bin.bean.Guest;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {
    /**
     * 直接用@Valid 直接放在bean前 用来校验他是否符合注解规则
     * @param guest
     * @return
     */
    @PostMapping("/add")
    public String add(@Valid Guest guest, BindingResult result) {
        if(result.getErrorCount()>0){
            StringBuffer stringBuffer = new StringBuffer();
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "success" ;
    }
}
