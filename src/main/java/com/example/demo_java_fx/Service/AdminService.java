package com.example.demo_java_fx.Service;

import com.example.demo_java_fx.Service.impl.AdminServiceImpl;
import com.example.demo_java_fx.dto.AdminDTO;

public interface AdminService{
    boolean saveAdmin (AdminDTO adminDto);
}
