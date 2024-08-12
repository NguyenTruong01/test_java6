/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author truon
 */
@Entity
public class LoaiMayTinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loai_id;
    private String ten_loai;

    public LoaiMayTinh() {
    }

    public LoaiMayTinh(Long loai_id, String ten_loai) {
        this.loai_id = loai_id;
        this.ten_loai = ten_loai;
    }

    public Long getLoai_id() {
        return loai_id;
    }

    public void setLoai_id(Long loai_id) {
        this.loai_id = loai_id;
    }

    public String getTen_loai() {
        return ten_loai;
    }

    public void setTen_loai(String ten_loai) {
        this.ten_loai = ten_loai;
    }
    
}
