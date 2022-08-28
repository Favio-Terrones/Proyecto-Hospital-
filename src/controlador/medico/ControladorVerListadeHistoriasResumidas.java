/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template



 */
package controlador.medico;

import controlador.ControladorVentanaMedico;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.HCapListaDoble;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import modelo.Sistema;
import vista.JFrameHistoriaClinicaP1;
import vista.JFrameListaHistoriasPaciente;
import vista.JFrameMenuMedico;

/**
 *
 * @author User
 */
public class ControladorVerListadeHistoriasResumidas {

    private HCapListaDoble listahistoriasAt;
    private JFrameListaHistoriasPaciente vistaAt;
    private Medico medicoAt;
    private Sistema sistemaAt;
    private JFrameMenuMedico vistaMenuMedic;
    
    
    public ControladorVerListadeHistoriasResumidas(HCapListaDoble listahistoriasPa, JFrameListaHistoriasPaciente vistaPa, Medico medicoPa, Sistema sistemaPa,JFrameMenuMedico vistaMedicPa) {

        this.listahistoriasAt = listahistoriasPa;
        this.vistaAt = vistaPa;
        this.medicoAt = medicoPa;
        this.sistemaAt = sistemaPa;
        this.vistaMenuMedic = vistaMedicPa;
        iniciarVista();
        ActualizarTablaHistorias();
        
        this.vistaAt.jtable_tablaHCpacientes.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    
                    
                    String codigohistoria =(String) vistaAt.jtable_tablaHCpacientes.getValueAt(row, 0);
                    JOptionPane.showMessageDialog(null, "Se selecciono :   " + codigohistoria); 
             
                    
                    vistaMedicPa.dispose();
                    vistaAt.dispose();
                    
                    
                    HistoriaClinicaApertura historiaTest = listahistoriasAt.ObtenerNodoConCodigoHistoria(codigohistoria).elemento;
                    JFrameHistoriaClinicaP1 vistahistp1 = new JFrameHistoriaClinicaP1();
                    ControladorVerHistClinicaP1 controladorhistp1 = new ControladorVerHistClinicaP1(historiaTest, medicoAt, vistahistp1, sistemaAt);
                    
                    
                }
            }
        });
         this.vistaAt.btn_Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  vistaAt.dispose();
                  JFrameMenuMedico vistamenumedi=new JFrameMenuMedico();
                  ControladorVentanaMedico controladormenumed=new ControladorVentanaMedico(medicoAt, sistemaAt, vistamenumedi);
                  
            }
         });
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
        
    }
    private void ActualizarTablaHistorias() {

        DefaultTableModel modelotabla = new DefaultTableModel(listahistoriasAt.getDatosResumidoInicioFinal(), listahistoriasAt.getCabeceraResumida());
        this.vistaAt.jtable_tablaHCpacientes.setModel(modelotabla);
        
        
    }
}
