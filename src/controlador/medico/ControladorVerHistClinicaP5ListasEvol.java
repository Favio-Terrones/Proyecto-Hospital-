/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.medico;

import modelo.Sistema;
import modelo.HistoriaClinicaApertura;
import modelo.Medico;
import controlador.medico.ControladorVerHistClinicaP3;
import controlador.medico.ControladorVerHistClinicaEVOL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Evolucion;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorVerHistClinicaP5ListasEvol {

    private HistoriaClinicaApertura historiaAt;
    private Medico medicoAt;
    private JFrameHistoriaClinicaP5 vistaAt;
    private Sistema sistemaAt;

    public ControladorVerHistClinicaP5ListasEvol(HistoriaClinicaApertura historiaAT, Medico medicoAt, JFrameHistoriaClinicaP5 vitaAt, Sistema sistema) {
        this.historiaAt = historiaAT;
        this.medicoAt = medicoAt;
        this.vistaAt = vitaAt;
        this.sistemaAt = sistema;

        iniciarVista();
        
        ActualizarTabla();
        vistaAt.btn_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAt.dispose();
                JFrameHistoriaClinicaP4 vistahistp4 = new JFrameHistoriaClinicaP4();

                ControladorVerHistClinicaP4 controladorhistp4 = new ControladorVerHistClinicaP4(historiaAT, medicoAt, vistahistp4, sistemaAt);

            }
        });
        
        
        this.vistaAt.jtable_ListaEvol.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    
                    
                    String codigohistoria =(String) vistaAt.jtable_ListaEvol.getValueAt(row, 0);
                    JOptionPane.showMessageDialog(null, "Se selecciono :" + codigohistoria); 
                
                    
                    
                    vistaAt.dispose();
                    
                    
                    Evolucion evolucion = historiaAt.getListaevoluciones().ObtenerNodoConPosInicioFin(row).elemento;
                    JFrameHistoriaClinicaEVOLUC vistaEvoluc = new JFrameHistoriaClinicaEVOLUC();
                    
                    ControladorVerHistClinicaEVOL controladorEvo = new ControladorVerHistClinicaEVOL(historiaAt, medicoAt, vistaEvoluc, sistemaAt,evolucion);
                    
                    
                }
            }
        });
        
    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
       
     
     
       

    }
    
    public void ActualizarTabla(){
        DefaultTableModel modelotabla = new DefaultTableModel(historiaAt.getListaevoluciones().getDatosInicioFinal(),historiaAt.getListaevoluciones().getcabecera());
        this.vistaAt.jtable_ListaEvol.setModel(modelotabla);
    }
}
