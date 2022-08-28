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
public class ControladorCrearHistClinicaP4 {
    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP4 vistaAt;
    private Sistema sistemaAt;
    private Paciente pacienteAt;
    public ControladorCrearHistClinicaP4(HistoriaClinicaApertura historiaPa, Medico medicoAt, JFrameHistoriaClinicaP4 vitaAt, Sistema sistema,Paciente pacientePa) {
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
                JFrameHistoriaClinicaP3 vistahistp3 = new JFrameHistoriaClinicaP3();
                ControladorCrearHistClinicaP3 controladorhistp3 = new ControladorCrearHistClinicaP3(historiaPa, medicoAt, vistahistp3, sistemaAt,pacienteAt);

            }
        });
        
        
        vistaAt.btn_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                historiaAt.setApreciacion(vistaAt.txtf_Apreciacion.getText());
                historiaAt.setImpresiondiagnost(vistaAt.txtf_ImpDiag.getText());
                historiaAt.setPlan(vistaAt.txtf_Plan.getText());
                JOptionPane.showMessageDialog(vistaAt, "Datos guardados con exito");
                
            }
        });
        
        
    }
    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.jPanel1.remove(vistaAt.btn_Sig);
    }
    
    public void cargardatos(){
        vistaAt.txtf_Apreciacion.setText(historiaAt.getApreciacion());
        vistaAt.txtf_ImpDiag.setText(historiaAt.getImpresiondiagnost());
        vistaAt.txtf_Plan.setText(historiaAt.getPlan());
    }
}
