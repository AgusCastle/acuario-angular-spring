package com.example.acuario.serviceImpl;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acuario.service.PdfService;
import com.example.acuario.util.ReportGenerator;

import net.sf.jasperreports.engine.JRException;

@Service
public class PdfServiceImpl implements PdfService{
    
    @Autowired
    private ReportGenerator reportGenerator;

    @Override
    public byte[] exportPDF() throws JRException, FileNotFoundException{
        return reportGenerator.exportPDF();
    }
}
