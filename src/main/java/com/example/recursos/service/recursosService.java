package com.example.recursos.service;

import com.example.recursos.model.recursosModel;
import com.example.recursos.repository.recursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class recursosService {

    @Autowired
    private recursosRepository repository;

    public List<recursosModel> listarTodo() {
        return repository.mostrar();
    }

    public void crear(recursosModel recurso) {
        repository.guardar(recurso);
    }

    public void borrar(int id) {
        repository.eliminar(id);
    }

    public List<recursosModel> rDisponibles() {
        List<recursosModel> todos = repository.mostrar();
        List<recursosModel> soloDisponibles = new ArrayList<>();

        for (recursosModel r : todos) {
            if (r.isDisponibilidad() == true) {
                soloDisponibles.add(r);
            }
        }
        return soloDisponibles;
    }
}