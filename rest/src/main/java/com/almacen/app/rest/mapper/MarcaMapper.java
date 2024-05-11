package com.almacen.app.rest.mapper;


import com.almacen.app.rest.dto.response.MarcaDTO;
import com.almacen.app.rest.model.Marca;
import org.springframework.stereotype.Component;

@Component
public class MarcaMapper {
    public MarcaDTO toDTO(Marca marca){
        MarcaDTO marcaDTO = new MarcaDTO();
        marcaDTO.setId_marca(marca.getId_marca());
        marcaDTO.setDescripcion(marca.getDescripcion());
        marcaDTO.setActivo(marca.isActivo());
        return marcaDTO;
    }

    public Marca toEntity(MarcaDTO marcaDTO){
        Marca marca = new Marca();
        marca.setId_marca(marcaDTO.getId_marca());
        marca.setDescripcion(marcaDTO.getDescripcion());
        marca.setActivo(marcaDTO.isActivo());
        return marca;

    }
}
