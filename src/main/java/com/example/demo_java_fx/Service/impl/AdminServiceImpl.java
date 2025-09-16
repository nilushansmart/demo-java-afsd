package com.example.demo_java_fx.Service.impl;

import com.example.demo_java_fx.Service.AdminService;
import com.example.demo_java_fx.db.Database;
import com.example.demo_java_fx.dto.AdminDTO;
import com.example.demo_java_fx.entity.Admin;

public class AdminServiceImpl implements AdminService {

    @Override
    public boolean saveAdmin(AdminDTO adminDto) {
        Database.admins.add(new Admin(adminDto.getUsername(), adminDto.getPassword()));
        return true;
    }
}
