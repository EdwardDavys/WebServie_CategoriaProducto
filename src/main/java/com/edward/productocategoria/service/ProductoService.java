package com.edward.productocategoria.service;

import com.edward.productocategoria.models.Producto;

import java.util.List;

public interface ProductoService {

    public Producto save(Producto producto);
    public Producto findById(Long id);
    public List<Producto> findAll();
    public void delete(Long id);
}
