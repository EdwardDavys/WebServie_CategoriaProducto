package com.edward.productocategoria.service;


import com.edward.productocategoria.dao.CategoriaDao;
import com.edward.productocategoria.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaDao categoriaDao;

    @Override
    public List<Categoria> findAll() {
        return categoriaDao.findAll();
    }
}
