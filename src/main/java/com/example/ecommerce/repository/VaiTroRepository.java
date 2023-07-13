package com.example.ecommerce.repository;

import com.example.ecommerce.model.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

    VaiTro findByTenVaiTro(String tenVaiTro);
}
