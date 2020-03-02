package com.bin.service;

import com.bin.model.Guest;
import com.bin.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public  class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();
    }

}
