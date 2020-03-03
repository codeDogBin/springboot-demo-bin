package com.bin.service;

import com.bin.mapper.GuestMapper;
import com.bin.mapper2.GuestMapper2;
import com.bin.model.Guest;
//import com.bin.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestMapper mapper;
    @Autowired
    private GuestMapper2 mapper2;
//    @Autowired
//    private TkGuestMapper tkGuestMapper;

    @Override
    public List<Guest> list() {
        return mapper.list();
    }

}
