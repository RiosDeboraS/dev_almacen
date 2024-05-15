package com.almacen.app.rest.service;

import com.almacen.app.rest.dto.response.MarcaDTO;
import com.almacen.app.rest.mapper.MarcaMapper;
import com.almacen.app.rest.model.Marca;
import com.almacen.app.rest.repository.MarcaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MarcaService {

    private MarcaRepository marcaRepository;
    private MarcaMapper marcaMapper;

    @Autowired
    public MarcaService(MarcaRepository marcaRepository, MarcaMapper marcaMapper){
        this.marcaRepository = marcaRepository;
        this.marcaMapper = marcaMapper;
    }

    public List<MarcaDTO> getAllMarcas(){
        List<Marca> marcas = marcaRepository.findAll();
        return marcas.stream().map(marcaMapper::toDTO).collect(Collectors.toList());
    }

    public MarcaDTO saveMarca(MarcaDTO marcaDTO){
        Marca marca = marcaMapper.toEntity(marcaDTO);
        marca = marcaRepository.save(marca);
        return  marcaMapper.toDTO(marca);
    }


}
