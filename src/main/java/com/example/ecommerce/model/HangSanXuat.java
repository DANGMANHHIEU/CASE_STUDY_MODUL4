package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class HangSanXuat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message="Tên hãng sản xuất không được trống")
	private String tenHangSanXuat;

	@JsonIgnore
	@OneToMany(mappedBy = "hangSanXuat")
	private List<SanPham> listSanPham;

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
