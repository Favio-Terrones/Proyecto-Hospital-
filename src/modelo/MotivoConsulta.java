/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class MotivoConsulta {
    private String signosprincip;
    private String sintomasprincip;
    private String tiempoenfermedad;
    private String formainicioenf;
    private String relato;

    public MotivoConsulta(String signosprincip, String sintomasprincip, String tiempoenfermedad, String formainicioenf, String relato) {
        this.signosprincip = signosprincip;
        this.sintomasprincip = sintomasprincip;
        this.tiempoenfermedad = tiempoenfermedad;
        this.formainicioenf = formainicioenf;
        this.relato = relato;
    }

    public String getSignosprincip() {
        return signosprincip;
    }

    public void setSignosprincip(String signosprincip) {
        this.signosprincip = signosprincip;
    }

    public String getSintomasprincip() {
        return sintomasprincip;
    }

    public void setSintomasprincip(String sintomasprincip) {
        this.sintomasprincip = sintomasprincip;
    }

    public String getTiempoenfermedad() {
        return tiempoenfermedad;
    }

    public void setTiempoenfermedad(String tiempoenfermedad) {
        this.tiempoenfermedad = tiempoenfermedad;
    }

    public String getFormainicioenf() {
        return formainicioenf;
    }

    public void setFormainicioenf(String formainicioenf) {
        this.formainicioenf = formainicioenf;
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }
    
}
