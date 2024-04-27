package com.almacen.app.rest.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(schema = "market")
public class Marca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    @Column
    private String descripcion;

    @Column(name = "activo")
    private boolean activo = true;

    public Marca(){}

    public Marca(Long id_marca,String descripcion){
        this.id_marca = id_marca;
        this.descripcion = descripcion;

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
    @JsonIgnore
    public boolean isActivo(){
        return activo;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }
}
