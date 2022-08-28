/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class AdminsNodoDoble {
    public Administrador elemento;
    public AdminsNodoDoble siguiente;
    public AdminsNodoDoble anterior;

    public AdminsNodoDoble(Administrador elemento, AdminsNodoDoble siguiente, AdminsNodoDoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public AdminsNodoDoble(Administrador elemento) {
        this.elemento = elemento;
    }
    
    
}
