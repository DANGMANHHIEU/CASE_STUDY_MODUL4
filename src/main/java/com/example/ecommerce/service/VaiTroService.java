package com.example.ecommerce.service;

import com.example.ecommerce.model.VaiTro;

import java.util.List;

public interface VaiTroService {

    VaiTro findByTenVaiTro(String tenVaiTro);

    List<VaiTro> findAllVaiTro();
}
