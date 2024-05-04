package com.almacen.app.rest.controller;

import com.almacen.app.rest.model.Producto;
import com.almacen.app.rest.repository.ProductoRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRespository productoRespository;

    @GetMapping(value = "/productos")
    public List<Producto> getProductos(){
        return productoRespository.findAll();
    }

    @PostMapping(value = "/saveproducto")
    public String saveProducto(@RequestBody Producto producto){
        productoRespository.save(producto);
        return "producto creado";
    }

    @PutMapping(value = "/updateproducto/{id_producto}")
    public String updateProducto(@PathVariable long id_producto, @RequestBody Producto producto){
        Producto updatedProducto = productoRespository.findById(id_producto).get();
        updatedProducto.setDescripcion(producto.getDescripcion());
        productoRespository.save(updatedProducto);
        return "producto actualizado";
    }

    @DeleteMapping(value = "/deleteproducto/{}")
    public String deleteMarca(@PathVariable long id_producto){
        Producto deletedProducto = productoRespository.findById(id_producto).orElse(null);
        if(deletedProducto !=null){
            deletedProducto.setActivo(false);
            productoRespository.save(deletedProducto);
            return "el producto ha cambiando de estado";
        }else {
            return "producto no encontrado";
        }
    }


}
