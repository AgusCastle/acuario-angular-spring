package com.example.acuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acuario.entity.TrabajosEntity;

@Repository
public interface TrabajoRepository extends JpaRepository<TrabajosEntity, Integer> {
    
}
