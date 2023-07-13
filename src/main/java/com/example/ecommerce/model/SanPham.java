package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenSanPham;
    private Long donGia;
    private String thongTinChung;
    @Transient
    @JsonIgnore
    private MultipartFile hinhAnh;

    @ManyToOne
    @JoinColumn(name = "ma_danh_muc")
    private DanhMuc danhMuc;

    @ManyToOne
    @JoinColumn(name = "ma_hang_sx")
    private HangSanXuat hangSanXuat;

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }


    public String getThongTinChung() {
        return thongTinChung;
    }

    public void setThongTinChung(String thongTinChung) {
        this.thongTinChung = thongTinChung;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }


    public MultipartFile getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(MultipartFile hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

}
