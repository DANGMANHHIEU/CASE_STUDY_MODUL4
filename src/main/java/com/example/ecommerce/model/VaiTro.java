package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VaiTro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tenVaiTro;

	@JsonIgnore
	@ManyToMany(mappedBy = "vaiTro")
	private Set<NguoiDung> nguoiDung;

	public String getTenVaiTro() {
		return tenVaiTro;
	}

	public void setTenVaiTro(String tenVaiTro) {
		this.tenVaiTro = tenVaiTro;
	}

	public Set<NguoiDung> getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(Set<NguoiDung> nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	
	public VaiTro(String tenVaiTro) {
		this.tenVaiTro = tenVaiTro;
	}
	
	public VaiTro() {
		// TODO Auto-generated constructor stub
	}
}
