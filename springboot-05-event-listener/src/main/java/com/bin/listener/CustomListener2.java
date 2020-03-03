package com.bin.listener;

import com.bin.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 方式二:通过component声明这个一个需要启动的监听
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener2监听到了：");
    }
}
