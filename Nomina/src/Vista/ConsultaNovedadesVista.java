/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.NovedadesControl;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandra
 */
public class ConsultaNovedadesVista extends javax.swing.JPanel {
    Vistas vista=new Vistas();
    int idtrabajador;

    /**
     * Creates new form ConsultaNovedadesVista
     */
    public ConsultaNovedadesVista(String idtrabajador) throws SQLException {
        initComponents();
       
        if (idtrabajador != null) {
            this.idtrabajador = Integer.parseInt(idtrabajador);
            JTFIDtrabajador.setText(idtrabajador);
            NovedadesControl nvC = new NovedadesControl();
            jTableNovedades.setModel(nvC.listaNovedades(this.idtrabajador));
           

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNovedades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        JTFIDtrabajador = new javax.swing.JTextField();
        jBConsultarTrabajador = new javax.swing.JButton();
        jLNombreTrabajador = new javax.swing.JLabel();
        jLNt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNovedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableNovedades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableNovedades);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 215, 520, 320));

        jLabel2.setText("Consultar Novedades de nomina");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 33, -1, -1));

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        jBEliminar.setText("Eliminar Registro");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 180, -1));

        JBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/refresh_1.png"))); // NOI18N
        JBEditar.setText("Editar Registro");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });
        add(JBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Novedades del Trabajador"));

        jLabel13.setText("Digite el numero de identificación del trabajador*");

        JTFIDtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIDtrabajadorActionPerformed(evt);
            }
        });
        JTFIDtrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFIDtrabajadorKeyTyped(evt);
            }
        });

        jBConsultarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nstar.png"))); // NOI18N
        jBConsultarTrabajador.setText("Consultar");
        jBConsultarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarTrabajadorActionPerformed(evt);
            }
        });

        jLNt.setText("Nombre Trabajador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLNt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNombreTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFIDtrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBConsultarTrabajador)
                .addGap(181, 181, 181))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(JTFIDtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBConsultarTrabajador)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLNt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 650, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) jTableNovedades.getModel();
        String idNovedad = String.valueOf(tm.getValueAt(jTableNovedades.getSelectedRow(), 0));
        int cantHoras = Integer.parseInt(String.valueOf(tm.getValueAt(jTableNovedades.getSelectedRow(), 2)));
        NovedadesControl nvC = new NovedadesControl();
        try {
            EscritorioGestorNomina.Escritorio.add(vista.returnInternal(
                    new EdicionNovedades(idNovedad),"Edición de novedades"));
                    EscritorioGestorNomina.Escritorio.getSelectedFrame().dispose();
                    EscritorioGestorNomina.Escritorio.selectFrame(true);
          //  nvC.editarNovedades(idNovedad, cantHoras);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaNovedadesVista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ConsultaNovedadesVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        System.out.println(jTableNovedades.getSelectedRow());
        
        DefaultTableModel tm = (DefaultTableModel) jTableNovedades.getModel();
        int idNovedad = Integer.parseInt(String.valueOf(tm.getValueAt(jTableNovedades.getSelectedRow(), 0)));
        NovedadesControl nvC = new NovedadesControl();
        nvC.eliminarRegistro(idNovedad);
        try {
            jTableNovedades.setModel(nvC.listaNovedades(idtrabajador));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaNovedadesVista.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Se eliminó el registro de forma exitosa");
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void JTFIDtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIDtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDtrabajadorActionPerformed

    private void JTFIDtrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFIDtrabajadorKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_JTFIDtrabajadorKeyTyped

    private void jBConsultarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarTrabajadorActionPerformed
        try {
            int idtrabajador = Integer.parseInt(JTFIDtrabajador.getText());
            this.idtrabajador=idtrabajador;

            //Conectarlo a la clase que camilo haga de trabajador.
            boolean esValido = false;//Llamar metodo
            NovedadesControl nvControl = new NovedadesControl();
            try {
                esValido = nvControl.existeTrabPorCedula(idtrabajador);
            } catch (SQLException ex) {
                Logger.getLogger(JPanelRegistroNovedades.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (esValido) {
                try {
                    jLNombreTrabajador.setText(nvControl.
                            consultanombreTrabPorCedula(idtrabajador));
                    NovedadesControl nvC = new NovedadesControl();
                    jTableNovedades.setModel(nvC.listaNovedades(idtrabajador));
                } catch (SQLException ex) {
                    Logger.getLogger(JPanelRegistroNovedades.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, nvControl.
                        consultanombreTrabPorCedula(idtrabajador));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El valor digitado no es válido");
            JTFIDtrabajador.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(JPanelRegistroNovedades.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBConsultarTrabajadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFIDtrabajador;
    private javax.swing.JButton jBConsultarTrabajador;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JLabel jLNombreTrabajador;
    private javax.swing.JLabel jLNt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNovedades;
    // End of variables declaration//GEN-END:variables
}
