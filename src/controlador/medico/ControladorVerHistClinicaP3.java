/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import controlador.medico.ControladorVerHistClinicaP2;
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
public class ControladorVerHistClinicaP3 {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP3 vistaAt;
    private Sistema sistemaAt;

    public ControladorVerHistClinicaP3(HistoriaClinicaApertura historiaAT, Medico medicoAt, JFrameHistoriaClinicaP3 vitaAt, Sistema sistema) {
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
                JFrameHistoriaClinicaP2 vistahistp2 = new JFrameHistoriaClinicaP2();

                ControladorVerHistClinicaP2 controladorhistp2 = new ControladorVerHistClinicaP2(historiaAT, medicoAt, vistahistp2, sistemaAt);

            }
        });
        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP4 vistaHistclip4= new JFrameHistoriaClinicaP4();
                
                ControladorVerHistClinicaP4 controlHistclip4 = new ControladorVerHistClinicaP4(historiaAT, medicoAt, vistaHistclip4, sistemaAt);
                
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
        vistaAt.txtf_AntPatolog.setEditable(false);
        vistaAt.txtf_AntFarmcFrec.setEditable(false);
        vistaAt.txtf_AntHabNociv.setEditable(false);
        vistaAt.txtf_AntHereditario.setEditable(false);
        vistaAt.txtf_ImpresionGene.setEditable(false);
        vistaAt.txtf_EFESistemas.setEditable(false);
        
        
    }
    public void cargardatos(){
        
         //Antecedentes
        
         vistaAt.txtf_AntPatolog.setText(historiaAt.getAntecedentes().getPatologicos());
         vistaAt.txtf_AntFarmcFrec.setText(historiaAt.getAntecedentes().getFarmacosfrec());
         vistaAt.txtf_AntHabNociv.setText(historiaAt.getAntecedentes().getHabitnocivo());
         vistaAt.txtf_AntHereditario.setText(historiaAt.getAntecedentes().getHereditarios());
         
         //Examen Fisico 
         
         vistaAt.txtf_ImpresionGene.setText(historiaAt.getExamenfisic().getImpgeneral());
         
         //evaluacion por sistemas 
         vistaAt.txtf_EFESistemas.setText(historiaAt.getExamenfisic().getEvaluacionsitsemas());
         
         
    }
}
