package com.bin.controller;

import com.bin.bean.Food;
import com.bin.bean.Lengfen;
import com.bin.bean.Vegetables;
import com.bin.config.FoodConfig;
import com.bin.config.LengfenConfig;
import com.bin.config.VegetablesConfig;
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
        food.setSauce(foodConfig.getSauce());
        return food;
    }
    @Autowired
    private VegetablesConfig vegetablesConfig;
    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        vegetables.setPotato(vegetablesConfig.getPotato());
        return vegetables;
    }

    @Autowired
    private LengfenConfig lengfenConfig;
    @RequestMapping("/lengfen")
    public Lengfen lengfen(){
        Lengfen lengfen = new Lengfen();
        lengfen.setFood(lengfenConfig.getFood());
        lengfen.setSauce(lengfenConfig.getSauce());
        return lengfen;
    }
}
