package com.bin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Configuration
 * 声明这是一个配置类，在spring中可以替代xml文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是个配置文件类 并且声明前缀
 * @PropertySource()
 */
@Configuration
@ConfigurationProperties(prefix ="vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
