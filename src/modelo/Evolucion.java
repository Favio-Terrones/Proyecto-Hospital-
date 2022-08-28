/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Evolucion {
    
    private String fechaevo;
    private String horaevo;
    private String subjetivo;
    private String objetivo;
    private String apreciacion;
    private String plan;

    public Evolucion(String fechaevo, String horaevo, String subjetivo, String objetivo, String apreciacion, String plan) {
        this.fechaevo = fechaevo;
        this.horaevo = horaevo;
        this.subjetivo = subjetivo;
        this.objetivo = objetivo;
        this.apreciacion = apreciacion;
        this.plan = plan;
    }

    public String getFechaevo() {
        return fechaevo;
    }

    public void setFechaevo(String fechaevo) {
        this.fechaevo = fechaevo;
    }

    public String getHoraevo() {
        return horaevo;
    }

    public void setHoraevo(String horaevo) {
        this.horaevo = horaevo;
    }

    public String getSubjetivo() {
        return subjetivo;
    }

    public void setSubjetivo(String subjetivo) {
        this.subjetivo = subjetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getApreciacion() {
        return apreciacion;
    }

    public void setApreciacion(String apreciacion) {
        this.apreciacion = apreciacion;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
    
}
