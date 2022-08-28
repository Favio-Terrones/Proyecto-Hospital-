/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Favio
 */
public class Paciente {
    
    private String codigoPaciente;
    private String documento;
    private String tipodocumento;
    private String apellPat;
    private String apellMat;
    private String nombres;
    private String sexo;
    private String edad;
    private String FechaNacim;
    private String GradoInst;
    private String EstadoCivil;
    private String LugarNacim;
    private String numerocell;
    private String Domicilio;
    private String GrupoEtnico;
    private String religion;
    private String ocupacion;
    private String lugarproced;
    private String cuentanombre;
    private String cuentacontra;
    
    
    private boolean tienecita=false;
    private String horacita;
    private String diacita;
    private String especialidadcita;
    
    public Paciente(String codigoPaciente, String documento, String tipodocumento, String apellPat, String apellMat, String nombres, String sexo,String edad,String cuentanombre,String cuentacontra) {
        this.codigoPaciente = codigoPaciente;
        this.documento = documento;
        this.tipodocumento = tipodocumento;
        this.apellPat = apellPat;
        this.apellMat = apellMat;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.cuentanombre=cuentanombre;
        this.cuentacontra=cuentacontra;
    }

    public void addDatosFaltantes(String FechaNacim, String GradoInst, String EstadoCivil, String LugarNacim, String numerocell, String Domicilio, String GrupoEtnico, String religion, String ocupacion, String lugarproced) {
        this.FechaNacim = FechaNacim;
        this.GradoInst = GradoInst;
        this.EstadoCivil = EstadoCivil;
        this.LugarNacim = LugarNacim;
        this.numerocell = numerocell;
        this.Domicilio = Domicilio;
        this.GrupoEtnico = GrupoEtnico;
        this.religion = religion;
        this.ocupacion = ocupacion;
        this.lugarproced = lugarproced;
    }
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getApellPat() {
        return apellPat;
    }

    public void setApellPat(String apellPat) {
        this.apellPat = apellPat;
    }

    public String getApellMat() {
        return apellMat;
    }

    public void setApellMat(String apellMat) {
        this.apellMat = apellMat;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacim() {
        return FechaNacim;
    }

    public void setFechaNacim(String FechaNacim) {
        this.FechaNacim = FechaNacim;
    }

    public String getGradoInst() {
        return GradoInst;
    }

    public void setGradoInst(String GradoInst) {
        this.GradoInst = GradoInst;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getLugarNacim() {
        return LugarNacim;
    }

    public void setLugarNacim(String LugarNacim) {
        this.LugarNacim = LugarNacim;
    }

    public String getNumerocell() {
        return numerocell;
    }

    public void setNumerocell(String numerocell) {
        this.numerocell = numerocell;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getGrupoEtnico() {
        return GrupoEtnico;
    }

    public void setGrupoEtnico(String GrupoEtnico) {
        this.GrupoEtnico = GrupoEtnico;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getLugarproced() {
        return lugarproced;
    }

    public void setLugarproced(String lugarproced) {
        this.lugarproced = lugarproced;
    }

    public String getCuentanombre() {
        return cuentanombre;
    }

    public void setCuentanombre(String cuentanombre) {
        this.cuentanombre = cuentanombre;
    }

    public String getCuentacontra() {
        return cuentacontra;
    }

    public void setCuentacontra(String cuentacontra) {
        this.cuentacontra = cuentacontra;
    }

    public boolean isTienecita() {
        return tienecita;
    }

    public void setTienecita(boolean tienecita) {
        this.tienecita = tienecita;
    }
    
    public void setDiayHoraCita(String dia,String hora){
        this.diacita=dia;
        this.horacita=hora;
    }

    public String getEspecialidadcita() {
        return especialidadcita;
    }

    public void setEspecialidadcita(String especialidadcita,String numero) {
        this.especialidadcita = especialidadcita + " "+numero;
    }
    
    
    public String mostrardatosbasicos(){
        return "" +this.codigoPaciente+"  "+
        this.documento+"  "+
        this.tipodocumento+"  "+
        this.apellPat+"  "+
        this.apellMat+"  "+
        this.nombres+"  "+
        this.sexo;
        
    }
    
    @Override
    public String toString() {
        return  "" + codigoPaciente +"  "+  documento +"  "+  tipodocumento +"  "+  
                apellPat  +"  "+ apellMat  +"  "+ nombres  +"  "+ sexo  +"  "+ 
                edad + "  "+ cuentanombre + "  "+ cuentacontra+ "  tienecita: "+ tienecita;
                }
    
    
}
