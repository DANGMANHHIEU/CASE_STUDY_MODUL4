package com.example.ecommerce.repository;

import com.example.ecommerce.model.GioHang;
import com.example.ecommerce.model.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangRepository extends JpaRepository<GioHang, Long> {

    GioHang findByNguoiDung(NguoiDung n);

}
