package com.almacen.app.rest.repository;

import com.almacen.app.rest.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespository extends JpaRepository<Producto,Long> {
}
