/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author truon
 */
@Entity
public class MayTinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long may_id;
    @NotBlank(message = "tên không được để trống")
    private String ten_may;
    @Min(value = 0, message = "gia lon hon 0")
    private Float gia;
    @ManyToOne
    @JoinColumn(name = "loai_id")
    private LoaiMayTinh lmayTinh;

    public MayTinh() {
    }

    public MayTinh(Long may_id, String ten_may, Float gia, LoaiMayTinh lmayTinh) {
        this.may_id = may_id;
        this.ten_may = ten_may;
        this.gia = gia;
        this.lmayTinh = lmayTinh;
    }

    public Long getMay_id() {
        return may_id;
    }

    public void setMay_id(Long may_id) {
        this.may_id = may_id;
    }

    public String getTen_may() {
        return ten_may;
    }

    public void setTen_may(String ten_may) {
        this.ten_may = ten_may;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public LoaiMayTinh getLmayTinh() {
        return lmayTinh;
    }

    public void setLmayTinh(LoaiMayTinh lmayTinh) {
        this.lmayTinh = lmayTinh;
    }
    
}
