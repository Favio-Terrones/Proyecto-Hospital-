/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.medico.ControladorCrearHistClinicaP1;
import controlador.medico.ControladorCrearListadeHistoriasResumidas;
import controlador.medico.ControladorVerListadeHistoriasResumidas;
import modelo.Paciente;
import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import controlador.medico.ControladorVerHistClinicaP1;
import datos.Datos;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;

/**
 *
 * @author Favio
 */
public class ControladorVentanaMedico {

    private Medico medicoAt;
    private Sistema sistemaAt;
    private JFrameMenuMedico vistaAt;
    private Paciente pacienteAt;

    public ControladorVentanaMedico(Medico medico, Sistema sistema, JFrameMenuMedico vista) {
        this.medicoAt = medico;
        this.sistemaAt = sistema;
        this.vistaAt = vista;

        iniciarVista();

        vistaAt.btn_VerHistCli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigopaciente = JOptionPane.showInputDialog("Escriba el codigo del paciente para ver su Historia Clinica");

                if (codigopaciente != null) {
                    if (Datos.isNumeric(codigopaciente)) {
                        if (sistema.getListapacientes().VerificarSiExisteConCodigo(codigopaciente) == true) {
                            Paciente pacientetest = sistema.getListapacientes().ObtenerNodoConCodigo(codigopaciente).elemento;

                            if (medicoAt.checkpacientecita(pacientetest.getCodigoPaciente())) {
                                
                                if (medicoAt.checkpacientecitaDiahora(pacientetest.getCodigoPaciente())) {

                                    if (sistema.getListahistoriassistema().VerificarSiExisteConCodigoPaciente(codigopaciente) == true) {
                                        vistaAt.dispose();
                                        pacienteAt = pacientetest;
                                        JFrameListaHistoriasPaciente vistalistahistorias = new JFrameListaHistoriasPaciente();
                                        ControladorVerListadeHistoriasResumidas controladorlistahistorias = new ControladorVerListadeHistoriasResumidas(sistemaAt.getListahistoriassistema().ObtenerListaDeHistoriasConCodPaciente(codigopaciente), vistalistahistorias, medicoAt, sistemaAt, vistaAt);
                                    } else {
                                        JOptionPane.showMessageDialog(vistaAt, "El paciente no tiene ninguna Historia Clínica ");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(vistaAt, "No esta en la hora de la cita");

                                }

                            } else {
                                JOptionPane.showMessageDialog(vistaAt, "El paciente no tiene cita con este medico");
                            }
                        } else {

                            JOptionPane.showMessageDialog(vistaAt, "El paciente no existe en la lista de pacientes");

                        }
                    } else {
                        JOptionPane.showMessageDialog(vistaAt, "Digite valores numericos");
                    }
                } else {
                    
                }

            }
        });

        vistaAt.btn_GenHistCli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigopaciente = JOptionPane.showInputDialog("Escriba el codigo del paciente para generar la apertura de HC");
                if (codigopaciente != null) {
                    if (Datos.isNumeric(codigopaciente)) {
                        if (sistema.getListapacientes().VerificarSiExisteConCodigo(codigopaciente) == true) {
                            Paciente pacientetest = sistema.getListapacientes().ObtenerNodoConCodigo(codigopaciente).elemento;

                            if (medicoAt.checkpacientecita(pacientetest.getCodigoPaciente())) {

                                if (medicoAt.checkpacientecitaDiahora(pacientetest.getCodigoPaciente())) {
                                    vistaAt.dispose();
                                    pacienteAt = pacientetest;
                                    JFrameHistoriaClinicaP1 vistahistp1 = new JFrameHistoriaClinicaP1();
                                    HistoriaClinicaApertura historiaClinica = new HistoriaClinicaApertura();
                                    ControladorCrearHistClinicaP1 controladorCrearhistp1 = new ControladorCrearHistClinicaP1(historiaClinica, medicoAt, vistahistp1, sistemaAt, pacientetest);

                                } else {
                                    JOptionPane.showMessageDialog(vistaAt, "No esta en la hora de la cita");
                                }

                            } else {
                                JOptionPane.showMessageDialog(vistaAt, "El paciente no tiene cita con usted");
                            }

                        } else {

                            JOptionPane.showMessageDialog(vistaAt, "El paciente no existe en la lista de pacientes");
                        }

                    } else {
                        JOptionPane.showMessageDialog(vistaAt, "Digite valores numericos");

                    }
                } else {

                }

            }
        });

        vistaAt.btn_AniadirEvol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigopaciente = JOptionPane.showInputDialog("Escriba el codigo del paciente para generar la apertura de HC");

                if (codigopaciente != null) {

                    if (Datos.isNumeric(codigopaciente)) {
                        if (codigopaciente.length() > 9) {
                            codigopaciente = codigopaciente.substring(0, 9);
                        }

                        if (sistema.getListapacientes().VerificarSiExisteConCodigo(codigopaciente) == true) {
                            Paciente pacientetest = sistema.getListapacientes().ObtenerNodoConCodigo(codigopaciente).elemento;

                            if (medicoAt.checkpacientecita(pacientetest.getCodigoPaciente())) {

                                if (medicoAt.checkpacientecitaDiahora(pacientetest.getCodigoPaciente())) {
                                    vistaAt.dispose();
                                    pacienteAt = pacientetest;
                                    JFrameListaHistoriasPaciente vistaListaHistorias = new JFrameListaHistoriasPaciente();
                                    ControladorCrearListadeHistoriasResumidas controladorTablaHistorias = new ControladorCrearListadeHistoriasResumidas(sistemaAt.getListahistoriassistema().ObtenerListaDeHistoriasConCodPaciente(codigopaciente), vistaListaHistorias, medicoAt, sistemaAt, vistaAt);

                                } else {
                                    JOptionPane.showMessageDialog(vistaAt, "No esta en la hora de la cita");

                                }

                            } else {
                                JOptionPane.showMessageDialog(vistaAt, "El paciente no tiene cita con usted");

                            }

                        } else {

                            JOptionPane.showMessageDialog(vistaAt, "El paciente no existe en la lista de pacientes");
                        }
                    } else {
                        JOptionPane.showMessageDialog(vistaAt, "Digite valores numericos");

                    }

                } else {

                }

            }
        });

        this.vistaAt.btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrameLogin jfl = new JFrameLogin();
                ControladorLogueo ctl = new ControladorLogueo(jfl, sistemaAt);

                if (pacienteAt != null) {
                    medicoAt.setCodigopacientecitaTerminada(pacienteAt.getCodigoPaciente());
                    pacienteAt.setTienecita(false);
                } else {
                }

                vistaAt.dispose();
                jfl.setVisible(true);
                jfl.setResizable(false);
                jfl.setLocationRelativeTo(null);
            }
        });

        this.vistaAt.btn_CancCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigopaciente = JOptionPane.showInputDialog("Escriba el codigo del paciente para cancelar la cita  ");

                if (codigopaciente != null) {

                    if (Datos.isNumeric(codigopaciente)) {
                        if (codigopaciente.length() > 9) {
                            codigopaciente = codigopaciente.substring(0, 9);
                        }

                        if (sistema.getListapacientes().VerificarSiExisteConCodigo(codigopaciente) == true) {
                            Paciente pacientetest = sistema.getListapacientes().ObtenerNodoConCodigo(codigopaciente).elemento;
                            pacienteAt = pacientetest;
                            if (medicoAt.checkpacientecita(pacientetest.getCodigoPaciente())) {
                                medicoAt.setCodigopacientecitaTerminada(pacienteAt.getCodigoPaciente());
                                pacienteAt.setTienecita(false);
                                JOptionPane.showMessageDialog(vistaAt, "Cita terminada");

                            } else {
                                JOptionPane.showMessageDialog(vistaAt, "El paciente no tiene cita con usted");

                            }

                        } else {

                            JOptionPane.showMessageDialog(vistaAt, "El paciente no existe en la lista de pacientes");
                        }
                    } else {
                        JOptionPane.showMessageDialog(vistaAt, "Digite valores numericos");

                    }

                } else {

                }

            }
        });

    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.lbl_nombresmedico.setText(medicoAt.getNombres());
        vistaAt.lbl_codigoMedico.setText(medicoAt.getCodigomedico());

    }
}
