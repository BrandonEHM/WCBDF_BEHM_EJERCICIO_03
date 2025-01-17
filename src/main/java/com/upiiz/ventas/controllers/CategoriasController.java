package com.upiiz.ventas.controllers;

import com.upiiz.ventas.models.Categoria;
import com.upiiz.ventas.services.CategoriasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CategoriasController {
    CategoriasService categoriasService;
    public CategoriasController(CategoriasService categoriasService){
        this.categoriasService = categoriasService;
    }

    // GET - Todas las categorias
    @GetMapping
    public ResponseEntity<List<Categoria>> getCategorias(){
        return ResponseEntity.ok(categoriasService.getAllCategorias());
    }

    // GET- Solo una categoria
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaid(@PathVariable Long id){
        return ResponseEntity.ok(categoriasService.getCategoriaById(id));
    }

    // POST - Creamos una categoria
    @PostMapping
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriasService.createCategoria(categoria));
    }

    // PUT - Actualizar una categoria
    @PutMapping("/{id}")
    public ResponseEntity<Categoria> updateCategoria(@RequestBody Categoria categoria, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        categoria.setId(id);
        return ResponseEntity.ok(categoriasService.updateCategoria(categoria));
    }

    // DELETE - Eliminar una categoria por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id){
        categoriasService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    }
}


