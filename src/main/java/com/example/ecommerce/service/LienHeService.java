package com.example.ecommerce.service;

import com.example.ecommerce.dto.SearchLienHeObject;
import com.example.ecommerce.model.LienHe;
import org.springframework.data.domain.Page;

import java.text.ParseException;

public interface LienHeService {

    Page<LienHe> getLienHeByFilter(SearchLienHeObject object, int page) throws ParseException;

    LienHe findById(Long id);

    LienHe save(LienHe lh);

    int countByTrangThai(String trangThai);

}
