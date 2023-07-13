package com.example.ecommerce.service;

import com.example.ecommerce.model.DanhMuc;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DanhMucService {

    Page<DanhMuc> getAllDanhMucForPageable(int page, int size);

    List<DanhMuc> getAllDanhMuc();

    DanhMuc getDanhMucById(Long id);

    DanhMuc save(DanhMuc d);

    DanhMuc update(DanhMuc d);

    void deleteById(Long id);
}
