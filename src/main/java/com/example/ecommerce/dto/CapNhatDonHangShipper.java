package com.example.ecommerce.dto;

import java.util.List;

public class CapNhatDonHangShipper {
	
	private Long idDonHang;
	private String ghiChuShipper;
	private List<CapNhatChiTietDon> danhSachCapNhatChiTietDon;


	public static class CapNhatChiTietDon {
		private Long idChiTiet;
		private int soLuongNhanHang;

		public Long getIdChiTiet() {
			return idChiTiet;
		}

		public void setIdChiTiet(Long idChiTiet) {
			this.idChiTiet = idChiTiet;
		}

		public int getSoLuongNhanHang() {
			return soLuongNhanHang;
		}

		public void setSoLuongNhanHang(int soLuongNhanHang) {
			this.soLuongNhanHang = soLuongNhanHang;
		}
	}

	public String getGhiChuShipper() {
		return ghiChuShipper;
	}

	public void setGhiChuShipper(String ghiChuShipper) {
		this.ghiChuShipper = ghiChuShipper;
	}

	public List<CapNhatChiTietDon> getDanhSachCapNhatChiTietDon() {
		return danhSachCapNhatChiTietDon;
	}

	public void setDanhSachCapNhatChiTietDon(List<CapNhatChiTietDon> danhSachCapNhatChiTietDon) {
		this.danhSachCapNhatChiTietDon = danhSachCapNhatChiTietDon;
	}

	public Long getIdDonHang() {
		return idDonHang;
	}

	public void setIdDonHang(Long idDonHang) {
		this.idDonHang = idDonHang;
	}


}
