package com.example.ecommerce.service.impl;

import com.example.ecommerce.model.ChiTietDonHang;
import com.example.ecommerce.repository.ChiTietDonHangRepository;
import com.example.ecommerce.service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {

    @Autowired
    private ChiTietDonHangRepository repo;

    @Override
    public List<ChiTietDonHang> save(List<ChiTietDonHang> list) {
        return repo.saveAll(list);
    }
}
