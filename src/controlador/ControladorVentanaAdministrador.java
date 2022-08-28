/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Sistema;
import modelo.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.JFrameAperturasHistoriasSistema;
import vista.JFrameLogin;
import vista.JFrameMenuAdministrador;
import vista.JFrameUsuariosSistema;

/**
 *
 * @author Favio
 */
public class ControladorVentanaAdministrador {
        JFrameMenuAdministrador vistaAt;
        Administrador administradorAt;
        Sistema sistemaAt;
        
    
    public ControladorVentanaAdministrador(JFrameMenuAdministrador vistaPa, Administrador administradorPa, Sistema sistemaPa) {
        this.vistaAt = vistaPa;
        this.administradorAt = administradorPa;
        this.sistemaAt = sistemaPa;
        
        iniciar();
        this.vistaAt.usuSistema_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  vistaAt.dispose();
                  JFrameUsuariosSistema vistaUsuariosSistema = new JFrameUsuariosSistema();
                  ControladorUsuariosSistema contrUsuariosSistema = new ControladorUsuariosSistema(vistaUsuariosSistema, administradorPa, sistemaPa);
                  vistaUsuariosSistema.setTitle("Usuarios del Sistema");
                  
            }
        });
        
        this.vistaAt.mosHisClinicas_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  vistaAt.dispose();
                  JFrameAperturasHistoriasSistema vistaApeSis = new JFrameAperturasHistoriasSistema();
                  ControladorTablaApsHCsSistema controladoraperturas = new ControladorTablaApsHCsSistema(vistaApeSis, sistemaAt, administradorAt);
                  
            }
        });
        this.vistaAt.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JFrameLogin jfl = new JFrameLogin();
                 ControladorLogueo ctl = new ControladorLogueo(jfl, sistemaPa);
                 vistaPa.dispose();
                 jfl.setLocationRelativeTo(null);
                 jfl.setVisible(true);
                 jfl.setTitle("Ingreso Usuarios");
                 jfl.setResizable(false);
            }
        });
    }
        public void iniciar(){
        this.vistaAt.setLocationRelativeTo(null);
        this.vistaAt.setVisible(true);
        this.vistaAt.setResizable(false);
    }
       
        
}
