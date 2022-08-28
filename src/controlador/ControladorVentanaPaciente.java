/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Paciente;
import modelo.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.JFrameBuscarAreasMedicas;
import vista.JFrameLogin;
import vista.JFrameMenuPaciente;
import vista.JFrameReservarCita;

/**
 *
 * @author Favio
 */
public class ControladorVentanaPaciente {

    private Paciente pacienteAt;
    private JFrameMenuPaciente vistaAt;
    private Sistema sistemaAt;

    public ControladorVentanaPaciente(Paciente pacientePa, JFrameMenuPaciente vistaPa, Sistema sistemaPa) {
        this.pacienteAt = pacientePa;
        this.vistaAt = vistaPa;
        this.sistemaAt = sistemaPa;
     
        
        
        iniciarVista();

        this.vistaAt.reservarCita_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPa.dispose();
                JFrameReservarCita vistaReservarCita = new JFrameReservarCita();
                ControladorReservarCita reservarcita = new ControladorReservarCita(vistaReservarCita, pacientePa, sistemaPa, "", "");
                
                vistaReservarCita.setTitle("Reservar Cita");
            }
        });

        this.vistaAt.salir_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameLogin jfl = new JFrameLogin();
                ControladorLogueo ctl = new ControladorLogueo(jfl, sistemaPa);
                vistaPa.dispose();
                jfl.setVisible(true);
                jfl.setLocationRelativeTo(null);
                jfl.setTitle("Ingreso Usuarios");
                jfl.setResizable(false);
                
            }
        });
        
        this.vistaAt.buscarEspecialidad_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPa.dispose();
                JFrameBuscarAreasMedicas vistaBuscAreaMedicas = new JFrameBuscarAreasMedicas();
                ControladorBuscarAreasMedicas bam = new ControladorBuscarAreasMedicas(vistaBuscAreaMedicas, pacientePa, sistemaPa);
                vistaBuscAreaMedicas.setTitle("Buscar Áreas Médicas");
            }
        });
        
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.lbl_nombresPaciente.setText(pacienteAt.getNombres());
        vistaAt.lbl_codigoPacien.setText(pacienteAt.getCodigoPaciente());
        
    }

}
