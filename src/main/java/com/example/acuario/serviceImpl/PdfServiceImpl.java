package com.example.acuario.serviceImpl;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acuario.service.PdfService;
import com.example.acuario.util.ReportGenerator;

import net.sf.jasperreports.engine.JRException;

import java.util.List;
import com.example.acuario.entity.OutNota;

@Service
public class PdfServiceImpl implements PdfService{
    
    @Autowired
    private ReportGenerator reportGenerator;

    @Override
    public byte[] exportPDF(List<OutNota> lista) throws JRException, FileNotFoundException{
        return reportGenerator.exportPDF(lista);
    }
}
