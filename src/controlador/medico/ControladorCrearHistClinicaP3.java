/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import modelo.Paciente;
import modelo.Sistema;
import vista.JFrameHistoriaClinicaP1;
import vista.JFrameHistoriaClinicaP2;
import vista.JFrameHistoriaClinicaP3;
import vista.JFrameHistoriaClinicaP4;
import vista.JFrameMenuMedico;

/**
 *
 * @author User
 */
public class ControladorCrearHistClinicaP3 {
    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP3 vistaAt;
    private Sistema sistemaAt;
    private Paciente pacienteAt;
    public ControladorCrearHistClinicaP3(HistoriaClinicaApertura historiaPa, Medico medicoAt, JFrameHistoriaClinicaP3 vitaAt, Sistema sistema,Paciente pacientePa) {
        this.historiaAt = historiaPa;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;
        this.pacienteAt = pacientePa;
        iniciarVista();
        cargardatos();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP2 vistahistp2 = new JFrameHistoriaClinicaP2();
                ControladorCrearHistClinicaP2 controladorhistp2 = new ControladorCrearHistClinicaP2(historiaPa, medicoAt, vistahistp2, sistemaAt,pacienteAt);

            }
        });
        
        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP4 vistaHistclip4= new JFrameHistoriaClinicaP4();
                ControladorCrearHistClinicaP4 controlHistclip4 = new ControladorCrearHistClinicaP4(historiaPa, medicoAt, vistaHistclip4, sistemaAt,pacienteAt);
                
            }
        });
        
        
        vistaAt.btn_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                historiaAt.getAntecedentes().setPatologicos(vistaAt.txtf_AntPatolog.getText());
                historiaAt.getAntecedentes().setFarmacosfrec(vistaAt.txtf_AntFarmcFrec.getText());
                historiaAt.getAntecedentes().setHabitnocivo(vistaAt.txtf_AntHabNociv.getText());
                historiaAt.getAntecedentes().setHereditarios(vistaAt.txtf_AntHereditario.getText());
                historiaAt.getExamenfisic().setImpgeneral(vistaAt.txtf_ImpresionGene.getText());
                historiaAt.getExamenfisic().setEvaluacionsitsemas(vistaAt.txtf_EFESistemas.getText());
                
                

                
                 JOptionPane.showMessageDialog(vistaAt, "Datos guardados con exito");   
            }
        });
        
        
    }
    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        
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
