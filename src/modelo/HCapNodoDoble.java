/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class HCapNodoDoble {
    public HistoriaClinicaApertura elemento;
    public HCapNodoDoble siguiente;
    public HCapNodoDoble anterior;

    public HCapNodoDoble(HistoriaClinicaApertura elemento, HCapNodoDoble siguiente, HCapNodoDoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    public HCapNodoDoble(HistoriaClinicaApertura elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior = null;
    }
}
