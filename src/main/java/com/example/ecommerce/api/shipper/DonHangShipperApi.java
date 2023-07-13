package com.example.ecommerce.api.shipper;

import com.example.ecommerce.dto.CapNhatDonHangShipper;
import com.example.ecommerce.dto.SearchDonHangObject;
import com.example.ecommerce.model.ChiTietDonHang;
import com.example.ecommerce.model.DonHang;
import com.example.ecommerce.model.NguoiDung;
import com.example.ecommerce.service.DonHangService;
import com.example.ecommerce.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/shipper/don-hang")
public class DonHangShipperApi {

    @Autowired
    private DonHangService donHangService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @GetMapping("/all")
    public Page<DonHang> getDonHangByFilter(@RequestParam(defaultValue = "1") int page, @RequestParam String trangThai,
                                            @RequestParam String tuNgay, @RequestParam String denNgay, @RequestParam Long idShipper)
            throws ParseException {

        SearchDonHangObject object = new SearchDonHangObject();
        object.setDenNgay(denNgay);
        object.setTrangThaiDon(trangThai);
        object.setTuNgay(tuNgay);

        NguoiDung shipper = nguoiDungService.findById(idShipper);
        Page<DonHang> listDonHang = donHangService.findDonHangByShipper(object, page, 6, shipper);
        return listDonHang;
    }

    @GetMapping("/{id}")
    public DonHang getDonHangById(@PathVariable Long id) {
        return donHangService.findById(id);
    }

    @PostMapping("/update")
    public void capNhatTrangThaiDonHang(@RequestBody CapNhatDonHangShipper capNhatDonHangShipper) {
        DonHang donHang = donHangService.findById(capNhatDonHangShipper.getIdDonHang());

        for (ChiTietDonHang chiTiet : donHang.getDanhSachChiTiet()) {
            for (CapNhatDonHangShipper.CapNhatChiTietDon chiTietCapNhat : capNhatDonHangShipper
                    .getDanhSachCapNhatChiTietDon()) {
                if (chiTiet.getId() == chiTietCapNhat.getIdChiTiet()) {
                    chiTiet.setSoLuongNhanHang(chiTietCapNhat.getSoLuongNhanHang());
                }
            }
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            String dateStr = format.format(new Date());
            Date date = format.parse(dateStr);
            donHang.setNgayNhanHang(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        donHang.setTrangThaiDonHang("Chờ duyệt");

        String ghiChu = capNhatDonHangShipper.getGhiChuShipper();

        if (!ghiChu.equals("")) {
            donHang.setGhiChu("Ghi chú shipper: \n" + capNhatDonHangShipper.getGhiChuShipper());
        }
        donHangService.save(donHang);

    }
}
