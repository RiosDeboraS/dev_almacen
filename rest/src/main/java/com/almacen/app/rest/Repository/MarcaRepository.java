package com.almacen.app.rest.Repository;

import com.almacen.app.rest.Model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca,Long> {
}
