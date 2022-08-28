/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class PacientesNodoDoble {
    public Paciente elemento;
    public PacientesNodoDoble siguiente;
    public PacientesNodoDoble anterior;

    public PacientesNodoDoble(Paciente elemento, PacientesNodoDoble siguiente, PacientesNodoDoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    public PacientesNodoDoble(Paciente  elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior = null;
    }
    
    
    
}
