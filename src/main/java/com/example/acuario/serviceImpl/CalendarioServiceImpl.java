package com.example.acuario.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acuario.entity.EventoEntity;
import com.example.acuario.entity.TrabajosEntity;
import com.example.acuario.repository.EventoRepository;
import com.example.acuario.repository.TrabajoRepository;
import com.example.acuario.service.CalendarioService;

@Service
public class CalendarioServiceImpl implements CalendarioService {
    
    @Autowired
    private TrabajoRepository trabajoRepository;

    @Autowired
    private EventoRepository eventoRepository;
    
    @Override
    public List<TrabajosEntity> obtenerTodosTrabajos(){
        return trabajoRepository.findAll();
    }

    @Override
    public List<EventoEntity> obtenerAgenda() {
        return eventoRepository.findAll();
    }

    @Override
    public void agendar(EventoEntity eventoEntity) {
        eventoRepository.save(eventoEntity);
    }
}
