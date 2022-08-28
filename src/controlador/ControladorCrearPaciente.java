/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Administrador;
import modelo.Paciente;
import modelo.Sistema;
import vista.JFrameCrearPaciente;
import vista.JFrameUsuariosSistema;

/**
 *
 * @author Favio
 */
public class ControladorCrearPaciente {
    
    JFrameCrearPaciente vistaAt;
    Administrador adminAt;
    Sistema sistemaAt;
    
    public ControladorCrearPaciente(JFrameCrearPaciente vistaPa, Administrador adminPa, Sistema sistemaPa) {
        this.vistaAt = vistaPa;
        this.adminAt = adminPa;
        this.sistemaAt = sistemaPa;
        iniciarVista();
        
        this.vistaAt.btn_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JFrameUsuariosSistema jus = new JFrameUsuariosSistema();
                ControladorUsuariosSistema cus = new ControladorUsuariosSistema(jus, adminPa, sistemaPa);
                vistaPa.dispose();
                jus.setVisible(true);
                jus.setLocationRelativeTo(null);
                jus.setResizable(false);
                
            }
        });
        
        this.vistaAt.btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente paciente;
                
                paciente = new Paciente(vistaAt.txtf_codHistoria.getText(),
                        vistaAt.txtf_documento.getText(),
                        vistaAt.txtf_tipDoc.getText(),
                        vistaAt.txtf_apPat.getText(),
                        vistaAt.txtf_apMat.getText(),
                        vistaAt.txtf_nombres.getText(),
                        vistaAt.txtf_sexo.getText(),
                        vistaAt.txtf_edad.getText(),
                        vistaAt.txtf_nomCuenta.getText(),
                        vistaAt.txtf_contrasenia.getText());
                sistemaAt.getListapacientes().agregarAlFinal(paciente);
                JOptionPane.showMessageDialog(vistaAt, "Paciente creado con exito");
                
            }
        });
        
    }
    
    public void iniciarVista() {
        
        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
    }
}
