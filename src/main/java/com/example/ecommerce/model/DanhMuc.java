package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class DanhMuc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Tên danh mục không được trống")
	private String tenDanhMuc;

	@JsonIgnore
	@OneToMany(mappedBy = "danhMuc")
	private List<SanPham> listSanPham;
	
//	public DanhMuc(long id, String tenDanhMuc) {
//		this.id = id;
//		this.tenDanhMuc = tenDanhMuc;
//	}
	

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
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
