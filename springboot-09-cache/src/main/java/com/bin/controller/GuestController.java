package com.bin.controller;

import com.bin.model.Guest;
import com.bin.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务控制类 返回视图
 *
 * @RequestMapping("/guest")
 * 放在类上面，代表类里面的方法是以此开头的
 */
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("")
    public List<Guest> list(){
        List<Guest> list = guestService.list();
        return list;
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable(name = "id") int id){
        Guest guest = guestService.getGuestById(id);
        return guest;
    }

    @GetMapping("/update")
    public Guest UpdateGuest(Integer id,String name,String role){
        Guest newGuest = new Guest(id, name, role);
        guestService.updateGuest(newGuest);
        return newGuest;
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable(name= "id") int id){
        if(id!=0) {
            guestService.deleteGuest(id);
        }else {
            guestService.deleteAllGuest();
        }
        return "success";
    }
}
