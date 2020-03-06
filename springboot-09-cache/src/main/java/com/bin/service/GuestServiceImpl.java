package com.bin.service;

import com.bin.mapper.GuestMapper;
import com.bin.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "")
public  class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;


    @Override
    public List<Guest> list() {
        return mapper.list();
    }

    @Override
    @Cacheable(cacheNames = "guest",key = "#Id",condition ="#Id>1")
    public Guest getGuestById(int Id) {
        System.out.println("查询第"+Id+"位嘉宾");
        return mapper.getGuestById(Id);
    }

    /**
     * 设置key的值和cacheable保持一致
     * 方式一 拿到参数的id--key="#guest.id"
     * 方式二 拿到结果的id--key="#result.id"
     * @param guest
     * @return
     */
    @CachePut(cacheNames = "guests",key ="#guest.id",condition = "#guest.id>1")
    @Override
    public Guest updateGuest(Guest guest) {
        System.out.println("更新第"+guest.getId()+"位嘉宾");
        mapper.updateGuest(guest);
        return guest;
    }
    @CacheEvict(cacheNames = "guest",key="#id")
    @Override
    public void deleteGuest(int id) {
        System.out.println("删除第"+id+"位嘉宾");
        mapper.deleteGuest(id);
    }
    @CacheEvict(cacheNames = "guest",allEntries = true)
    @Override
    public void deleteAllGuest() {
        System.out.println("删除所有嘉宾");
        mapper.deleteAllGuest();
    }


}
