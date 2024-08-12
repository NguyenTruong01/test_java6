

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test2.Service;

import com.example.test2.Model.LoaiMayTinh;
import com.example.test2.Model.MayTinh;
import com.example.test2.Repository.loaiMayTinhRepository;
import com.example.test2.Repository.mayTinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author truon
 */
@Service
public class mayTinhService {
    @Autowired
    mayTinhRepository repository;
    @Autowired
    loaiMayTinhRepository tinhRepository;
    public Page<MayTinh>  phantrang(Pageable pageable){
        return  repository.findAll(pageable);
    }
    public MayTinh xoa(Long id){
    MayTinh mt=   repository.findById(id).orElseThrow();
       repository.delete(mt);
       return mt;
    }
    public void them(MayTinh mt){
        repository.save(mt);
    }
    public void sua(Long id,MayTinh mayTinh){
        MayTinh mt = repository.findById(id).orElseThrow();
        LoaiMayTinh lmt = tinhRepository.findById(mt.getLmayTinh().getLoai_id()).get();
        mt.setGia(mayTinh.getGia());
        mt.setLmayTinh(lmt);
        mt.setTen_may(mayTinh.getTen_may());
        repository.save(mt);
    }
}
