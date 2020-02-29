package com.bin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "lengfen")
public class LengfenConfig {
    private String food;
    private String sauce;
}
