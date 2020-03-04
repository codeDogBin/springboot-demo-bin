package com.bin;

import com.bin.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {

    public static void main(String[] args) {
        //创建一个validator实例 普通模式
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //ch创建一个快速失败模式的实例
        Validator validator1FastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
        //创建一个不符合要求的bean
        Guest guest = new Guest("","");
        //开始验证  接受验证结果
        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
        Set<ConstraintViolation<Guest>> violationSetFailset = validator1FastFail.validate(guest);
        //普通模式验证结果
        for(ConstraintViolation violation:violationSet){
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }
        System.out.println("-------------------");
        //快速失败模式验证结果
        for(ConstraintViolation violation:violationSetFailset){
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }
    }
}
