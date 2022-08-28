/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import controlador.ControladorTablaApsHCsSistema;
import controlador.ControladorVentanaMedico;
import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorVerHistClinicaP1 {

    private HistoriaClinicaApertura historiaAT;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP1 vistaAt;
    private Sistema sistemaAt;

    public ControladorVerHistClinicaP1(HistoriaClinicaApertura historiaAt, Medico medicoPa, JFrameHistoriaClinicaP1 vitaAt, Sistema sistema) {
        this.historiaAT = historiaAt;
        this.medicoAt = medicoPa;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;

        iniciarVista();
        txtblock();
        cargardatos();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                if (medicoAt != null) {
                    JFrameMenuMedico vistaMedico = new JFrameMenuMedico();
                    ControladorVentanaMedico controMedico = new ControladorVentanaMedico(medicoPa, sistema, vistaMedico);

                } else {
                    JFrameAperturasHistoriasSistema vistaApeSis = new JFrameAperturasHistoriasSistema();
                    ControladorTablaApsHCsSistema controladoraperturas = new ControladorTablaApsHCsSistema(vistaApeSis, sistemaAt, null);

                }

            }
        });
        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP2 vistaHistclip2 = new JFrameHistoriaClinicaP2();

                ControladorVerHistClinicaP2 controlHistclip2 = new ControladorVerHistClinicaP2(historiaAt, medicoPa, vistaHistclip2, sistemaAt);

            }
        });

    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        vistaAt.jPanel1.remove(vistaAt.btn_guardar);
        //     vistaAt.jPanel1.remove(vistaAt.btn_CargarDatosPac);
    }

    public void txtblock() {

        //Paciente
        vistaAt.txtf_codigomedico.setEditable(false);
        vistaAt.txtf_CodigoHistClinic.setEditable(false);
        vistaAt.txtf_CodigoPaciente.setEditable(false);
        vistaAt.txtf_FechaApertura.setEditable(false);
        vistaAt.txtf_Documento.setEditable(false);
        vistaAt.txtf_TipoDocumento.setEditable(false);
        vistaAt.txtf_ApellPatern.setEditable(false);
        vistaAt.txtf_ApellMatern.setEditable(false);
        vistaAt.txtf_Nombres.setEditable(false);
        vistaAt.txtf_Sexo.setEditable(false);
        vistaAt.txtf_FechaNac.setEditable(false);
        vistaAt.txtf_GradoInst.setEditable(false);
        vistaAt.txtf_Edad.setEditable(false);
        vistaAt.txtf_EstadCivil.setEditable(false);
        vistaAt.txtf_LugarNaci.setEditable(false);
        vistaAt.txtf_numCel.setEditable(false);
        vistaAt.txtf_Domicilio.setEditable(false);
        vistaAt.txtf_GrupEtn.setEditable(false);
        vistaAt.txtf_Religion.setEditable(false);
        vistaAt.txtf_Ocupacion.setEditable(false);
        vistaAt.txtf_LugarProced.setEditable(false);

        //PERSONA RESPONSABLE 
        vistaAt.txtf_PRApellPat.setEditable(false);
        vistaAt.txtf_PRApellMat.setEditable(false);
        vistaAt.txtf_PRNombres.setEditable(false);
        vistaAt.txtf_PRSexo.setEditable(false);
        vistaAt.txtf_PRTipoDoc.setEditable(false);
        vistaAt.txtf_PRDoc.setEditable(false);
        vistaAt.txtf_PRNumeroCell.setEditable(false);
        vistaAt.txtf_PRDirecc.setEditable(false);

    }

    public void cargardatos() {
        vistaAt.txtf_codigomedico.setText(historiaAT.getCodigomedico());
        vistaAt.txtf_CodigoHistClinic.setText(historiaAT.getCodigohistoriaclinica());
        vistaAt.txtf_CodigoPaciente.setText(historiaAT.getPaciente().getCodigoPaciente());
        vistaAt.txtf_FechaApertura.setText(historiaAT.getFechaapertura());

        vistaAt.txtf_Documento.setText(historiaAT.getPaciente().getDocumento());
        vistaAt.txtf_TipoDocumento.setText(historiaAT.getPaciente().getTipodocumento());
        vistaAt.txtf_ApellPatern.setText(historiaAT.getPaciente().getApellPat());
        vistaAt.txtf_ApellMatern.setText(historiaAT.getPaciente().getApellMat());
        vistaAt.txtf_Nombres.setText(historiaAT.getPaciente().getNombres());
        vistaAt.txtf_Sexo.setText(historiaAT.getPaciente().getSexo());
        vistaAt.txtf_FechaNac.setText(historiaAT.getPaciente().getFechaNacim());
        vistaAt.txtf_GradoInst.setText(historiaAT.getPaciente().getGradoInst());
        vistaAt.txtf_Edad.setText(historiaAT.getPaciente().getEdad());
        vistaAt.txtf_EstadCivil.setText(historiaAT.getPaciente().getEstadoCivil());
        vistaAt.txtf_LugarNaci.setText(historiaAT.getPaciente().getLugarNacim());
        vistaAt.txtf_numCel.setText(historiaAT.getPaciente().getNumerocell());
        vistaAt.txtf_Domicilio.setText(historiaAT.getPaciente().getDomicilio());
        vistaAt.txtf_GrupEtn.setText(historiaAT.getPaciente().getGrupoEtnico());
        vistaAt.txtf_Religion.setText(historiaAT.getPaciente().getReligion());
        vistaAt.txtf_Ocupacion.setText(historiaAT.getPaciente().getOcupacion());
        vistaAt.txtf_LugarProced.setText(historiaAT.getPaciente().getLugarproced());

        //PERSONA RESPONSABLE
        vistaAt.txtf_PRApellPat.setText(historiaAT.getPersonaresp().getApellPat());
        vistaAt.txtf_PRApellMat.setText(historiaAT.getPersonaresp().getApellMat());
        vistaAt.txtf_PRNombres.setText(historiaAT.getPersonaresp().getNombres());
        vistaAt.txtf_PRSexo.setText(historiaAT.getPersonaresp().getSexo());
        vistaAt.txtf_PRTipoDoc.setText(historiaAT.getPersonaresp().getTipodoc());
        vistaAt.txtf_PRDoc.setText(historiaAT.getPersonaresp().getDocumento());
        vistaAt.txtf_PRNumeroCell.setText(historiaAT.getPersonaresp().getNumerocell());
        vistaAt.txtf_PRDirecc.setText(historiaAT.getPersonaresp().getDireccDomic());

    }
}
