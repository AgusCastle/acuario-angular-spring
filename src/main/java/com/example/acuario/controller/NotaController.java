package com.example.acuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.acuario.service.PdfService;

import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/nota")
public class NotaController {
    
    @Autowired
    private PdfService pdfService;

    @GetMapping("/pdf")
    public String exportNota() {
        return "Hola mi funcion esta levantada";
        
    }

    @GetMapping("/export-pdf")
    public ResponseEntity<byte[]> exportPdf() throws JRException, FileNotFoundException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("report", "report.pdf");
        return ResponseEntity.ok().headers(headers).body(pdfService.exportPDF());
    } 
    
    
}
