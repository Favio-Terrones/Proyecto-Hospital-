/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Favio
 */
public class Medico {

    private String codigomedico;
    private String nombres;
    private String apellidos;
    private int aniosservicio;
    private String numdocument;
    private String cuentanombre;
    private String cuentacontra;
    private String especialidad;

    private String horario[][] = new String[31][12];
    private String codigospacientes[][] = new String[31][12];
    private int trabajohorainicio = 8;
    private int trabajointervaloturnos = 30;
    private String numeroesp;
    private String codigospacientecita[] = new String[360];

    public Medico(String codigomedico, String nombres, String apellidos,
            int aniosservicio, String numdocument,
            String cuentanombre, String cuentacontra, String especialidad, String numeroesp) {
        this.codigomedico = codigomedico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.aniosservicio = aniosservicio;
        this.numdocument = numdocument;
        this.cuentanombre = cuentanombre;
        this.cuentacontra = cuentacontra;
        this.especialidad = especialidad;
        this.numeroesp = numeroesp;

        for (int i = 0; i < codigospacientecita.length; i++) {
            codigospacientecita[i] = "";
        }
        //
        for (int i = 1; i < codigospacientes.length; i++) {
            for (int j = 0; j < codigospacientes[i].length; j++) {

                codigospacientes[i][j] = "";

            }
        }

        //
        for (int i = 1; i < horario.length; i++) {
            int horas = trabajohorainicio;
            int minutos = 0;
            for (int j = 0; j < horario[i].length; j++) {

                if (horas > 9) {
                    switch (minutos) {
                        case 0:
                            horario[i][j] = String.valueOf(horas) + ":" + "00";
                            break;
                        case 30:
                            horario[i][j] = String.valueOf(horas) + ":" + "30";
                            break;
                    }
                } else {
                    switch (minutos) {
                        case 0:
                            horario[i][j] = "0" + String.valueOf(horas) + ":" + "00";
                            break;
                        case 30:
                            horario[i][j] = "0" + String.valueOf(horas) + ":" + "30";
                            break;
                    }
                }

                minutos = minutos + trabajointervaloturnos;
                if (minutos == 60) {
                    horas++;
                    minutos = 0;
                }

            }
        }
    }

    public String getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(String codigomedico) {
        this.codigomedico = codigomedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAniosservicio() {
        return aniosservicio;
    }

    public void setAniosservicio(int aniosservicio) {
        this.aniosservicio = aniosservicio;
    }

    public String getNumdocument() {
        return numdocument;
    }

    public void setNumdocument(String numdocument) {
        this.numdocument = numdocument;
    }

    public String getCuentanombre() {
        return cuentanombre;
    }

    public void setCuentanombre(String cuentanombre) {
        this.cuentanombre = cuentanombre;
    }

    public String getCuentacontra() {
        return cuentacontra;
    }

    public void setCuentacontra(String cuentacontra) {
        this.cuentacontra = cuentacontra;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroesp() {
        return numeroesp;
    }

    public void setNumeroesp(String numeroesp) {
        this.numeroesp = numeroesp;
    }

    public String getCodigopacientecita(int posicion) {
        return codigospacientecita[posicion];
    }

    public void setCodigopacientecita(String codigopaciente) {
        for (int i = 0; i < codigospacientecita.length; i++) {
            if (this.codigospacientecita[i].equals("")) {

                this.codigospacientecita[i] = codigopaciente;
                break;
            }

        }

    }

    public void setCodigopacientecitaTerminada(String codigopaciente) {
        
        /*
        for (int i = 0; i < codigospacientecita.length; i++) {
            if (this.codigospacientecita[i].equals(codigopaciente)) {

                this.codigospacientecita[i] = "";
                break;
            }

        }
        */

        for (int i = 1; i < horario.length; i++) {

            for (int j = 0; j < horario[i].length; j++) {

                if (codigospacientes[i][j] == codigopaciente) {
                    codigospacientes[i][j] = "";
                    System.out.println("Anulada la cita del: "+ i+ "  "+ horario[i][j]);
                }

            }
        }
        


/*
        Date fechadate=new Date();
        
        for (int i = 1; i < codigospacientes.length; i++) {
            for (int j = 0; j < codigospacientes[i].length; j++) {
                if (codigospacientes[i][j].equals(codigopaciente)&&
                        fechadate.getDate()== Integer.valueOf(i)
                        &&
                        fechadate.getHours() == Integer.valueOf(horario[i][j].substring(0, 2)) 
                        && 
                        fechadate.getMinutes()>= Integer.valueOf(horario[i][j].substring(3, 5)) 
                        && 
                        fechadate.getMinutes()<= (Integer.valueOf(horario[i][j].substring(3, 5)) + 30 )) {
                    
                    
                    codigospacientes[i][j] = "";
                    System.out.println("Anulada la cita del: "+ i+ "  "+ horario[i][j]);
                }

            }
        }
        */

    }
    
    
   
    
    public boolean asignarMedicoCita(String dia, Paciente paciente) {

        boolean result = false;
        for (int i = 1; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (i == Integer.valueOf(dia)) {
                    if (codigospacientes[i][j] == "") {
                        //Des comenten parte inferior con la hora que quieren probar el programa
                        
                        horario[i][j]="18:00";
                        
                        //
                        codigospacientes[i][j] = paciente.getCodigoPaciente();
                        setCodigopacientecita(paciente.getCodigoPaciente());
                        paciente.setTienecita(true);

                        return true;
                    }
                }

            }
        }
        return result;
    }

    public String mostrardiasocupados() {
        String acum = "";
        for (int i = 1; i < horario.length; i++) {

            for (int j = 0; j < horario[i].length; j++) {

                if (codigospacientes[i][j] != "") {
                    acum = acum + "\nOcupado el día: " + i + " a las  " + horario[i][j] + "  con el paciente  " + codigospacientes[i][j];
                }

            }
        }

        System.out.println(acum);
        return acum;
    }

    public void mostrarhorario() {
        for (int i = 1; i < horario.length; i++) {
            System.out.println("\nDia del mes: " + i + "\n");
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(" Hora: " + horario[i][j] + codigospacientes[i][j]);

            }
        }
        System.out.println("");
    }

    public boolean checkpacientecita(String codigopac) {
        /*
        for (int i = 0; i < codigospacientecita.length; i++) {
            if (this.codigospacientecita[i].equals(codigopac)) {

                return true;

            }

        }
         */
        for (int i = 1; i < codigospacientes.length; i++) {
            for (int j = 0; j < codigospacientes[i].length; j++) {

                if (codigospacientes[i][j].equals(codigopac)) {
                    
                    return true;
                }

            }
        }

        return false;

    }
    
    public boolean checkpacientecitaDiahora(String codigopac) {
        Date fechadate=new Date();
        
        for (int i = 1; i < codigospacientes.length; i++) {
            for (int j = 0; j < codigospacientes[i].length; j++) {
                System.out.println("horas:" + horario[i][j]);
                if (codigospacientes[i][j].equals(codigopac)&&
                        fechadate.getDate()== Integer.valueOf(i)
                        &&
                        fechadate.getHours() == Integer.valueOf(horario[i][j].substring(0, 2)) 
                        && 
                        fechadate.getMinutes()>= Integer.valueOf(horario[i][j].substring(3, 5)) 
                        && 
                        fechadate.getMinutes()<= (Integer.valueOf(horario[i][j].substring(3, 5)) + 30 )) {
                    
                    
                    return true;
                }

            }
        }

        return false;

    }
    
    @Override
    public String toString() {
        return "" + codigomedico + "  " + nombres + "  " + apellidos + "  " + aniosservicio + "  " + numdocument + "  Nick:  " + cuentanombre + "  Contra:  " + cuentacontra + "  " + especialidad;
    }

}
