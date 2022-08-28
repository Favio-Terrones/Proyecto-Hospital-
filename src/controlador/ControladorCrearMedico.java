/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import modelo.Administrador;
import modelo.Medico;
import modelo.Sistema;
import vista.JFrameCrearMedico;
import vista.JFrameUsuariosSistema;

/**
 *
 * @author Favio
 */
public class ControladorCrearMedico {

    JFrameCrearMedico vistaAt;
    Administrador adminAt;
    Sistema sistemaAt;

    public ControladorCrearMedico(JFrameCrearMedico vistaPa, Administrador adminPa, Sistema sistemaPa) {
        this.vistaAt = vistaPa;
        this.adminAt = adminPa;
        this.sistemaAt = sistemaPa;

        iniciarVista();

        this.vistaAt.btn_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameUsuariosSistema jus = new JFrameUsuariosSistema();
                ControladorUsuariosSistema cus = new ControladorUsuariosSistema(jus, adminAt, sistemaAt);
                vistaPa.dispose();
                jus.setVisible(true);
                jus.setLocationRelativeTo(null);
                jus.setResizable(false);
            }
        });

        this.vistaAt.btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Medico medico;

                medico = new Medico(vistaAt.txtf_CodigoMedico.getText(), 
                        vistaPa.txtf_nombres.getText(), 
                        vistaAt.txtf_Apellidos.getText(), 
                        Integer.valueOf(vistaAt.txtf_aniosServicio.getText()), 
                        vistaAt.txtf_numDoc.getText(), 
                        vistaAt.txtf_nomCuenta.getText(), 
                        vistaAt.txtf_contraseña.getText(), 
                        vistaAt.txtf_especialidad.getText(), 
                        vistaAt.txtf_NumEsp.getText());

                sistemaAt.getListamedicos().agregarAlFinal(medico);
                JOptionPane.showMessageDialog(vistaAt, "Médico creado con exito");
                
            }
        });
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
    }

}
