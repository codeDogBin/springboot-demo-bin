package com.bin;

import com.bin.config.FoodConfig;
import com.bin.config.LengfenConfig;
import com.bin.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明我们的入口类 并且声明springboot项目的
 * @EnableConfigurationProperties
 * 告诉主程序要自动引入配置文件
 * 配置文件对应的类将作为它的参数
 */
@SpringBootApplication
@EnableConfigurationProperties({VegetablesConfig.class,FoodConfig.class, LengfenConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法 启动springboot程序
        //方法的参数 程序的入口类 main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
