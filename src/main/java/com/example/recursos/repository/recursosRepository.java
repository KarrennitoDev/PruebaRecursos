package com.example.recursos.repository;

import com.example.recursos.model.recursosModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class recursosRepository {

    private List<recursosModel> listaRecursos = new ArrayList<>();

    public List<recursosModel> findAll() {
        return listaRecursos;
    }
}
