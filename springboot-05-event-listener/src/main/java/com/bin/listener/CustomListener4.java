package com.bin.listener;

import com.bin.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4  implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener4监听到了：");
    }
}
