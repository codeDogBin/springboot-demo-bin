package com.bin.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }
    public void printMessage(String msg){
        System.out.println("触发了事件："+msg);
    }
}
