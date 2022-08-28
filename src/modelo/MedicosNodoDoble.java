/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class MedicosNodoDoble {
    public Medico elemento;
    public MedicosNodoDoble siguiente;
    public MedicosNodoDoble anterior;

    public MedicosNodoDoble(Medico medico, MedicosNodoDoble siguiente, MedicosNodoDoble anterior) {
        this.elemento = medico;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public MedicosNodoDoble(Medico medico) {
        this.elemento = medico;
        this.siguiente = null;
        this.anterior = null;
    }

    
}
