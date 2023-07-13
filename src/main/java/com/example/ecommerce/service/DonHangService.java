package com.example.ecommerce.service;

import com.example.ecommerce.dto.SearchDonHangObject;
import com.example.ecommerce.model.DonHang;
import com.example.ecommerce.model.NguoiDung;
import org.springframework.data.domain.Page;

import java.text.ParseException;
import java.util.List;

public interface DonHangService {

    Page<DonHang> getAllDonHangByFilter(SearchDonHangObject object, int page) throws ParseException;

    DonHang update(DonHang dh);

    DonHang findById(Long id);

    Page<DonHang> findDonHangByShipper(SearchDonHangObject object, int page, int size, NguoiDung shipper) throws ParseException;

    DonHang save(DonHang dh);

    List<Object> layDonHangTheoThangVaNam();

    List<DonHang> findByTrangThaiDonHangAndShipper(String string, NguoiDung shipper);


    List<DonHang> getDonHangByNguoiDung(NguoiDung currentUser);

    int countByTrangThaiDonHang(String trangThaiDonHang);
}
