package com.example.acuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.acuario.entity.EventoEntity;
import com.example.acuario.entity.TrabajosEntity;
import com.example.acuario.service.CalendarioService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    
    @Autowired
    private CalendarioService calendarioService;

    @GetMapping("/trabajos")
    public ResponseEntity<List<TrabajosEntity>> obtenerTrabajos(){
        return ResponseEntity.ok().body(calendarioService.obtenerTodosTrabajos());
    }

    @GetMapping("/agenda")
    public ResponseEntity<List<EventoEntity>> obtenerAgenda(){
        return ResponseEntity.ok().body(calendarioService.obtenerAgenda());
    }

    @PostMapping("/agendar")
    public ResponseEntity<List<EventoEntity>> agendar(@RequestBody EventoEntity eventoEntity){
        calendarioService.agendar(eventoEntity);
        return ResponseEntity.ok().body(calendarioService.obtenerAgenda());
    }
}