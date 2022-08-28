/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import controlador.ControladorVentanaMedico;
import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Evolucion;
import modelo.Paciente;
import modelo.PersonaResp;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorCrearHistClinicaEVOL {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaEVOLUC vistaAt;
    private Sistema sistemaAt;

    public ControladorCrearHistClinicaEVOL(HistoriaClinicaApertura HistoriaClinicaAt, Medico medicoAt, JFrameHistoriaClinicaEVOLUC vitaAt, Sistema sistema) {
        this.historiaAt = HistoriaClinicaAt;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;
        iniciarVista();
        txtblock();
        cargardatosBasicos();

        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();

                JFrameMenuMedico vistaMedico = new JFrameMenuMedico();

                ControladorVentanaMedico controMenuMedico = new ControladorVentanaMedico(medicoAt, sistema, vistaMedico);

            }
        });

        vistaAt.btn_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              

                Paciente paciente;
                PersonaResp perResponsable;

                String subjetivo = vistaAt.txtf_Subjet.getText(), objetivo = vistaAt.txtf_Obj.getText(), apreciacion = vistaAt.txtf_Apreciacion.getText(), plan = vistaAt.txtf_Plan.getText();
                Evolucion evoluciontemp = new Evolucion(vistaAt.txtf_fecha.getText(), vistaAt.txtf_Hora.getText(), subjetivo, objetivo, apreciacion, plan);

                historiaAt.getListaevoluciones().agregarAlFinal(evoluciontemp);

            }
        });
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        

    }

    public void txtblock() {
        vistaAt.txtf_fecha.setEditable(false);
        vistaAt.txtf_Hora.setEditable(false);
        vistaAt.txtf_CodigoHistoria.setEditable(false);
    }

    public void cargardatosBasicos() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        vistaAt.txtf_fecha.setText(dtf.format(LocalDateTime.now()));
        DateTimeFormatter dth = DateTimeFormatter.ofPattern("HH:mm");
        vistaAt.txtf_Hora.setText(dth.format(LocalDateTime.now()));
        vistaAt.txtf_CodigoHistoria.setText(historiaAt.getCodigohistoriaclinica());
        
        
        
    }
}
