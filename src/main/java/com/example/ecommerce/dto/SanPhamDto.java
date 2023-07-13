package com.example.ecommerce.dto;


import org.springframework.web.multipart.MultipartFile;

public class SanPhamDto {

	private String id;

	private String tenSanPham;
	private String donGia;
	private String thongTinChung;
	private Long danhMucId;
	private Long nhaSXId;
	
	private MultipartFile hinhAnh;

	public MultipartFile getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(MultipartFile hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getDonGia() {
		return donGia;
	}

	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}


	public String getThongTinChung() {
		return thongTinChung;
	}

	public void setThongTinChung(String thongTinChung) {
		this.thongTinChung = thongTinChung;
	}



	public Long getDanhMucId() {
		return danhMucId;
	}

	public void setDanhMucId(Long danhMucId) {
		this.danhMucId = danhMucId;
	}

	public Long getNhaSXId() {
		return nhaSXId;
	}

	public void setNhaSXId(Long nhaSXId) {
		this.nhaSXId = nhaSXId;
	}


	@Override
	public String toString() {
		return "SanPhamDto{" +
				"id='" + id + '\'' +
				", tenSanPham='" + tenSanPham + '\'' +
				", donGia='" + donGia + '\'' +
				", thongTinChung='" + thongTinChung + '\'' +
				", danhMucId=" + danhMucId +
				", nhaSXId=" + nhaSXId +
				", hinhAnh=" + hinhAnh +
				'}';
	}
}
