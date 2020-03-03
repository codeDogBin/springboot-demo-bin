package com.bin.mapper;

import com.bin.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@Mapper
public interface GuestMapper {

    @Select("select name,role from guest")
    List<Guest> list();
}
