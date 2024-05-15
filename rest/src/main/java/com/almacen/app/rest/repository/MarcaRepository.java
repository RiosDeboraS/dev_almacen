package com.almacen.app.rest.repository;

import com.almacen.app.rest.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca,Long> {
}
