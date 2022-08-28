/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import controlador.ControladorVentanaMedico;
import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Antecedentes;
import modelo.EvolucionesListaDoble;
import modelo.ExamenFisico;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import modelo.MotivoConsulta;
import modelo.Paciente;
import modelo.PersonaResp;
import modelo.Sistema;
import vista.JFrameHistoriaClinicaP1;
import vista.JFrameHistoriaClinicaP2;
import vista.JFrameMenuMedico;

/**
 *
 * @author User
 */
public class ControladorCrearHistClinicaP1 {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP1 vistaAt;
    private Sistema sistemaAt;
    private Paciente pacienteAt;

    private boolean clickguardar = false;

    public ControladorCrearHistClinicaP1(HistoriaClinicaApertura historiaPa, Medico medicoAt, JFrameHistoriaClinicaP1 vitaAt, Sistema sistema, Paciente pacientePa) {
        this.historiaAt = historiaPa;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;
        this.pacienteAt = pacientePa;
        iniciarVista();
        cargardatosobligados();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();

                JFrameMenuMedico vistaMedico = new JFrameMenuMedico();

                ControladorVentanaMedico controMedico = new ControladorVentanaMedico(medicoAt, sistema, vistaMedico);

            }
        });

        vistaAt.btn_Sig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clickguardar == true) {
                    vistaAt.dispose();
                    JFrameHistoriaClinicaP2 vistaHistclip2 = new JFrameHistoriaClinicaP2();

                    ControladorCrearHistClinicaP2 controlHistclip2 = new ControladorCrearHistClinicaP2(historiaAt, medicoAt, vistaHistclip2, sistemaAt, pacienteAt);

                } else {
                    JOptionPane.showMessageDialog(vistaAt, "Click en guardar para poder avanzar");

                }

            }
        });

        vistaAt.btn_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                if(historiaAt.getPaciente()==null){
                     HistoriaClinicaApertura hc = historiaAt;

                Paciente paciente;
                PersonaResp perResponsable;

                String codigoRedactor = vistaAt.txtf_codigomedico.getText(), codigoHisClinica = vistaAt.txtf_CodigoHistClinic.getText(), codigoPaciente = vistaAt.txtf_CodigoPaciente.getText(), fechaApertura = vistaAt.txtf_FechaApertura.getText(), documento = vistaAt.txtf_Documento.getText(), tipoDocumento = vistaAt.txtf_TipoDocumento.getText(), apellPat = vistaAt.txtf_ApellPatern.getText(), apellMat = vistaAt.txtf_ApellMatern.getText(), nombres = vistaAt.txtf_Nombres.getText(), sexo = vistaAt.txtf_Sexo.getText(), fechaNac = vistaAt.txtf_FechaNac.getText(), gradoInst = vistaAt.txtf_GradoInst.getText(), edad = vistaAt.txtf_Edad.getText(), estCivil = vistaAt.txtf_EstadCivil.getText(), lugNacimiento = vistaAt.txtf_LugarNaci.getText(), numCel = vistaAt.txtf_numCel.getText(), domicilio = vistaAt.txtf_Domicilio.getText(), grupoEtnico = vistaAt.txtf_GrupEtn.getText(), religion = vistaAt.txtf_Religion.getText(), ocupacion = vistaAt.txtf_Ocupacion.getText(), lugarProc = vistaAt.txtf_LugarProced.getText();

                String apellPatPr = vistaAt.txtf_PRApellPat.getText(), apellMatPr = vistaAt.txtf_PRApellMat.getText(), nombresPr = vistaAt.txtf_PRNombres.getText(), sexoPr = vistaAt.txtf_PRSexo.getText(), tipDocumentoPr = vistaAt.txtf_PRTipoDoc.getText(), documentoPr = vistaAt.txtf_PRDoc.getText(), numCelPr = vistaAt.txtf_PRNumeroCell.getText(), dirrecionDomPr = vistaAt.txtf_PRDirecc.getText();

                paciente = new Paciente(codigoPaciente, documento, tipoDocumento, apellPat, apellMat, nombres, sexo, edad, nombres, documentoPr);
                paciente.addDatosFaltantes(fechaNac, gradoInst, estCivil, lugNacimiento, numCel, domicilio, grupoEtnico, religion, ocupacion, lugarProc);

                perResponsable = new PersonaResp(apellPatPr, apellMatPr, nombresPr, sexoPr, tipDocumentoPr, documentoPr, numCelPr, dirrecionDomPr);

                hc.setPaciente(paciente);
                hc.setPersonaresp(perResponsable);
                hc.setCodigomedico(codigoRedactor);
                hc.setCodigohistoriaclinica(codigoHisClinica);
                hc.setFechaapertura(fechaApertura);
                
                hc.setMotivoconsul(new MotivoConsulta("", "", "", "", ""));
                hc.setAntecedentes(new Antecedentes("","","",""));
                hc.setExamenfisic(new ExamenFisico("", ""));
                hc.setApreciacion("");
                hc.setImpresiondiagnost("");
                hc.setPlan("");
                hc.setListaevoluciones(new EvolucionesListaDoble());
                
                sistema.getListahistoriassistema().agregarAlFinal(hc);

              
                JOptionPane.showMessageDialog(vistaAt, "Datos guardados con exito");
                clickguardar = true;

                }else{
                    JOptionPane.showMessageDialog(vistaAt, "Ya se creo la apertura, retroceda para crear una nueva");
                }
                
            }
        });

    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);

    }

    public void cargardatosobligados() {
        vistaAt.txtf_codigomedico.setText(medicoAt.getCodigomedico());
        vistaAt.txtf_codigomedico.setEditable(false);

        vistaAt.txtf_CodigoHistClinic.setText(sistemaAt.getListahistoriassistema().getCodigohistorias());
        vistaAt.txtf_CodigoHistClinic.setEditable(false);

        vistaAt.txtf_CodigoPaciente.setText(pacienteAt.getCodigoPaciente());
        vistaAt.txtf_CodigoPaciente.setEditable(false);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        vistaAt.txtf_FechaApertura.setText(dtf.format(LocalDateTime.now()));
        vistaAt.txtf_FechaApertura.setEditable(false);
        
        if(historiaAt.getPaciente()!=null){
              vistaAt.txtf_Documento.setText(historiaAt.getPaciente().getDocumento());
        vistaAt.txtf_TipoDocumento.setText(historiaAt.getPaciente().getTipodocumento());
        vistaAt.txtf_ApellPatern.setText(historiaAt.getPaciente().getApellPat());
        vistaAt.txtf_ApellMatern.setText(historiaAt.getPaciente().getApellMat());
        vistaAt.txtf_Nombres.setText(historiaAt.getPaciente().getNombres());
        vistaAt.txtf_Sexo.setText(historiaAt.getPaciente().getSexo());
        vistaAt.txtf_FechaNac.setText(historiaAt.getPaciente().getFechaNacim());
        vistaAt.txtf_GradoInst.setText(historiaAt.getPaciente().getGradoInst());
        vistaAt.txtf_Edad.setText(historiaAt.getPaciente().getEdad());
        vistaAt.txtf_EstadCivil.setText(historiaAt.getPaciente().getEstadoCivil());
        vistaAt.txtf_LugarNaci.setText(historiaAt.getPaciente().getLugarNacim());
        vistaAt.txtf_numCel.setText(historiaAt.getPaciente().getNumerocell());
        vistaAt.txtf_Domicilio.setText(historiaAt.getPaciente().getDomicilio());
        vistaAt.txtf_GrupEtn.setText(historiaAt.getPaciente().getGrupoEtnico());
        vistaAt.txtf_Religion.setText(historiaAt.getPaciente().getReligion());
        vistaAt.txtf_Ocupacion.setText(historiaAt.getPaciente().getOcupacion());
        vistaAt.txtf_LugarProced.setText(historiaAt.getPaciente().getLugarproced());
        }
        
        
        
        

        

    }
}
