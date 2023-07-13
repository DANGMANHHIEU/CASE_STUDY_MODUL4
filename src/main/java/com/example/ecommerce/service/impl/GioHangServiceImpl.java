package com.example.ecommerce.service.impl;

import com.example.ecommerce.model.GioHang;
import com.example.ecommerce.model.NguoiDung;
import com.example.ecommerce.repository.GioHangRepository;
import com.example.ecommerce.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GioHangServiceImpl implements GioHangService {

    @Autowired
    private GioHangRepository repo;

    @Override
    public GioHang getGioHangByNguoiDung(NguoiDung n) {
        return repo.findByNguoiDung(n);
    }

    @Override
    public GioHang save(GioHang g) {
        return repo.save(g);
    }

}
