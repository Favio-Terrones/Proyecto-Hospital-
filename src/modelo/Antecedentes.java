/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Antecedentes {
    
    private String patologicos;
    private String farmacosfrec;
    private String habitnocivo;
    private String hereditarios;

    public Antecedentes(String patologicos, String farmacosfrec, String habitnocivo, String hereditarios) {
        this.patologicos = patologicos;
        this.farmacosfrec = farmacosfrec;
        this.habitnocivo = habitnocivo;
        this.hereditarios = hereditarios;
    }

    public String getPatologicos() {
        return patologicos;
    }

    public void setPatologicos(String patologicos) {
        this.patologicos = patologicos;
    }

    public String getFarmacosfrec() {
        return farmacosfrec;
    }

    public void setFarmacosfrec(String farmacosfrec) {
        this.farmacosfrec = farmacosfrec;
    }

    public String getHabitnocivo() {
        return habitnocivo;
    }

    public void setHabitnocivo(String habitnocivo) {
        this.habitnocivo = habitnocivo;
    }

    public String getHereditarios() {
        return hereditarios;
    }

    public void setHereditarios(String hereditarios) {
        this.hereditarios = hereditarios;
    }
    
}
