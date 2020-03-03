package com.bin.service;

import com.bin.mapper.GuestMapper;
import com.bin.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PrivateKey;
import java.util.List;

public interface GuestService {


    List<Guest> list();

}
