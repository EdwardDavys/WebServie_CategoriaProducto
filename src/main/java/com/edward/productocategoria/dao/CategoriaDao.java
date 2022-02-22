package com.edward.productocategoria.dao;

import com.edward.productocategoria.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria,Long> {
}
