package com.example.acuario.entity;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventos")
public class EventoEntity {
    
    @Id
    private Long evn_id;
    private String evn_nom_client;
    private String evn_desc;
    private int evn_estado;
    private Date evn_fecha;

    public EventoEntity() {
    }

    public EventoEntity(Long evn_id, String evn_nom_client, String evn_desc, int env_estado, Date env_fecha) {
        this.evn_id = evn_id;
        this.evn_nom_client = evn_nom_client;
        this.evn_desc = evn_desc;
        this.evn_estado = env_estado;
        this.evn_fecha = env_fecha;
    }
    public Date getEnv_fecha() {
        return evn_fecha;
    }
    public void setEnv_fecha(Date env_fecha) {
        this.evn_fecha = env_fecha;
    }
    public EventoEntity(Long evn_id, String evn_nom_client, String evn_desc, int env_estado) {
        this.evn_id = evn_id;
        this.evn_nom_client = evn_nom_client;
        this.evn_desc = evn_desc;
        this.evn_estado = env_estado;
    }
    public int getEnv_estado() {
        return evn_estado;
    }
    public void setEnv_estado(int env_estado) {
        this.evn_estado = env_estado;
    }
    public EventoEntity(Long evn_id, String evn_nom_client, String evn_desc) {
        this.evn_id = evn_id;
        this.evn_nom_client = evn_nom_client;
        this.evn_desc = evn_desc;
    }
    public Long getEvn_id() {
        return evn_id;
    }
    public void setEvn_id(Long evn_id) {
        this.evn_id = evn_id;
    }
    public String getEvn_nom_client() {
        return evn_nom_client;
    }
    public void setEvn_nom_client(String evn_nom_client) {
        this.evn_nom_client = evn_nom_client;
    }
    public String getEvn_desc() {
        return evn_desc;
    }
    public void setEvn_desc(String evn_desc) {
        this.evn_desc = evn_desc;
    }
}
