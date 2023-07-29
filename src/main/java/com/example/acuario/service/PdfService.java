package com.example.acuario.service;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;

public interface PdfService {
    byte[] exportPDF() throws JRException, FileNotFoundException;
}
