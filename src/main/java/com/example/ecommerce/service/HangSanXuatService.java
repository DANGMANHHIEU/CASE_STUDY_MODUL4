package com.example.ecommerce.service;

import com.example.ecommerce.model.HangSanXuat;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HangSanXuatService {

    List<HangSanXuat> getALlHangSX();

    Page<HangSanXuat> getALlHangSX(int page, int size);

    HangSanXuat getHSXById(Long id);

    HangSanXuat save(HangSanXuat h);

    HangSanXuat update(HangSanXuat h);

    void deleteById(Long id);
}
