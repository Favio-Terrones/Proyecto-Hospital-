/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class SistemaBiologico {
    private String nombresistema;
    private String evaluacionsistem;

    public SistemaBiologico(String nombresistema, String evaluacionsistem) {
        this.nombresistema = nombresistema;
        this.evaluacionsistem = evaluacionsistem;
    }

    public String getNombresistema() {
        return nombresistema;
    }

    public void setNombresistema(String nombresistema) {
        this.nombresistema = nombresistema;
    }

    public String getEvaluacionsistem() {
        return evaluacionsistem;
    }

    public void setEvaluacionsistem(String evaluacionsistem) {
        this.evaluacionsistem = evaluacionsistem;
    }
    
    
    
}
