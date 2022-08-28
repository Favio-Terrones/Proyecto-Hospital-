/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class PersonaResp {
    private String apellPat;
    private String apellMat;
    private String nombres;
    private String sexo;
    private String tipodoc;
    private String documento;
    private String numerocell;
    private String direccDomic;

    public PersonaResp(String apellPat, String apellMat, String nombres, String sexo, String tipodoc, String documento, String numerocell, String direccDomic) {
        this.apellPat = apellPat;
        this.apellMat = apellMat;
        this.nombres = nombres;
        this.sexo = sexo;
        this.tipodoc = tipodoc;
        this.documento = documento;
        this.numerocell = numerocell;
        this.direccDomic = direccDomic;
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

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumerocell() {
        return numerocell;
    }

    public void setNumerocell(String numerocell) {
        this.numerocell = numerocell;
    }

    public String getDireccDomic() {
        return direccDomic;
    }

    public void setDireccDomic(String direccDomic) {
        this.direccDomic = direccDomic;
    }
    
    
    
    @Override
    public String toString() {
        return "PersonaResp: " + " " + apellPat + " " + apellMat + " " + nombres + " " + sexo + " " + tipodoc + " " + documento + " " + numerocell + " " + direccDomic;
    }
    
    
    
}
