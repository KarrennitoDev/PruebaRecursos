package com.example.recursos.controller;

import com.example.recursos.model.recursosModel;
import com.example.recursos.service.recursosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class recursoController {

    @Autowired
    private recursosService service;

    @GetMapping
    public List<recursosModel> obtenerTodos() {
        return service.listarTodo();
    }

    @PostMapping
    public ResponseEntity<String> guardar(@Valid @RequestBody recursosModel recurso) {
        service.crear(recurso);
        return new ResponseEntity<>("Recurso registrado con éxito", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.borrar(id);
    }

    @GetMapping("/disponibles")
    public List<recursosModel> listarDisponibles() {
        return service.rDisponibles();
    }
}