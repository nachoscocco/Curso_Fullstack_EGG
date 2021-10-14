package com.inicio.web.controllers;


import com.inicio.web.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


@Controller
@RequestMapping("/")
public class mainController {
    
    //SERVICIOS
    @Autowired 
    private EditorialService editorialService;
    
    
    @GetMapping("/")
    public String index(){
    return "index.html";
    }
    @PostMapping("/registrar")
    public String registrar(@RequestParam String nombre) throws Exception{
       
        editorialService.altaEditorial(nombre);
       
    return "index.html";
    }
    @GetMapping("/abm_editoriales")
    public String abm_editoriales(){
    return "abm_editoriales.html";
    }
    @GetMapping("/abm_libros")
    public String abm_libros(){
    return "abm_libros.html";
    }
    @GetMapping("/abm_autores")
    public String abm_autores(){
    return "abm_autores.html";
    }
    @GetMapping("/lista")
    public String lista(){
    return "lista.html";
    }
    
}
