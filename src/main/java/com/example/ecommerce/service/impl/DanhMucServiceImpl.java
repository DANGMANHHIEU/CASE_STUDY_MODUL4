package com.example.ecommerce.service.impl;

import com.example.ecommerce.model.DanhMuc;
import com.example.ecommerce.repository.DanhMucRepository;
import com.example.ecommerce.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DanhMucServiceImpl implements DanhMucService {

    @Autowired
    private DanhMucRepository repo;

    @Override
    public DanhMuc save(DanhMuc d) {
        return repo.save(d);
    }

    @Override
    public DanhMuc update(DanhMuc d) {
        return repo.save(d);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Page<DanhMuc> getAllDanhMucForPageable(int page, int size) {
        return repo.findAll(PageRequest.of(page, size));
    }

    @Override
    public DanhMuc getDanhMucById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<DanhMuc> getAllDanhMuc() {
        return repo.findAll();
    }

}
