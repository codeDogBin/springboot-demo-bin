package com.bin.listener;

import com.bin.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener1监听到了：");
    }
}
