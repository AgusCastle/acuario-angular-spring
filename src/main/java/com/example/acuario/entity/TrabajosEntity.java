package com.example.acuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajos")

public class TrabajosEntity {

    @Id
    private int trab_id;
    private String trab_desc;

    public TrabajosEntity() {
    }
    
    public TrabajosEntity(int trab_id, String trab_desc) {
        this.trab_id = trab_id;
        this.trab_desc = trab_desc;
    }
    public int getTrab_id() {
        return trab_id;
    }
    public void setTrab_id(int trab_id) {
        this.trab_id = trab_id;
    }
    public String getTrab_desc() {
        return trab_desc;
    }
    public void setTrab_desc(String trab_desc) {
        this.trab_desc = trab_desc;
    }

    
}
