package com.example.acuario.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acuario.entity.OutNota;

@Repository
public interface NotaRepository extends JpaRepository<OutNota, String>{
    public List<OutNota> findAll();
}
