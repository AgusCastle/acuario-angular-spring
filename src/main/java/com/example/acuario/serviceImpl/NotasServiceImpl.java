package com.example.acuario.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acuario.repository.NotaRepository;
import com.example.acuario.service.NotasService;
import java.util.List;
import com.example.acuario.entity.OutNota;

@Service
public class NotasServiceImpl implements NotasService {
    
    @Autowired
    private NotaRepository notaRepository;

    @Override 
    public List<OutNota> encuentraNota(){
        return notaRepository.findAll();
    }
}
