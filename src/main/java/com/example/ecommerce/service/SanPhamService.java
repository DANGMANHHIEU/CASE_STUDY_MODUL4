package com.example.ecommerce.service;

import com.example.ecommerce.dto.SanPhamDto;
import com.example.ecommerce.dto.SearchSanPhamObject;
import com.example.ecommerce.model.SanPham;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface SanPhamService {

    SanPham save(SanPhamDto sp);

    SanPham update(SanPhamDto sp);

    void deleteById(Long id);

    Page<SanPham> getAllSanPhamByFilter(SearchSanPhamObject object, int page, int limit);

    SanPham getSanPhamById(Long id);

    List<SanPham> getLatestSanPham();

    Iterable<SanPham> getSanPhamByTenSanPhamWithoutPaginate(SearchSanPhamObject object);

    Page<SanPham> getSanPhamByTenSanPham(SearchSanPhamObject object, int page, int resultPerPage);

    List<SanPham> getAllSanPhamByList(Set<Long> idList);

    Page<SanPham> getSanPhamByTenSanPhamForAdmin(String tenSanPham, int page, int size);

    Iterable<SanPham> getSanPhamByTenDanhMuc(String brand);

    public Page<SanPham> getSanPhamByBrand(SearchSanPhamObject object, int page, int resultPerPage);
}
