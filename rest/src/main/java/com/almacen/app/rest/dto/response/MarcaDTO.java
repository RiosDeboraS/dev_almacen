package com.almacen.app.rest.dto.response;

public class MarcaDTO {

    private Long id_marca;
    private String descripcion;
    private boolean activo;


    public MarcaDTO(){}
    public MarcaDTO(Long id_marca, String descripcion, boolean activo){
        this.id_marca = id_marca;
        this.descripcion = descripcion;
        this.activo = activo;
    }
    public Long getId_marca(){
        return id_marca;
    }
    public  void setId_marca(Long idMarca){
        this.id_marca = id_marca;
    }
    public String getDescripcion(){
        return  descripcion;
    }
    public  void  setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public boolean isActivo(){
        return activo;
    }
    public  void setActivo(boolean activo){
        this.activo = activo;
    }
}
