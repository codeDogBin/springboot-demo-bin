package com.bin.controller;

import com.bin.bean.Food;
import com.bin.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 发送json格式用的controller
 * @controller+@ResponseBody
 */
@RestController
public class JsonController {
    /**
     * food.rice=rice
     * food.meat=meat
     * @Value 通过${}结构获取配置文件中的值
     */

//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    /**
     * 通过spring的自动注入将配置类注入到当前类中
      */
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
