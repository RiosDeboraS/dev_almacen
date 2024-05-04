package com.almacen.app.rest.controller;

import com.almacen.app.rest.model.Marca;
import com.almacen.app.rest.repository.MarcaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarcaController {
    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping(value = "/")

    public String saludo(){
        return "saludoss !!";
    }

    @GetMapping(value = "/marcas")
    public List<Marca> getMarcas(){
        return marcaRepository.findAll();
    }

    @PostMapping(value = "/savemarca")
    public String saveMarca(@RequestBody Marca marca){
        marcaRepository.save(marca);
        return "marca creada";
    }

    @PutMapping(value = "/updatemarca/{id_marca}")
    public String updateMarca(@PathVariable long id_marca,@RequestBody Marca marca){
        Marca updatedMarca = marcaRepository.findById(id_marca).get();
        updatedMarca.setDescripcion(marca.getDescripcion());
        marcaRepository.save(updatedMarca);
        return "marca actualizada";
    }
    @DeleteMapping(value = "/deletemarca/{id_marca}")
    public String deleteMarca(@PathVariable long id_marca){
        Marca deletedMarca = marcaRepository.findById(id_marca).orElse(null);
        if(deletedMarca !=null){
            deletedMarca.setActivo(false);
            marcaRepository.save(deletedMarca);
            return "la marca se ha cambiado a un estado inactivo";
        }else{
            return "Marca no encontrada";
        }
    }
    @PutMapping(value = "/activarmarca/{id_marca}")
    public String activateMarca(@PathVariable long id_marca){
        Marca activatedMarca = marcaRepository.findById(id_marca).orElse(null);
        if(activatedMarca !=null){
            activatedMarca.setActivo(true);
            marcaRepository.save(activatedMarca);
            return "la marca ha cambiado de estado a Activo";
        }else {
            return "Marca no encontrada";
        }
    }

}
