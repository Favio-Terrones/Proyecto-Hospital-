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
import vista.JFrameMenuMedico;

/**
 *
 * @author User
 */
public class ControladorCrearHistClinicaP2 {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP2 vistaAt;
    private Sistema sistemaAt;
    private Paciente pacienteAt;

    public ControladorCrearHistClinicaP2(HistoriaClinicaApertura historiaPa, Medico medicoAt, JFrameHistoriaClinicaP2 vitaAt, Sistema sistema, Paciente pacientePa) {
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
                JFrameHistoriaClinicaP1 vistahistp1 = new JFrameHistoriaClinicaP1();
                ControladorCrearHistClinicaP1 controladorhistp1 = new ControladorCrearHistClinicaP1(historiaPa, medicoAt, vistahistp1, sistemaAt, pacienteAt);

            }
        });

        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP3 vistaHistclip3 = new JFrameHistoriaClinicaP3();
                ControladorCrearHistClinicaP3 controlHistclip3 = new ControladorCrearHistClinicaP3(historiaPa, medicoAt, vistaHistclip3, sistemaAt, pacienteAt);

            }
        });

        vistaAt.btn_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                historiaAt.getMotivoconsul().setSignosprincip(vistaAt.txtf_SignosPrin.getText());
                historiaAt.getMotivoconsul().setSintomasprincip(vistaAt.txtf_SintomPrinc.getText());
                historiaAt.getMotivoconsul().setTiempoenfermedad(vistaAt.txtf_TiempoEnf.getText());
                historiaAt.getMotivoconsul().setFormainicioenf(vistaAt.txtf_FormaInic.getText());
                historiaAt.getMotivoconsul().setRelato(vistaAt.txtf_Relatos.getText());

                JOptionPane.showMessageDialog(vistaAt, "Datos guardados con exito");
            }
        });

    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);

    }

    public void cargardatos() {
        vistaAt.txtf_SignosPrin.setText(historiaAt.getMotivoconsul().getSignosprincip());
        vistaAt.txtf_SintomPrinc.setText(historiaAt.getMotivoconsul().getSintomasprincip());
        vistaAt.txtf_TiempoEnf.setText(historiaAt.getMotivoconsul().getTiempoenfermedad());
        vistaAt.txtf_FormaInic.setText(historiaAt.getMotivoconsul().getFormainicioenf());
        vistaAt.txtf_Relatos.setText(historiaAt.getMotivoconsul().getRelato());
    }
}
