package com.example.acuario.service;

import java.util.List;

import com.example.acuario.entity.EventoEntity;
import com.example.acuario.entity.TrabajosEntity;

public interface CalendarioService {
    List<TrabajosEntity> obtenerTodosTrabajos();
    List<EventoEntity> obtenerAgenda();
    void agendar(EventoEntity eventoEntity);
}
