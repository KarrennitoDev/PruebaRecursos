package com.example.recursos.repository;

import com.example.recursos.model.recursosModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class recursosRepository {

    private List<recursosModel> listaRecursos = new ArrayList<>();

    public List<recursosModel> mostrar() {
        return listaRecursos;
    }

    public void guardar(recursosModel recurso) {
        listaRecursos.add(recurso);
    }

    public recursosModel buscar(int id) {
        for (recursosModel recurso : listaRecursos) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).getId() == id) {
                listaRecursos.remove(i);
                break;
            }
        }
    }
}
