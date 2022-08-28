/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.ControladorTablaApsHCsSistema;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Favio
 */
public class Sistema {

    private PacientesListaDoble listapacientes;
    private MedicosListaDoble listamedicos;
    private AdminsListaDoble listaadmins;
    
    
    
    private Medico medicolog;
    private Paciente pacientelog;
    private Administrador adminlog;
    
    
    
    
    private HCapListaDoble listahistoriassistema;

    public Sistema(PacientesListaDoble listapacientes, MedicosListaDoble listamedicos, AdminsListaDoble listaadmins, HCapListaDoble listahistoriassistema) {
        this.listapacientes = listapacientes;
        this.listamedicos = listamedicos;
        this.listaadmins = listaadmins;
        this.listahistoriassistema = listahistoriassistema;
    }

    public PacientesListaDoble getListapacientes() {
        return listapacientes;
    }

    public void setListapacientes(PacientesListaDoble listapacientes) {
        this.listapacientes = listapacientes;
    }

    public MedicosListaDoble getListamedicos() {
        return listamedicos;
    }

    public void setListamedicos(MedicosListaDoble listamedicos) {
        this.listamedicos = listamedicos;
    }

    public AdminsListaDoble getListaadmins() {
        return listaadmins;
    }

    public void setListaadmins(AdminsListaDoble listaadmins) {
        this.listaadmins = listaadmins;
    }

    public Medico getMedicolog() {
        return medicolog;
    }

    public void setMedicolog(Medico medicolog) {
        this.medicolog = medicolog;
    }

    public Paciente getPacientelog() {
        return pacientelog;
    }

    public void setPacientelog(Paciente pacientelog) {
        this.pacientelog = pacientelog;
    }

    public Administrador getAdminlog() {
        return adminlog;
    }

    public void setAdminlog(Administrador adminlog) {
        this.adminlog = adminlog;
    }

    public HCapListaDoble getListahistoriassistema() {
        return listahistoriassistema;
    }

    public void setListahistoriassistema(HCapListaDoble listahistoriassistema) {
        this.listahistoriassistema = listahistoriassistema;
    }

    public void exportarAperturaPDF(String nombre, HistoriaClinicaApertura aperturahistoriaseleccionada) throws DocumentException, FileNotFoundException, BadElementException {

        FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        Font fuente = new Font(Font.FontFamily.TIMES_ROMAN, 15.0f, Font.BOLD, BaseColor.BLACK);

        Paragraph titulo = new Paragraph("Apertura de Historia Clínica", fuente);
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);

        Image image = null;

        try {
            image = Image.getInstance("C:\\Users\\Favio\\Desktop\\ED_ProyectoHistClinicasV7Final\\src\\images\\img.png");
            image.scaleAbsolute(150, 100);
            image.setAbsolutePosition(415, 750);
        } catch (IOException ex) {
            Logger.getLogger(ControladorTablaApsHCsSistema.class.getName()).log(Level.SEVERE, null, ex);
        }

        documento.add(image);

        documento.add(new Paragraph("Código Redactor: " + aperturahistoriaseleccionada.getCodigomedico()));
        documento.add(new Paragraph("Código de Apertura: " + aperturahistoriaseleccionada.getCodigohistoriaclinica()));
        documento.add(new Paragraph("Código del Paciente" + aperturahistoriaseleccionada.getPaciente().getCodigoPaciente()));
        documento.add(new Paragraph("Fecha de la hoja de apertura: " + aperturahistoriaseleccionada.getFechaapertura()));
        documento.add(Chunk.NEWLINE); //crear una nueva linea en blanco
        documento.add(Chunk.NEWLINE);
        documento.add(Chunk.NEWLINE);

        //DATOS DEL PACIENTE
        PdfPTable tabla = new PdfPTable(2);
        tabla.setWidthPercentage(100);
        PdfPCell valorDocumento = new PdfPCell(new Phrase("Documento"));
        valorDocumento.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell tipoDocumento = new PdfPCell(new Phrase("Tipo de Documento"));
        tipoDocumento.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla.addCell(valorDocumento);
        tabla.addCell(tipoDocumento);
        tabla.addCell(aperturahistoriaseleccionada.getPaciente().getDocumento());
        tabla.addCell(aperturahistoriaseleccionada.getPaciente().getTipodocumento());

        documento.add(tabla);

        //******************************************************
        PdfPTable tabla2 = new PdfPTable(4);
        tabla2.setWidthPercentage(100);
        PdfPCell primApellido = new PdfPCell(new Phrase("1° Apellido"));
        primApellido.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell segApellido = new PdfPCell(new Phrase("2° Apellido"));
        segApellido.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell nombres = new PdfPCell(new Phrase("Nombres"));
        nombres.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell sexo = new PdfPCell(new Phrase("Sexo"));
        sexo.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla2.addCell(primApellido);
        tabla2.addCell(segApellido);
        tabla2.addCell(nombres);
        tabla2.addCell(sexo);

        tabla2.addCell(aperturahistoriaseleccionada.getPaciente().getApellPat());
        tabla2.addCell(aperturahistoriaseleccionada.getPaciente().getApellMat());
        tabla2.addCell(aperturahistoriaseleccionada.getPaciente().getNombres());
        tabla2.addCell(aperturahistoriaseleccionada.getPaciente().getSexo());

        documento.add(tabla2);

        //******************************************************
        PdfPTable tabla3 = new PdfPTable(4);
        tabla3.setWidthPercentage(100);
        PdfPCell fecNacimiento = new PdfPCell(new Phrase("Fecha de Nacimiento"));
        fecNacimiento.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell gradoInstruccion = new PdfPCell(new Phrase("Grado de Instrucción"));
        gradoInstruccion.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell edad = new PdfPCell(new Phrase("Edad"));
        edad.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell estCivil = new PdfPCell(new Phrase("Estado Civil"));
        estCivil.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla3.addCell(fecNacimiento);
        tabla3.addCell(gradoInstruccion);
        tabla3.addCell(edad);
        tabla3.addCell(estCivil);

        tabla3.addCell(aperturahistoriaseleccionada.getPaciente().getFechaNacim());
        tabla3.addCell(aperturahistoriaseleccionada.getPaciente().getGradoInst());
        tabla3.addCell(aperturahistoriaseleccionada.getPaciente().getEdad());
        tabla3.addCell(aperturahistoriaseleccionada.getPaciente().getEstadoCivil());

        documento.add(tabla3);

        //******************************************************
        PdfPTable tabla4 = new PdfPTable(1);
        tabla4.setWidthPercentage(100);
        PdfPCell direccion = new PdfPCell(new Phrase("Lugar de Nacimiento"));
        direccion.setBackgroundColor(BaseColor.LIGHT_GRAY);
        tabla4.addCell(direccion);
        tabla4.addCell(aperturahistoriaseleccionada.getPaciente().getLugarNacim());
        documento.add(tabla4);

        //******************************************************
        PdfPTable tabla5 = new PdfPTable(1);
        tabla5.setWidthPercentage(100);
        PdfPCell domicilio = new PdfPCell(new Phrase("Domicilio"));
        domicilio.setBackgroundColor(BaseColor.LIGHT_GRAY);
        tabla5.addCell(domicilio);
        tabla5.addCell(aperturahistoriaseleccionada.getPaciente().getDomicilio());
        documento.add(tabla5);

        //******************************************************
        PdfPTable tabla6 = new PdfPTable(4);
        tabla6.setWidthPercentage(100);
        PdfPCell grupoEtnico = new PdfPCell(new Phrase("Grupo Etnico"));
        grupoEtnico.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell religion = new PdfPCell(new Phrase("Religión"));
        religion.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell ocupacion = new PdfPCell(new Phrase("Ocupación"));
        ocupacion.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell lugProcedencia = new PdfPCell(new Phrase("Lugar de Procedencia"));
        lugProcedencia.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla6.addCell(grupoEtnico);
        tabla6.addCell(religion);
        tabla6.addCell(ocupacion);
        tabla6.addCell(lugProcedencia);

        tabla6.addCell(aperturahistoriaseleccionada.getPaciente().getGrupoEtnico());
        tabla6.addCell(aperturahistoriaseleccionada.getPaciente().getReligion());
        tabla6.addCell(aperturahistoriaseleccionada.getPaciente().getOcupacion());
        tabla6.addCell(aperturahistoriaseleccionada.getPaciente().getLugarproced());

        documento.add(tabla6);
        documento.add(Chunk.NEWLINE);

        //*********************Persona Responsable*********************************
        Paragraph subTitulo = new Paragraph("Persona Responsable", fuente);
        documento.add(subTitulo);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla7 = new PdfPTable(4);
        tabla7.setWidthPercentage(100);
        PdfPCell apeAcompañante = new PdfPCell(new Phrase("1° Apellido"));
        apeAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell segapeAcompañante = new PdfPCell(new Phrase("2° Apellido"));
        segapeAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell nomAcompañante = new PdfPCell(new Phrase("Nombres"));
        nomAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell sexAcompañante = new PdfPCell(new Phrase("Sexo"));
        sexAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla7.addCell(apeAcompañante);
        tabla7.addCell(segapeAcompañante);
        tabla7.addCell(nomAcompañante);
        tabla7.addCell(sexAcompañante);

        tabla7.addCell(aperturahistoriaseleccionada.getPersonaresp().getApellPat());
        tabla7.addCell(aperturahistoriaseleccionada.getPersonaresp().getApellMat());
        tabla7.addCell(aperturahistoriaseleccionada.getPersonaresp().getNombres());
        tabla7.addCell(aperturahistoriaseleccionada.getPersonaresp().getSexo());

        documento.add(tabla7);

        //******************************************************
        PdfPTable tabla8 = new PdfPTable(4);
        tabla8.setWidthPercentage(100);
        PdfPCell tipDocAcompañante = new PdfPCell(new Phrase("Tipo de Documento"));
        tipDocAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell docAcompañante = new PdfPCell(new Phrase("Documento"));
        docAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell celAcompañante = new PdfPCell(new Phrase("Número de Celular"));
        celAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell domAcompañante = new PdfPCell(new Phrase("Dirección del domicilio"));
        domAcompañante.setBackgroundColor(BaseColor.LIGHT_GRAY);

        tabla8.addCell(tipDocAcompañante);
        tabla8.addCell(docAcompañante);
        tabla8.addCell(celAcompañante);
        tabla8.addCell(domAcompañante);

        tabla8.addCell(aperturahistoriaseleccionada.getPersonaresp().getTipodoc());
        tabla8.addCell(aperturahistoriaseleccionada.getPersonaresp().getDocumento());
        tabla8.addCell(aperturahistoriaseleccionada.getPersonaresp().getNumerocell());
        tabla8.addCell(aperturahistoriaseleccionada.getPersonaresp().getDocumento());

        documento.add(tabla8);
        documento.add(Chunk.NEXTPAGE);

        //****************Motivos de la consulta**************************************
        Paragraph subTitulo2 = new Paragraph("Motivo de Consulta", fuente);
        documento.add(subTitulo2);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla9 = new PdfPTable(2);
        tabla9.setWidthPercentage(100);
        PdfPCell signosPrincipales = new PdfPCell(new Phrase("Signos Principales"));
        signosPrincipales.setVerticalAlignment(Element.ALIGN_MIDDLE);
        signosPrincipales.setHorizontalAlignment(1);
        signosPrincipales.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getMotivoconsul().getSignosprincip()));

        tabla9.addCell(signosPrincipales);
        tabla9.addCell(datos);
        documento.add(tabla9);

        //******************************************************
        PdfPTable tabla10 = new PdfPTable(2);
        tabla10.setWidthPercentage(100);
        PdfPCell sintomasPrincipales = new PdfPCell(new Phrase("Síntomas Principales"));
        sintomasPrincipales.setVerticalAlignment(Element.ALIGN_MIDDLE);
        sintomasPrincipales.setHorizontalAlignment(1);
        sintomasPrincipales.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos2 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getMotivoconsul().getSintomasprincip()));

        tabla10.addCell(sintomasPrincipales);
        tabla10.addCell(datos2);
        documento.add(tabla10);

        //******************************************************
        PdfPTable tabla11 = new PdfPTable(2);
        tabla11.setWidthPercentage(100);
        PdfPCell tiempoEnfermedad = new PdfPCell(new Phrase("Tiempo de enfermedad"));
        tiempoEnfermedad.setVerticalAlignment(Element.ALIGN_MIDDLE);
        tiempoEnfermedad.setHorizontalAlignment(1);
        tiempoEnfermedad.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos3 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getMotivoconsul().getTiempoenfermedad()));

        tabla11.addCell(tiempoEnfermedad);
        tabla11.addCell(datos3);
        documento.add(tabla11);

        //******************************************************
        PdfPTable tabla12 = new PdfPTable(2);
        tabla12.setWidthPercentage(100);
        PdfPCell formaInicioEnfermedad = new PdfPCell(new Phrase("Forma de inicio de la enfermedad"));
        formaInicioEnfermedad.setVerticalAlignment(Element.ALIGN_MIDDLE);
        formaInicioEnfermedad.setHorizontalAlignment(1);
        formaInicioEnfermedad.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos4 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getMotivoconsul().getFormainicioenf()));

        tabla12.addCell(formaInicioEnfermedad);
        tabla12.addCell(datos4);
        documento.add(tabla12);

        //******************************************************
        PdfPTable tabla13 = new PdfPTable(2);
        tabla13.setWidthPercentage(100);
        PdfPCell relato = new PdfPCell(new Phrase("Relato"));
        relato.setVerticalAlignment(Element.ALIGN_MIDDLE);
        relato.setHorizontalAlignment(1);
        relato.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos5 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getMotivoconsul().getRelato()));

        tabla13.addCell(relato);
        tabla13.addCell(datos5);
        documento.add(tabla13);
        documento.add(Chunk.NEXTPAGE);

        //****************Antecedentes********************************
        Paragraph subTitulo3 = new Paragraph("Antecedentes", fuente);
        documento.add(subTitulo3);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla14 = new PdfPTable(2);
        tabla14.setWidthPercentage(100);
        PdfPCell patologicos = new PdfPCell(new Phrase("Patológicos"));
        patologicos.setVerticalAlignment(Element.ALIGN_MIDDLE);
        patologicos.setHorizontalAlignment(1);
        patologicos.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos6 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getAntecedentes().getPatologicos()));

        tabla14.addCell(patologicos);
        tabla14.addCell(datos6);
        documento.add(tabla14);

        //******************************************************
        PdfPTable tabla15 = new PdfPTable(2);
        tabla15.setWidthPercentage(100);
        PdfPCell farmFrecuentes = new PdfPCell(new Phrase("Fármacos\nfrecuentes"));
        farmFrecuentes.setVerticalAlignment(Element.ALIGN_MIDDLE);
        farmFrecuentes.setHorizontalAlignment(1);
        farmFrecuentes.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos7 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getAntecedentes().getFarmacosfrec()));

        tabla15.addCell(farmFrecuentes);
        tabla15.addCell(datos7);
        documento.add(tabla15);

        //******************************************************
        PdfPTable tabla16 = new PdfPTable(2);
        tabla16.setWidthPercentage(100);
        PdfPCell habNocivos = new PdfPCell(new Phrase("Hábitos nocivos"));
        habNocivos.setVerticalAlignment(Element.ALIGN_MIDDLE);
        habNocivos.setHorizontalAlignment(1);
        habNocivos.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos8 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getAntecedentes().getHabitnocivo()));

        tabla16.addCell(habNocivos);
        tabla16.addCell(datos8);
        documento.add(tabla16);

        //******************************************************
        PdfPTable tabla17 = new PdfPTable(2);
        tabla17.setWidthPercentage(100);
        PdfPCell hereditarios = new PdfPCell(new Phrase("Hereditarios"));
        hereditarios.setVerticalAlignment(Element.ALIGN_MIDDLE);
        hereditarios.setHorizontalAlignment(1);
        hereditarios.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell datos9 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getAntecedentes().getHereditarios()));

        tabla17.addCell(hereditarios);
        tabla17.addCell(datos9);
        documento.add(tabla17);
        documento.add(Chunk.NEWLINE);

        //******************Examen Físico************************
        Paragraph subTitulo4 = new Paragraph("Examen Físico", fuente);

        documento.add(subTitulo4);
        documento.add(Chunk.NEWLINE);

        Paragraph subTitulo5 = new Paragraph("Imprension General: " + aperturahistoriaseleccionada.getExamenfisic().getImpgeneral());
        documento.add(subTitulo5);

        //****************Evaluación por sistemas**********************
        Paragraph subTitulo6 = new Paragraph("Evaluación por sistemas:");
        documento.add(subTitulo6);
        documento.add(Chunk.NEWLINE);

        PdfPTable tabla18 = new PdfPTable(1);
        tabla18.setWidthPercentage(100);
        PdfPCell datos10 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getExamenfisic().getEvaluacionsitsemas()));
        tabla18.addCell(datos10);
        documento.add(tabla18);
        documento.add(Chunk.NEXTPAGE);

        //****************************************************** 
        Paragraph subTitulo7 = new Paragraph("Apreciación", fuente);
        documento.add(subTitulo7);
        documento.add(Chunk.NEWLINE);

        Paragraph texto = new Paragraph(aperturahistoriaseleccionada.getApreciacion());
        texto.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(texto);
        documento.add(Chunk.NEWLINE);

        //Impresión diagnóstica 
        Paragraph subTitulo8 = new Paragraph("Impresión diagnóstica ", fuente);
        documento.add(subTitulo8);
        documento.add(Chunk.NEWLINE);

        Paragraph subTitulo9 = new Paragraph(aperturahistoriaseleccionada.getImpresiondiagnost());
        subTitulo9.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(subTitulo9);
        documento.add(Chunk.NEWLINE);

        //Plan
        Paragraph subTitulo10 = new Paragraph("Plan", fuente);
        documento.add(subTitulo10);
        documento.add(Chunk.NEWLINE);

        Paragraph subTitulo11 = new Paragraph(aperturahistoriaseleccionada.getPlan());
        subTitulo9.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(subTitulo11);
        documento.add(Chunk.NEWLINE);
        documento.add(Chunk.NEWLINE);
        documento.add(Chunk.NEWLINE);

        for (int i = 0; i < aperturahistoriaseleccionada.getListaevoluciones().getCantidad(); i++) {
            documento.add(Chunk.NEXTPAGE);
            Paragraph subTitulo12 = new Paragraph("Evolución", fuente);
            documento.add(subTitulo12);
            documento.add(Chunk.NEWLINE);

            Paragraph subTitulo13 = new Paragraph("Fecha: " + aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getFechaevo());
            subTitulo13.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(subTitulo13);
            documento.add(Chunk.NEWLINE);

            Paragraph subTitulo14 = new Paragraph("Hora: " + aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getHoraevo());
            subTitulo13.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(subTitulo14);
            documento.add(Chunk.NEWLINE);
            
            Paragraph subTitulo99 = new Paragraph("Código de la historia:  " + aperturahistoriaseleccionada.getCodigohistoriaclinica());
            subTitulo13.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(subTitulo99);
            documento.add(Chunk.NEWLINE);
            //tabla 22 
            PdfPTable tabla22 = new PdfPTable(2);
            tabla22.setWidthPercentage(100);
            PdfPCell subjetivo = new PdfPCell(new Phrase("Subjetivo"));
            subjetivo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            subjetivo.setHorizontalAlignment(1);
            subjetivo.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell datos14 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getSubjetivo()));

            tabla22.addCell(subjetivo);
            tabla22.addCell(datos14);
            documento.add(tabla22);

            //tabla 23 
            PdfPTable tabla23 = new PdfPTable(2);
            tabla23.setWidthPercentage(100);
            PdfPCell objetivo = new PdfPCell(new Phrase("Objetivo"));
            objetivo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            objetivo.setHorizontalAlignment(1);
            objetivo.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell datos15 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getObjetivo()));

            tabla23.addCell(objetivo);
            tabla23.addCell(datos15);
            documento.add(tabla23);

            //tabla 24 
            PdfPTable tabla24 = new PdfPTable(2);
            tabla24.setWidthPercentage(100);
            PdfPCell apreciacion = new PdfPCell(new Phrase("Apreciación"));
            apreciacion.setVerticalAlignment(Element.ALIGN_MIDDLE);
            apreciacion.setHorizontalAlignment(1);
            apreciacion.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell datos16 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getApreciacion()));

            tabla24.addCell(apreciacion);
            tabla24.addCell(datos16);
            documento.add(tabla24);

            //tabla 25 
            PdfPTable tabla25 = new PdfPTable(2);
            tabla25.setWidthPercentage(100);
            PdfPCell plan = new PdfPCell(new Phrase("Plan"));
            plan.setVerticalAlignment(Element.ALIGN_MIDDLE);
            plan.setHorizontalAlignment(1);
            plan.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell datos17 = new PdfPCell(new Phrase(aperturahistoriaseleccionada.getListaevoluciones().ObtenerNodoConPosInicioFin(i).elemento.getPlan()));

            tabla25.addCell(plan);
            tabla25.addCell(datos17);
            documento.add(tabla25);
        }

        documento.close();

        JOptionPane.showMessageDialog(null, "Apertura Historia Clínica PDF creado correctamente", "Información", 1);

    }

}
