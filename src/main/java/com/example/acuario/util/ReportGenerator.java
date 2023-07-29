package com.example.acuario.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class ReportGenerator {
    private JasperPrint getReport() throws FileNotFoundException, JRException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("nombre_cliente", "Alfonso Morado");
        params.put("fecha_string", "12/07/2023");
        params.put("folio", "43251");

        InputStream jasperStream = getClass().getClassLoader().getResourceAsStream("jasper/Nota.jasper");

        return JasperFillManager.fillReport(jasperStream, params);
    }

    public byte[] exportPDF() throws JRException, FileNotFoundException{
        return JasperExportManager.exportReportToPdf(getReport());
    }
}
