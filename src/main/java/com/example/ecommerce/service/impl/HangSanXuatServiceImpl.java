package com.example.ecommerce.service.impl;

import com.example.ecommerce.model.HangSanXuat;
import com.example.ecommerce.repository.HangSanXuatRepository;
import com.example.ecommerce.service.HangSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangSanXuatServiceImpl implements HangSanXuatService {

    @Autowired
    private HangSanXuatRepository repo;

    @Override
    public List<HangSanXuat> getALlHangSX() {
        return repo.findAll();
    }

    @Override
    public HangSanXuat getHSXById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public HangSanXuat save(HangSanXuat h) {
        return repo.save(h);
    }

    @Override
    public HangSanXuat update(HangSanXuat h) {
        return repo.save(h);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Page<HangSanXuat> getALlHangSX(int page, int size) {
        return repo.findAll(PageRequest.of(page, size));
    }

}
