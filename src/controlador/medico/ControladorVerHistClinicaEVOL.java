/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Evolucion;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorVerHistClinicaEVOL {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaEVOLUC vistaAt;
    private Sistema sistemaAt;
    private Evolucion evolucion;

    public ControladorVerHistClinicaEVOL(HistoriaClinicaApertura HistoriaClinicaAt, Medico medicoAt, JFrameHistoriaClinicaEVOLUC vitaAt, Sistema sistema,Evolucion evolucionPa) {
        this.historiaAt = HistoriaClinicaAt;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;
        this.evolucion = evolucionPa;
        iniciarVista();
        txtblock();
        cargardatos();
        
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP5 vistaHistclip5= new JFrameHistoriaClinicaP5();
                ControladorVerHistClinicaP5ListasEvol controlHistclip5 = new ControladorVerHistClinicaP5ListasEvol(historiaAt, medicoAt, vistaHistclip5, sistemaAt);
                
            }
        });
        
        
        
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.jPanel1.remove(vistaAt.btn_guardar);
        
     
       

    }
    public void txtblock(){
        vistaAt.txtf_fecha.setEditable(false);
        vistaAt.txtf_Hora.setEditable(false);
        vistaAt.txtf_CodigoHistoria.setEditable(false);
        vistaAt.txtf_Subjet.setEditable(false);
        vistaAt.txtf_Obj.setEditable(false);
        vistaAt.txtf_Apreciacion.setEditable(false);
        vistaAt.txtf_Plan.setEditable(false);
        
    }
    public void cargardatos(){
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        vistaAt.txtf_fecha.setText(dtf.format(LocalDateTime.now()));
        DateTimeFormatter dth = DateTimeFormatter.ofPattern("HH:mm");
        vistaAt.txtf_Hora.setText(dth.format(LocalDateTime.now()));
        vistaAt.txtf_CodigoHistoria.setText(historiaAt.getCodigohistoriaclinica());
        vistaAt.txtf_Subjet.setText(evolucion.getSubjetivo());
        vistaAt.txtf_Obj.setText(evolucion.getObjetivo());
        vistaAt.txtf_Apreciacion.setText(evolucion.getApreciacion());
        vistaAt.txtf_Plan.setText(evolucion.getPlan());
        
        
    }
}
