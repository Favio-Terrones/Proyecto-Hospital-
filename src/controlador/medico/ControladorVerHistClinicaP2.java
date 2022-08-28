/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;


import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import controlador.medico.ControladorVerHistClinicaP1;
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
import vista.*;

/**
 *
 * @author User
 */
public class ControladorVerHistClinicaP2 {

    private HistoriaClinicaApertura historiaAT;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP2 vistaAt;
    private Sistema sistemaAt;

    public ControladorVerHistClinicaP2(HistoriaClinicaApertura historiaAt, Medico medicoAt, JFrameHistoriaClinicaP2 vitaAt, Sistema sistema) {
        this.historiaAT = historiaAt;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;

        iniciarVista();
        txtblock();
        cargardatos();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP1 vistahistp1 = new JFrameHistoriaClinicaP1();
                ControladorVerHistClinicaP1 controladorhistp1 = new ControladorVerHistClinicaP1(historiaAt, medicoAt, vistahistp1, sistemaAt);

            }
        });
        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP3 vistaHistclip3= new JFrameHistoriaClinicaP3();
                ControladorVerHistClinicaP3 controlHistclip3 = new ControladorVerHistClinicaP3(historiaAt, medicoAt, vistaHistclip3, sistemaAt);
                
            }
        });
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.jPanel1.remove(vistaAt.btn_guardar);
     
       

    }
    public void txtblock(){
        vistaAt.txtf_SignosPrin.setEditable(false);
        vistaAt.txtf_SintomPrinc.setEditable(false);
        vistaAt.txtf_TiempoEnf.setEditable(false);
        vistaAt.txtf_FormaInic.setEditable(false);
        vistaAt.txtf_Relatos.setEditable(false);
        

    }
    public void cargardatos(){
        
        vistaAt.txtf_SignosPrin.setText(historiaAT.getMotivoconsul().getSignosprincip());
        vistaAt.txtf_SintomPrinc.setText(historiaAT.getMotivoconsul().getSintomasprincip());
        vistaAt.txtf_TiempoEnf.setText(historiaAT.getMotivoconsul().getTiempoenfermedad());
        vistaAt.txtf_FormaInic.setText(historiaAT.getMotivoconsul().getFormainicioenf());
        vistaAt.txtf_Relatos.setText(historiaAT.getMotivoconsul().getRelato());
        
    }
}
