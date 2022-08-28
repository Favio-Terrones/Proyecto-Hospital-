/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Favio
 */
public class Administrador {
      private String codigo;
      private String  contra;
      
    public Administrador(String codigo,String contra) {
        this.codigo = codigo;
        this.contra=contra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "" + "codigo: " + codigo+ "  contra: " + contra;
    }
    
    
}
