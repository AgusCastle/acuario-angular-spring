package com.example.acuario.entity;

import com.example.acuario.ids.RelTrabajosEventoId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(RelTrabajosEventoId.class)
@Table(name = "rel_trabajos_evento")
public class RelTrabajosEventoEntity {

    @Id 
    @ManyToOne
    @JoinColumn(name = "rel_evn_id")
    private EventoEntity eventoEntity;
    
    @Id 
    @ManyToOne
    @JoinColumn(name = "rel_trab_id")
    private TrabajosEntity trabajosEntity;


    public RelTrabajosEventoEntity() {
    }

    public RelTrabajosEventoEntity(EventoEntity eventoEntity, TrabajosEntity trabajosEntity) {
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

/*
 * 
 * CREATE TABLE rel_trabajos_evento (
    rel_evn_id BIGINT,
    rel_trab_id INT,
    PRIMARY KEY (rel_evn_id, rel_trab_id),
    FOREIGN KEY (rel_evn_id) REFERENCES eventos(evn_id),
    FOREIGN KEY (rel_trab_id) REFERENCES trabajos(trab_id)
);
 */