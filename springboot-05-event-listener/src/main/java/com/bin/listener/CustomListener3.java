package com.bin.listener;

import com.bin.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 方式三：
 * 不需要事先applicationListener接口
 * 但是先声明当前类的@Component组件
 * 通过在方法上增加@EventListener注解
 * 监听的时间是方法的参数
 */
@Component
public class CustomListener3 {
    @EventListener
    public void eventListener3(CustomEvent event){
        event.printMessage("CustomListener3监听到了：");
    }
}
