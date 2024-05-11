package com.almacen.app.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(schema = "market")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;
    @Column
    private LocalDateTime fecha_baja;
    @Column(name = "activo")
    private boolean activo = true;


    public Producto() {
    }

    public Producto(Long id_producto, String nombre, String descripcion, Marca marca, LocalDateTime fecha_baja) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.fecha_baja = fecha_baja;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        if (marca == null) {
            throw new IllegalArgumentException("La marca no puede ser nula");
        }
        this.marca = marca;
    }

    public LocalDateTime getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(LocalDateTime fecha_baja) {
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