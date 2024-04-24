package com.almacen.app.rest.Model;


import jakarta.persistence.*;


@Entity
@Table(schema = "marca")
public class Marca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    @Column
    private String descripcion;


    public Marca(){}

    public Marca(String descripcion){

        this.descripcion = descripcion;

    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
