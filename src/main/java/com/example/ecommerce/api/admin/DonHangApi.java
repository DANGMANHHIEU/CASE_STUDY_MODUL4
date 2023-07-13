package com.example.ecommerce.api.admin;

import com.example.ecommerce.dto.SearchDonHangObject;
import com.example.ecommerce.model.ChiTietDonHang;
import com.example.ecommerce.model.DonHang;
import com.example.ecommerce.model.SanPham;
import com.example.ecommerce.service.DonHangService;
import com.example.ecommerce.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/don-hang")
public class DonHangApi {

    @Autowired
    private DonHangService donHangService;

    @Autowired
    private NguoiDungService nguoiDungService;

    // lấy danh sách đơn hàng theo search object
    @GetMapping("/all")
    public Page<DonHang> getDonHangByFilter(@RequestParam(defaultValue = "1") int page, @RequestParam String trangThai,
                                            @RequestParam String tuNgay, @RequestParam String denNgay) throws ParseException {

        SearchDonHangObject object = new SearchDonHangObject();
        object.setDenNgay(denNgay);
        object.setTrangThaiDon(trangThai);
        object.setTuNgay(tuNgay);
        Page<DonHang> listDonHang = donHangService.getAllDonHangByFilter(object, page);
        return listDonHang;
    }

    @GetMapping("/{id}")
    public DonHang getDonHangById(@PathVariable Long id) {
        return donHangService.findById(id);
    }

    // phân công đơn hàng
    @PostMapping("/assign")
    public void phanCongDonHang(@RequestParam("shipper") String emailShipper,
                                @RequestParam("donHangId") Long donHangId) {
        DonHang dh = donHangService.findById(donHangId);
        dh.setTrangThaiDonHang("Đang giao");
        dh.setShipper(nguoiDungService.findByEmail(emailShipper));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            String dateStr = format.format(new Date());
            Date date = format.parse(dateStr);
            dh.setNgayGiaoHang(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        donHangService.save(dh);
    }

    // xác nhận hoàn thành đơn hàng
    @PostMapping("/update")
    public void xacNhanHoanThanhDon(@RequestParam("donHangId") Long donHangId,
                                    @RequestParam("ghiChu") String ghiChuAdmin) {
        DonHang dh = donHangService.findById(donHangId);

        for (ChiTietDonHang ct : dh.getDanhSachChiTiet()) {
            SanPham sp = ct.getSanPham();
//			sp.setDonViBan(sp.getDonViBan() + ct.getSoLuongNhanHang());
//			sp.setDonViKho(sp.getDonViKho() - ct.getSoLuongNhanHang() );
        }
        dh.setTrangThaiDonHang("Hoàn thành");
        String ghiChu = dh.getGhiChu();
        if (!ghiChuAdmin.equals("")) {
            ghiChu += "<br> Ghi chú admin:\n" + ghiChuAdmin;
        }
        dh.setGhiChu(ghiChu);
        donHangService.save(dh);
    }

    // xác nhận hoàn thành đơn hàng
    @PostMapping("/cancel")
    public void huyDonHangAdmin(@RequestParam("donHangId") Long donHangId) {
        DonHang dh = donHangService.findById(donHangId);
        dh.setTrangThaiDonHang("Đã bị hủy");
        donHangService.save(dh);
    }

    // lấy dữ liệu làm báo cáo thống kê
    @GetMapping("/report")
    public List<Object> test() {
        return donHangService.layDonHangTheoThangVaNam();
    }
}
