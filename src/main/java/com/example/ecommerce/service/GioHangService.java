package com.example.ecommerce.service;

import com.example.ecommerce.model.GioHang;
import com.example.ecommerce.model.NguoiDung;

public interface GioHangService {

    GioHang getGioHangByNguoiDung(NguoiDung n);

    GioHang save(GioHang g);
}
