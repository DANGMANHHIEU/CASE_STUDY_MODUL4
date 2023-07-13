package com.example.ecommerce.service;

import com.example.ecommerce.model.ChiMucGioHang;
import com.example.ecommerce.model.GioHang;
import com.example.ecommerce.model.SanPham;

import java.util.List;

public interface ChiMucGioHangService {

    List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);

    ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g);

    ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);

    void deleteChiMucGiohang(ChiMucGioHang c);

    void deleteAllChiMucGiohang(List<ChiMucGioHang> c);

}
