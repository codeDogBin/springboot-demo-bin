package com.bin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ConfigurationProperties
 * 声明这是一个配置文件对应的类
 * prefix前缀指向配置文件中的一级目录
 */
@ConfigurationProperties(prefix="food")
@Data
public class FoodConfig {
    private String rice;
    private String meat;
    private String[] sauce;
}
