package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class GioHang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tong_tien;
	
	@OneToOne
	@JoinColumn(name = "ma_nguoi_dung")
	private NguoiDung nguoiDung;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTong_tien() {
		return tong_tien;
	}

	public void setTong_tien(String tong_tien) {
		this.tong_tien = tong_tien;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	
}
