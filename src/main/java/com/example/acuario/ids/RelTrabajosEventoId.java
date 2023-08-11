package com.example.acuario.ids;

import java.io.Serializable;

import com.example.acuario.entity.EventoEntity;
import com.example.acuario.entity.TrabajosEntity;

public class RelTrabajosEventoId implements Serializable{
    private EventoEntity eventoEntity;
    private TrabajosEntity trabajosEntity;

    public RelTrabajosEventoId() {
    }
    
    public RelTrabajosEventoId(EventoEntity eventoEntity, TrabajosEntity trabajosEntity) {
        this.eventoEntity = eventoEntity;
        this.trabajosEntity = trabajosEntity;
    }
    public EventoEntity getEventoEntity() {
        return eventoEntity;
    }
    public void setEventoEntity(EventoEntity eventoEntity) {
        this.eventoEntity = eventoEntity;
    }
    public TrabajosEntity getTrabajosEntity() {
        return trabajosEntity;
    }
    public void setTrabajosEntity(TrabajosEntity trabajosEntity) {
        this.trabajosEntity = trabajosEntity;
    }


}
