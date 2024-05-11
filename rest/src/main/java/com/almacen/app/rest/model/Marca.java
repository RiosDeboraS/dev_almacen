package com.almacen.app.rest.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(schema = "market")
public class Marca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    @Column
    private String descripcion;

    @Column
    private LocalDateTime fecha_baja;

    @Column(name = "activo")
    private boolean activo = true;

    public Marca(){}

    public Marca(Long id_marca,String descripcion, LocalDateTime fecha_baja){
        this.id_marca = id_marca;
        this.descripcion = descripcion;
        this.fecha_baja = fecha_baja;

    }

    public Long getId_marca(){
        return id_marca;
    }
    public void setId_marca(Long idMarca){
        this.id_marca = idMarca;
    }

    public String getDescripcion(){
        return descripcion;
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
    @JsonIgnore
    public boolean isActivo(){
        return activo;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }
}
