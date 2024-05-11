package com.almacen.app.rest.dto.request;

import java.time.LocalDateTime;

public class MarcaDTO {

    private String descripcion;
    private LocalDateTime fecha_baja;

    public MarcaDTO(){}
    public MarcaDTO(String descripcion, LocalDateTime fecha_baja){
        this.descripcion = descripcion;
        this.fecha_baja  = fecha_baja;

    }

    public String getDescripcion(){
        return  descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha_baja(){
        return fecha_baja;
    }
    public void setFecha_baja(LocalDateTime fecha_baja){
        this.fecha_baja = fecha_baja;
    }
}
