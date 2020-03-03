package com.bin.controller;

import com.bin.model.Guest;
import com.bin.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 业务控制类 返回视图
 *
 * @RequestMapping("/guest")
 * 放在类上面，代表类里面的方法是以此开头的
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model){
        List<Guest> list = guestService.list();
        model.addAttribute("guestList",list);
        return "list";
    }
}
