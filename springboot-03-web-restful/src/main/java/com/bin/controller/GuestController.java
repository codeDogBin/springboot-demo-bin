package com.bin.controller;

import com.bin.bean.Guest;
import com.bin.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @PostMapping()
    public String add(Guest guest){
        guestService.addGuest(guest);
        return "redirect:/guest";
    }

    /**
     * 通过/guest/toUpdate/{name}格式的url映射到此方法
     * 其中的那么属性值 通过注解@PathVariable("name")映射到方法属性中
     * 其中的name代表去url中获取url中查找的属性值
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }
    @PutMapping()
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest ";
    }

}
