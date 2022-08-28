/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import modelo.Sistema;
import vista.*;
import controlador.*;
import datos.*;
import java.util.Date;

/**
 *
 * @author Favio
 */
public class App {

    public static void main(String[] args) {
        
        /*
        Date fechadate=new Date();
        System.out.println("Hora test:");
        String horatest="08:30";
        System.out.println(horatest);
        
        System.out.println("La horas del date son: " + fechadate.getHours());
        System.out.println("Los minutos del date son: " + fechadate.getMinutes());
        
        System.out.println("La horastest  son: " + horatest.substring(0, 2));
        System.out.println("Los minutostest son: " + horatest.substring(3, 5));
        
        */
                 

         
        
        JFrameLogin jFrameLogin = new JFrameLogin();
        Sistema sistemapordefecto = Datos.crearSistemaDefecto();
        ControladorLogueo controladorLog = new ControladorLogueo(jFrameLogin, sistemapordefecto);
        controladorLog.iniciar();
  

    }
}
