package com.example.acuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acuario.entity.EventoEntity;


@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {
    
}
