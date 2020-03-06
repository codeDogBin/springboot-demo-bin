package com.bin.service;

import com.bin.model.Guest;

import java.util.List;

public interface GuestService {


    List<Guest> list();

    Guest getGuestById(int Id);

    /**
     * 使用缓存时 会吧方法的返回值放入缓存中
     * 此时的返回值是特殊的 不是原来的void or int
     * @return
     */
    Guest updateGuest(Guest guest  );

    void deleteGuest(int id);

    void deleteAllGuest();
}
