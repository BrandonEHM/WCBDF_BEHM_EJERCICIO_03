package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/v1/clientes")
public class ClientesController {
    //Respuesta para todos los clientes - GET
    @GetMapping
    public String listarClientes(){
        return "Listado de todas las clientes - GET";
    }

    //Respuesta para una cliente por id - GET
    @GetMapping("/{id}")
    public String listarCliente(@PathVariable int id){
        return "Obtener un cliente por id - GET " + id;
    }


    //Agrega un cliente -                POST
    @PostMapping
    public String agregarCliente(@RequestBody String cliente){
        return "Agregar cliente - POST: " + cliente;
    }

    //Actualizar un cliente  -           PUT
    @PutMapping("/{id}")
    public String actualizarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Actualizar cliente - PUT: " + cliente + " con id: " + id;
    }

    //Eliminar un cliente  -              DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){
        return "Eliminar un cliente - DELETE: " + id;
    }

}
