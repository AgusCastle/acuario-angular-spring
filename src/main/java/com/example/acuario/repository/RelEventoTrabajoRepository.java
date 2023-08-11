package com.example.acuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acuario.entity.RelTrabajosEventoEntity;

@Repository
public interface RelEventoTrabajoRepository extends JpaRepository<RelTrabajosEventoEntity, Long> {
}
