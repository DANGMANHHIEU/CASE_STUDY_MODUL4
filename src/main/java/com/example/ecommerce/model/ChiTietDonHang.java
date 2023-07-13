package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ChiTietDonHang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="ma_san_pham")
	private SanPham sanPham;
	private Long donGia;
	private int soLuongDat;
	
	private int soLuongNhanHang;

	@ManyToOne
	@JoinColumn(name = "ma_don_hang")
	@JsonIgnore
	private DonHang donHang;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public Long getDonGia() {
		return donGia;
	}

	public void setDonGia(Long donGia) {
		this.donGia = donGia;
	}

	public int getSoLuongDat() {
		return soLuongDat;
	}

	public void setSoLuongDat(int soLuongDat) {
		this.soLuongDat = soLuongDat;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}
	
	
	public int getSoLuongNhanHang() {
		return soLuongNhanHang;
	}

	public void setSoLuongNhanHang(int soLuongNhanHang) {
		this.soLuongNhanHang = soLuongNhanHang;
	}

}
