/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Paciente;
import modelo.Sistema;
import modelo.Administrador;
import modelo.Medico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;
import datos.*;

/**
 *
 * @author Favio
 */
public class ControladorLogueo {

    JFrameLogin vista;
    Sistema sistema;
    
    public ControladorLogueo(JFrameLogin vistaPa, Sistema sistema) {
        this.vista = vistaPa;
        this.sistema = sistema;

        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if (sistema.getListaadmins().VerificarSiExisteConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())) == true) {
                    Administrador admin = sistema.getListaadmins().ObtenerNodoConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())).elemento;
                    vistaPa.dispose();
                    JFrameMenuAdministrador vistaAdministrador = new JFrameMenuAdministrador();
                    ControladorVentanaAdministrador ventanaAdministrador = new ControladorVentanaAdministrador(vistaAdministrador, admin, sistema);
                    vistaAdministrador.setTitle("Menú Administrador");
                } else {
                    if (sistema.getListapacientes().VerificarSiExisteConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())) == true) {
                        
                        Paciente pacienteobtenido = sistema.getListapacientes().ObtenerNodoConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())).elemento;
                        
                        vistaPa.dispose();
                        JFrameMenuPaciente vistaPaciente = new JFrameMenuPaciente();
                        ControladorVentanaPaciente ventanaPaciente = new ControladorVentanaPaciente(pacienteobtenido, vistaPaciente, sistema);
                        vistaPaciente.setTitle("Menú Paciente");
                    } else {
                        if (sistema.getListamedicos().VerificarSiExisteConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())) == true) {
                            
                            Medico medico = sistema.getListamedicos().ObtenerNodoConNombreyContra(vistaPa.usuarioTXF.getText(), String.valueOf(vistaPa.contraseñaTXF.getPassword())).elemento;
                            vistaPa.dispose();
                            JFrameMenuMedico vistaMedico = new JFrameMenuMedico();

                            ControladorVentanaMedico ventanaMedico = new ControladorVentanaMedico(medico, sistema, vistaMedico);

                            vistaMedico.setTitle("Menú Medico");
                        } else {

                            
                            JOptionPane.showMessageDialog(vistaPa, "DATOS NO VALIDOS", "ERROR DE SESIÓN", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }

            }
        });

        

    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.setResizable(false);
        this.vista.setTitle("Ingreso de Usuarios");
    }

}
