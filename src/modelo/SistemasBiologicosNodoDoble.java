/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class SistemasBiologicosNodoDoble {
    public SistemaBiologico elemento;
    public SistemasBiologicosNodoDoble siguiente;
    public SistemasBiologicosNodoDoble anterior;

    public SistemasBiologicosNodoDoble(SistemaBiologico elemento, SistemasBiologicosNodoDoble siguiente, SistemasBiologicosNodoDoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public SistemasBiologicosNodoDoble(SistemaBiologico elemento) {
        this.elemento = elemento;
    }
    
    
    
}
