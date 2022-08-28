/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class ExamenFisico {

    private String impgeneral;
    private SistemasBiologicosListaDoble listasistemas;
    private String evaluacionsitsemas;

    public ExamenFisico(String impgeneral, String evaluacionsitsemas) {
        this.impgeneral = impgeneral;

        this.evaluacionsitsemas = evaluacionsitsemas;
    }

    public String getImpgeneral() {
        return impgeneral;
    }

    public void setImpgeneral(String impgeneral) {
        this.impgeneral = impgeneral;
    }

    public SistemasBiologicosListaDoble getListasistemas() {
        return listasistemas;
    }

    public void setListasistemas(SistemasBiologicosListaDoble listasistemas) {
        this.listasistemas = listasistemas;
    }

    public String getEvaluacionsitsemas() {
        return evaluacionsitsemas;
    }

    public void setEvaluacionsitsemas(String evaluacionsitsemas) {
        this.evaluacionsitsemas = evaluacionsitsemas;
    }

}
