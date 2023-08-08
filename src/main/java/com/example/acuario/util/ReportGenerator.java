package com.example.acuario.util;

import com.example.acuario.entity.OutNota;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.JasperCompileManager;

@Service
public class ReportGenerator {
    private JasperPrint getReport(List<OutNota> datos) throws FileNotFoundException, JRException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("nombre_cliente", "Alfonso Morado");
        params.put("fecha_string", "12/07/2023");
        params.put("folio", "43251");

        InputStream jasperStream = getClass().getClassLoader().getResourceAsStream("jasper/Nota.jrxml");
        JasperDesign jasperDesign = JRXmlLoader.load(jasperStream);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        JRBeanCollectionDataSource items = new JRBeanCollectionDataSource(datos);
        params.put("CollectionBeanDataParam", items);

        return JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
    }

    public byte[] exportPDF(List<OutNota> lista) throws JRException, FileNotFoundException{
        /*List<OutNota> datos = new ArrayList<OutNota>();
        OutNota d1 = new OutNota(2, "Filtro", "$12,345.50", "12,345.50", "49,382.00");
        OutNota d2 = new OutNota(3, "Mantenimiento marino", "$12,345.50", "12,345.50", "49,382.00");
        OutNota d3 = new OutNota(1, "Agua bidestilla", "$12,345.50", "12,345.50", "49,382.00");
        OutNota d4 = new OutNota(1, "Filtro corrugado", "$12,345.50", "12,345.50", "49,382.00");
        
        datos.add(d1);
        datos.add(d2);
        datos.add(d3);
        datos.add(d4);*/

        return JasperExportManager.exportReportToPdf(getReport(lista));
    }
}
