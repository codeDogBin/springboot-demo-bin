package com.bin.service;

import com.bin.bean.Guest;
import com.bin.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> list() {
        return dao.list();
    }

    @Override
    public void addGuest(Guest guest) {
        dao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public Guest get(String name) {
        return dao.get(name);
    }

    @Override
    public void delete(String name) {
        dao.delete(name);
    }
}
