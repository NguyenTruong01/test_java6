/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test2.Repository;

import com.example.test2.Model.MayTinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author truon
 */
@Repository
public interface mayTinhRepository extends JpaRepository<MayTinh, Long>{
    
}
