package com.bin.service;

import com.bin.bean.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    void addGuest(Guest guest);

    void update(Guest guest);

    Guest get(String name);

    void delete(String name);
}
