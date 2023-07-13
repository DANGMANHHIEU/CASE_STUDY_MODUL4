package com.example.ecommerce.repository;

import com.example.ecommerce.model.ChiMucGioHang;
import com.example.ecommerce.model.GioHang;
import com.example.ecommerce.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long> {

    ChiMucGioHang findBySanPhamAndGioHang(SanPham sp, GioHang g);

    List<ChiMucGioHang> findByGioHang(GioHang g);
}
