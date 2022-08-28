/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import controlador.medico.ControladorVerHistClinicaP3;
import controlador.medico.ControladorVerHistClinicaEVOL;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorVerHistClinicaP4 {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP4 vistaAt;
    private Sistema sistemaAt;

    public ControladorVerHistClinicaP4(HistoriaClinicaApertura historiaAT, Medico medicoAt, JFrameHistoriaClinicaP4 vitaAt, Sistema sistema) {
        this.historiaAt = historiaAT;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;

        iniciarVista();
        txtblock();
        cargardatos();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP3 vistahistp3 = new JFrameHistoriaClinicaP3();

                ControladorVerHistClinicaP3 controladorhistp3 = new ControladorVerHistClinicaP3(historiaAT, medicoAt, vistahistp3, sistemaAt);

            }
        });
        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP5 vistaHistclip5= new JFrameHistoriaClinicaP5();
                
                ControladorVerHistClinicaP5ListasEvol controlHistclip5 = new ControladorVerHistClinicaP5ListasEvol(historiaAT, medicoAt, vistaHistclip5, sistemaAt);
                
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
        vistaAt.txtf_Apreciacion.setEditable(false);
        vistaAt.txtf_ImpDiag.setEditable(false);
        vistaAt.txtf_Plan.setEditable(false);
        
    }
    public void cargardatos(){
        vistaAt.txtf_Apreciacion.setText(historiaAt.getApreciacion());
        vistaAt.txtf_ImpDiag.setText(historiaAt.getImpresiondiagnost());
        vistaAt.txtf_Plan.setText(historiaAt.getPlan());
    }
}
