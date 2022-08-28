/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Medico;
import modelo.Paciente;
import modelo.Sistema;
import vista.JFrameMenuPaciente;
import vista.JFrameReservarCita;

/**
 *
 * @author Favio
 */
public class ControladorReservarCita {

    JFrameReservarCita vistaAt;
    Paciente pacienteAt;
    Sistema sistemaAt;
    String nombreesp;
    String numeroesp;

    public ControladorReservarCita(JFrameReservarCita vista, Paciente paciente, Sistema sistema, String nombreespPa, String numeroespPa) {
        this.vistaAt = vista;
        this.pacienteAt = paciente;
        this.sistemaAt = sistema;
        this.nombreesp = nombreespPa;
        this.numeroesp = numeroespPa;

        iniciarVista();
        cargardatos();
        this.vistaAt.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameMenuPaciente jfm = new JFrameMenuPaciente();
                ControladorVentanaPaciente cvp = new ControladorVentanaPaciente(paciente, jfm, sistema);
                vista.dispose();
                jfm.setVisible(true);
                jfm.setLocationRelativeTo(null);
                jfm.setResizable(false);
            }
        });
        this.vistaAt.generar_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombrearea;
                String numeroarea;
                nombrearea = vistaAt.txf_areamedica.getText();
                numeroarea = vistaAt.txtf_numeroarea.getText();
                if(vistaAt.jdate_calendario.getDate()!=null){
                    if (sistemaAt.getListamedicos().ObtenerNodoConEspyNumero(nombrearea, numeroarea) != null) {
                    if (sistemaAt.getListamedicos().asignarCitaAunMedico(sistemaAt.getListamedicos().ObtenerNodoConEspyNumero(nombrearea, numeroarea).elemento.getCodigomedico(), String.valueOf(vistaAt.jdate_calendario.getDate().getDate()), pacienteAt)) {
                        JOptionPane.showMessageDialog(vistaAt, "Cita asignada con exito", "Cita", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(vistaAt, "Error al asignar cita", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(vistaAt, "Error al asignar cita", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }
                }else{
                    JOptionPane.showMessageDialog(vistaAt, "Error al asignar cita", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }
                
                

            }
        });

    }

    public void iniciarVista() {
        /*
        Date mes=new Date();
        mes.setDate(mes.getDate()+30);
        // Esto de abajo otorga el día maximo del mes
        //Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        //        
        vistaAt.jdate_calendario.setMaxSelectableDate(mes);
        vistaAt.jdate_calendario.setMinSelectableDate(new Date());
        */
        
        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.lbl_nombre.setText(pacienteAt.getNombres());
        vistaAt.lbl_apellidos.setText(pacienteAt.getApellPat()+"   "+pacienteAt.getApellMat());
        
    }

    public void cargardatos() {
        vistaAt.txf_areamedica.setText(nombreesp);
        vistaAt.txtf_numeroarea.setText(numeroesp);
    }

    public void bloquear() {
        vistaAt.txf_areamedica.setEditable(false);
        vistaAt.txtf_numeroarea.setEditable(false);
    }
}
