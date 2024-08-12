/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test2.Controller;

import com.example.test2.Model.MayTinh;
import com.example.test2.Repository.mayTinhRepository;
import com.example.test2.Service.mayTinhService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author truon
 */
@RestController
@RequestMapping("/MayTinh")
public class mayTinhController {
    @Autowired
    mayTinhService service;
    @Autowired
    mayTinhRepository d;
    @GetMapping("/lst")
    public Page<MayTinh> hienthi(@RequestParam(defaultValue = "0")int trang,@RequestParam(defaultValue = "5") int soluong){
        Pageable pageable = PageRequest.of(trang, soluong);
        return service.phantrang(pageable);
        
    }
    @DeleteMapping("/xoa/{id}")
    public MayTinh xoa(@PathVariable("id") Long id){
        return service.xoa(id);
    }
    @PostMapping("/add")
    public String add(@RequestBody @Valid MayTinh mt,BindingResult bindingResult){
        List<FieldError>  fieldError = bindingResult.getFieldErrors();
        for (FieldError fieldError1 : fieldError) {
            return  fieldError1.getDefaultMessage();
        }
            service.them(mt);
        return "thanh cong";
       
    }
    @PutMapping("/update/{id}")
    public String sua(@PathVariable("id") Long id,@RequestBody MayTinh mt){
    service.sua(id, mt);
        return "thanh cong";
    }
}
