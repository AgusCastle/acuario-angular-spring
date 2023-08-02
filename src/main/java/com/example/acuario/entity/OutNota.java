package com.example.acuario.entity;

import javax.persistence.Entity;

@Entity
public class OutNota{
    private int cantidad;
    private String description;
    private String precio_uni;
    private String precio_total;
    private String total;

    public OutNota() {
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public OutNota(int cantidad, String description, String precio_uni, String precio_total, String total) {
        this.cantidad = cantidad;
        this.description = description;
        this.precio_uni = precio_uni;
        this.precio_total = precio_total;
        this.total = total;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrecio_uni() {
        return this.precio_uni;
    }

    public void setPrecio_uni(String precio_uni) {
        this.precio_uni = precio_uni;
    }

    public String getPrecio_total() {
        return this.precio_total;
    }

    public void setPrecio_total(String precio_total) {
        this.precio_total = precio_total;
    }
}
