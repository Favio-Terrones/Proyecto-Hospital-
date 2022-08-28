/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class EvolucionesNodoDoble {
    public Evolucion elemento;
    public EvolucionesNodoDoble siguiente;
    public EvolucionesNodoDoble anterior;

    public EvolucionesNodoDoble(Evolucion elemento, EvolucionesNodoDoble siguiente, EvolucionesNodoDoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public EvolucionesNodoDoble(Evolucion elemento) {
        this.elemento = elemento;
        this.siguiente =null;
        this.anterior = null;
    }
    
    
    
    
}
