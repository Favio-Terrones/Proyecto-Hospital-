/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Administrador;
import modelo.Sistema;
import vista.JFrameCrearMedico;
import vista.JFrameCrearPaciente;
import vista.JFrameMenuAdministrador;
import vista.JFrameUsuariosSistema;

/**
 *
 * @author Favio
 */
public class ControladorUsuariosSistema {

    JFrameUsuariosSistema vistaAt;
    Administrador adminAt;
    Sistema sistemaAt;

    public ControladorUsuariosSistema(JFrameUsuariosSistema vistaPa, Administrador adminPa, Sistema sistemaPa) {
        this.vistaAt = vistaPa;
        this.adminAt = adminPa;
        this.sistemaAt = sistemaPa;

        iniciar();
        ActualizarTablaPacientes();

        this.vistaAt.jComboBox1.setSelectedIndex(1);

        this.vistaAt.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaPa.dispose();
                JFrameMenuAdministrador vistaAdmin = new JFrameMenuAdministrador();
                ControladorVentanaAdministrador contrAdmin = new ControladorVentanaAdministrador(vistaAdmin, adminPa, sistemaPa);

            }
        });
       this.vistaAt.btnAgregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = vistaPa.jComboBox1.getSelectedIndex();
                switch(posicion){
                    case 0 : 
                            JFrameCrearMedico jcm = new JFrameCrearMedico();
                            ControladorCrearMedico ccm = new ControladorCrearMedico(jcm, adminAt, sistemaAt);
                            vistaAt.dispose();
                            jcm.setVisible(true);
                            jcm.setLocationRelativeTo(null);
                            jcm.setResizable(false);
                            break;
                    case 1 :
                           JFrameCrearPaciente jcp = new JFrameCrearPaciente();
                           ControladorCrearPaciente ccp = new ControladorCrearPaciente(jcp, adminAt, sistemaAt);
                           vistaAt.dispose();
                           jcp.setVisible(true);
                           jcp.setLocationRelativeTo(null);
                           jcp.setResizable(false);
                           break;
                    case 2 : 
                             JOptionPane.showMessageDialog(vistaPa, "No es posible crear administradores desde esta ventana", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }
            }
       });
        this.vistaAt.jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = vistaPa.jComboBox1.getSelectedIndex();
                switch (posicion) {
                    case 0:
                        ActualizarTablaMedicos();
                        break;
                    case 1:
                        ActualizarTablaPacientes();
                        break;

                    case 2:
                        ActualizarTablaAdministradores();
                        break;

                }
            }
        });

        this.vistaAt.btnEliminarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = vistaPa.tableUsuarios.getSelectedRow();
                //int columna = vistaAt.tableUsuarios.getSelectedColumn();

                switch (vistaPa.jComboBox1.getSelectedIndex()) {
                    case 0:
                        if (fila >= 0) {

                            sistemaPa.getListamedicos().EliminarNodoConPosInicioFin(fila);
                            ActualizarTablaMedicos();
                            JOptionPane.showMessageDialog(vistaPa, "Medico eliminado", "Eliminar Usuario", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            if (sistemaPa.getListamedicos().estVacio()) {
                                JOptionPane.showMessageDialog(vistaPa, "No existen registros para eliminar", "Eliminar Usuario", JOptionPane.WARNING_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(vistaPa, "Selecciones una fila de la tabla ", "Eliminar Usuario", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        break;
                    case 1:
                        if (fila >= 0) {

                            sistemaPa.getListapacientes().eliminarNodoConPosInicioFin(fila);
                            ActualizarTablaPacientes();
                            JOptionPane.showMessageDialog(vistaPa, "Paciente eliminado", "Eliminar Usuario", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            if (sistemaPa.getListamedicos().estVacio()) {
                                JOptionPane.showMessageDialog(vistaPa, "No existen registros para eliminar", "Eliminar Usuario", JOptionPane.WARNING_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(vistaPa, "Selecciones una fila de la tabla ", "Eliminar Usuario", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        break;

                    case 2:
                        JOptionPane.showMessageDialog(vistaPa, "No se pueden borrar administradores", "Eliminar Usuario", JOptionPane.WARNING_MESSAGE);
                        break;
                }

            }
        });
        this.vistaAt.btn_OrdCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int posicion = vistaPa.jComboBox1.getSelectedIndex();
                switch (posicion) {
                    case 0:
                        sistemaAt.getListamedicos().IniciarQuickSortCodigo(sistemaAt.getListamedicos().getInicio());
                        ActualizarTablaMedicos();
                        break;
                    case 1:
                        sistemaAt.getListapacientes().IniciarQuickSortCodigo(sistemaAt.getListapacientes().getInicio());
                        ActualizarTablaPacientes();
                        break;

                    case 2:
                        sistemaAt.getListaadmins().IniciarQuickSortCodigo(sistemaAt.getListaadmins().getInicio());
                        ActualizarTablaAdministradores();
                        break;

                }
            }
        });

    }

    public void iniciar() {
        this.vistaAt.setLocationRelativeTo(null);
        this.vistaAt.setVisible(true);
        this.vistaAt.setResizable(false);
    }

    private void ActualizarTablaMedicos() {

        DefaultTableModel modelotabla = new DefaultTableModel(sistemaAt.getListamedicos().getDatosUsSisInicioFinal(), sistemaAt.getListamedicos().getCabeceraUsSis());
        this.vistaAt.tableUsuarios.setModel(modelotabla);
    }

    private void ActualizarTablaPacientes() {

        DefaultTableModel modelotabla = new DefaultTableModel(sistemaAt.getListapacientes().getDatosInicioFinal(), sistemaAt.getListapacientes().cabecera());
        this.vistaAt.tableUsuarios.setModel(modelotabla);
    }

    private void ActualizarTablaAdministradores() {

        DefaultTableModel modelotabla = new DefaultTableModel(sistemaAt.getListaadmins().getDatosInicioFinal(), sistemaAt.getListaadmins().cabecera());
        this.vistaAt.tableUsuarios.setModel(modelotabla);
    }

}
