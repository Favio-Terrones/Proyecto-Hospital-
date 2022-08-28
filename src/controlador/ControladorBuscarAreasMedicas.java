/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.medico.ControladorVerHistClinicaEVOL;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Evolucion;
import modelo.Medico;
import modelo.Paciente;
import modelo.Sistema;
import vista.*;
import vista.JFrameMenuPaciente;

/**
 *
 * @author Favio
 */
public class ControladorBuscarAreasMedicas {

    JFrameBuscarAreasMedicas vistaAt;
    Paciente pacienteAt;
    Sistema sistemaAt;

    public ControladorBuscarAreasMedicas(JFrameBuscarAreasMedicas vistaPa, Paciente pacientePa, Sistema sistemaPa) {
        this.vistaAt = vistaPa;
        this.pacienteAt = pacientePa;
        this.sistemaAt = sistemaPa;
        iniciarVista();
        ActualizarTabla();
        this.vistaAt.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPa.dispose();
                JFrameMenuPaciente vistaMP = new JFrameMenuPaciente();
                ControladorVentanaPaciente cvp = new ControladorVentanaPaciente(pacientePa, vistaMP, sistemaPa);
                vistaMP.setVisible(true);
                vistaMP.setLocationRelativeTo(null);
                vistaMP.setResizable(false);
            }
        });
        this.vistaAt.btn_aplicarOrden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                switch (vistaAt.jcbox_ordenar.getSelectedIndex()) {
                    case 0:

                        sistemaAt.getListamedicos().IniciarQuickSortCodigo(sistemaAt.getListamedicos().getInicio());
                        ActualizarTabla();

                        break;
                    case 1:

                        sistemaAt.getListamedicos().IniciarQuickSortEspecialidad(sistemaAt.getListamedicos().getInicio());
                        ActualizarTabla();

                        break;

                    default:
                        JOptionPane.showMessageDialog(vistaPa, "Seleccione un filtro en el combobox", "Ordenar Areas", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            }
        });
        
        this.vistaAt.btn_reservarconfila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int fila = vistaPa.jtable_areasMedics.getSelectedRow();
                if(fila!=-1){
                String nombreesp =(String) vistaPa.jtable_areasMedics.getValueAt(fila, 2);
                String numero =(String) vistaPa.jtable_areasMedics.getValueAt(fila, 3);
                
                vistaAt.dispose();
                JFrameReservarCita vistaresvista = new JFrameReservarCita();
                ControladorReservarCita controladorReser = new ControladorReservarCita(vistaresvista, pacienteAt, sistemaAt,nombreesp, numero);
                controladorReser.bloquear();
                }else{
                    JOptionPane.showMessageDialog(vistaPa, "Seleccione una fila de la tabla", "Generar Cita", JOptionPane.WARNING_MESSAGE);
                       
                }
              
                
                
                }
        });
        
        this.vistaAt.jtable_areasMedics.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    Medico medicotest=sistemaAt.getListamedicos().ObtenerNodoConCodigo((String) vistaPa.jtable_areasMedics.getValueAt(row, 0)).elemento;
                    String diasocupados=medicotest.mostrardiasocupados();
                    JOptionPane.showMessageDialog(vistaAt, diasocupados, "Horario", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        });
        
        

    }

    public void iniciarVista() {

        vistaAt.setVisible(true);
        vistaAt.setLocationRelativeTo(null);
        vistaAt.setResizable(false);
    }

    public void ActualizarTabla() {
        DefaultTableModel modelotabla = new DefaultTableModel(sistemaAt.getListamedicos().getDatosCitaInicioFinal(), sistemaAt.getListamedicos().getCabeceraCita());
        this.vistaAt.jtable_areasMedics.setModel(modelotabla);
        
    }

}
