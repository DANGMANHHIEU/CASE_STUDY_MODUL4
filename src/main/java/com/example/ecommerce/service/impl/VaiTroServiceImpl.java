package com.example.ecommerce.service.impl;

import com.example.ecommerce.model.VaiTro;
import com.example.ecommerce.repository.VaiTroRepository;
import com.example.ecommerce.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaiTroServiceImpl implements VaiTroService {


    @Autowired
    private VaiTroRepository repo;

    @Override
    public VaiTro findByTenVaiTro(String tenVaiTro) {
        return repo.findByTenVaiTro(tenVaiTro);
    }

    @Override
    public List<VaiTro> findAllVaiTro() {
        return repo.findAll();
    }


}
