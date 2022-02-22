package com.edward.productocategoria.dao;

import com.edward.productocategoria.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long>{


}
