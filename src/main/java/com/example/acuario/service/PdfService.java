package com.example.acuario.service;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;
import java.util.List;
import com.example.acuario.entity.OutNota;

public interface PdfService {
    byte[] exportPDF(List<OutNota> lista) throws JRException, FileNotFoundException;
}
