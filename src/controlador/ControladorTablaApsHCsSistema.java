/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.medico.ControladorVerHistClinicaP1;
import java.awt.Desktop;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Administrador;
import modelo.HistoriaClinicaApertura;
import modelo.Sistema;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorTablaApsHCsSistema {

    JFrameAperturasHistoriasSistema vistaAt;
    Sistema sistemaAt;
    Administrador adminAt;
    HistoriaClinicaApertura aperturahistoriaseleccionada;
    String codigohistoria;

    public ControladorTablaApsHCsSistema(JFrameAperturasHistoriasSistema vistaPa, Sistema sistemaPa, Administrador adminPa) {

        this.vistaAt = vistaPa;
        this.sistemaAt = sistemaPa;
        this.adminAt = adminPa;
        iniciarVista();
        ActualizarTabla();
        this.vistaAt.btn_Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameMenuAdministrador vistaAdministrador = new JFrameMenuAdministrador();
                ControladorVentanaAdministrador ventanaAdministrador = new ControladorVentanaAdministrador(vistaAdministrador, adminAt, sistemaAt);

            }
        });

        this.vistaAt.btn_ExportarAperturaFila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int fila = vistaPa.jtable_Aperturas.getSelectedRow();

                if (fila != -1) {
                    codigohistoria = (String) vistaPa.jtable_Aperturas.getValueAt(fila, 0);

                    aperturahistoriaseleccionada = sistemaAt.getListahistoriassistema().ObtenerNodoConCodigoHistoria(codigohistoria).elemento;
                    
                    try {
                        sistemaAt.exportarAperturaPDF("Apertura de Historia Clínica N°" +aperturahistoriaseleccionada.getCodigohistoriaclinica(),aperturahistoriaseleccionada);
                    } catch (DocumentException ex) {
                        Logger.getLogger(ControladorTablaApsHCsSistema.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ControladorTablaApsHCsSistema.class.getName()).log(Level.SEVERE, null, ex);
                    }

                   

                } else {

                }

            }
        });
        this.vistaAt.jtable_Aperturas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    
                    
                    String codigohistoria =(String) vistaAt.jtable_Aperturas.getValueAt(row, 0);
                    JOptionPane.showMessageDialog(null, "Se selecciono :  " + codigohistoria); 
             
                    
                    
                    vistaAt.dispose();
                    
                    
                    HistoriaClinicaApertura historiaTest = sistemaAt.getListahistoriassistema().ObtenerNodoConCodigoHistoria(codigohistoria).elemento;
                    JFrameHistoriaClinicaP1 vistahistp1 = new JFrameHistoriaClinicaP1();
                    ControladorVerHistClinicaP1 controladorhistp1 = new ControladorVerHistClinicaP1(historiaTest, null, vistahistp1, sistemaAt);
                    
                    
                }
            }
        });
        
        this.vistaAt.btn_OrdCodigoPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                sistemaAt.getListahistoriassistema().IniciarQuickSortCodigoPaciente();
                ActualizarTabla();
                        
            }
        });
        
        
        this.vistaAt.btn_OrdCodigoAperturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                sistemaAt.getListahistoriassistema().IniciarQuickSortCodigoHistoria();
                ActualizarTabla();
                        
            }
        });
        
        this.vistaAt.btn_OrdCodigoMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                sistemaAt.getListahistoriassistema().IniciarQuickSortCodigoMedico();
                ActualizarTabla();
                        
            }
        });
        
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.btn_ExportarAperturaFila.setText("<html>Exportar Apertura<br />  Seleccionada</html>");
    }

    public void ActualizarTabla() {
        DefaultTableModel modelotabla = new DefaultTableModel(sistemaAt.getListahistoriassistema().getDatosCompletoInicioFinal(), sistemaAt.getListahistoriassistema().getCabeceraCompleta());
        this.vistaAt.jtable_Aperturas.setModel(modelotabla);

    }

    
    

}
