/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class HistoriaClinicaApertura {
    
    
    private String codigohistoriaclinica;
    private String codigomedico;
    private String fechaapertura;
    private Paciente paciente;
    private PersonaResp personaresp;
    
    private MotivoConsulta motivoconsul;
    private Antecedentes antecedentes;
    private ExamenFisico examenfisic;
    private String apreciacion;
    private String impresiondiagnost;
    private String plan;
    private EvolucionesListaDoble listaevoluciones;
    

    public HistoriaClinicaApertura( String codigohistoriaclinica,String codigomedico,String fechaapertura,Paciente paciente, PersonaResp personaresp, MotivoConsulta motivoconsul, Antecedentes antecedentes, ExamenFisico examenfisic, 
            String apreciacion, String impresiondiagnost, String plan, EvolucionesListaDoble listaevoluciones) {
        this.codigohistoriaclinica=codigohistoriaclinica;
        this.codigomedico=codigomedico;
        this.fechaapertura=fechaapertura;
        this.paciente = paciente;
        this.personaresp = personaresp;
        this.motivoconsul = motivoconsul;
        this.antecedentes = antecedentes;
        this.examenfisic = examenfisic;
        this.apreciacion = apreciacion;
        this.impresiondiagnost = impresiondiagnost;
        this.plan = plan;
        
        this.listaevoluciones = listaevoluciones;
    }

    public HistoriaClinicaApertura() {
    }
  

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public PersonaResp getPersonaresp() {
        return personaresp;
    }

    public void setPersonaresp(PersonaResp personaresp) {
        this.personaresp = personaresp;
    }

    public MotivoConsulta getMotivoconsul() {
        return motivoconsul;
    }

    public void setMotivoconsul(MotivoConsulta motivoconsul) {
        this.motivoconsul = motivoconsul;
    }

    public Antecedentes getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(Antecedentes antecedentes) {
        this.antecedentes = antecedentes;
    }

    public ExamenFisico getExamenfisic() {
        return examenfisic;
    }

    public void setExamenfisic(ExamenFisico examenfisic) {
        this.examenfisic = examenfisic;
    }

    public String getApreciacion() {
        return apreciacion;
    }

    public void setApreciacion(String apreciacion) {
        this.apreciacion = apreciacion;
    }

    public String getImpresiondiagnost() {
        return impresiondiagnost;
    }

    public void setImpresiondiagnost(String impresiondiagnost) {
        this.impresiondiagnost = impresiondiagnost;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCodigohistoriaclinica() {
        return codigohistoriaclinica;
    }

    public void setCodigohistoriaclinica(String codigohistoriaclinica) {
        this.codigohistoriaclinica = codigohistoriaclinica;
    }

    public EvolucionesListaDoble getListaevoluciones() {
        return listaevoluciones;
    }

    public void setListaevoluciones(EvolucionesListaDoble listaevoluciones) {
        this.listaevoluciones = listaevoluciones;
    }

    public String getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(String codigomedico) {
        this.codigomedico = codigomedico;
    }

    public String getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(String fechaapertura) {
        this.fechaapertura = fechaapertura;
    }
    
    
    
}
