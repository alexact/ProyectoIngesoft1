/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.controlContrato;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class contratoTerminoIn extends javax.swing.JPanel {

    /**
     * Creates new form contratoTerminoIn
     */
    public contratoTerminoIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ciudadRP = new javax.swing.JTextField();
        jlbDesvOVarP3 = new javax.swing.JLabel();
        diaFSL = new javax.swing.JFormattedTextField();
        jlbDesvOVarP5 = new javax.swing.JLabel();
        jlbDesvOVarP6 = new javax.swing.JLabel();
        salario = new javax.swing.JFormattedTextField();
        jlbDesvOVarP7 = new javax.swing.JLabel();
        plasoPago = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cedulaP = new javax.swing.JFormattedTextField();
        jlbDesvOVarP1 = new javax.swing.JLabel();
        horaI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        horaFin = new javax.swing.JTextField();
        FechaInicio = new com.toedter.calendar.JDateChooser();

        String text = "<html><body>Calcula el intervalo de confianza para la diferencia de medias de dos poblaciones.<br> Corresponde al caso #3, donde ambas varianzas poblacionales son desconocidas,<br> pero se asume que son diferentes.</body></html>.";
        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contrato tiempo indefinido");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Estado civil:");

        estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese una opcion", "Casado", "Soltero", "Union Libre" }));
        estadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCivilActionPerformed(evt);
            }
        });

        jLabel6.setText("Ciudad de residencia:");

        jlbDesvOVarP3.setText("Dia finaliza semana laboral:");

        jlbDesvOVarP5.setText("Fecha inicio trabajo:");

        jlbDesvOVarP6.setText("Salario:");

        jlbDesvOVarP7.setText("Plaso de pago:");

        plasoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese una opcion", "Quincenal", "Mensual" }));
        plasoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plasoPagoActionPerformed(evt);
            }
        });

        jButton1.setText("Generar contrato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cedulaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaPActionPerformed(evt);
            }
        });

        jlbDesvOVarP1.setText("N° de cedula:");

        jLabel8.setText("Hora inicio jornada laboral:");

        jLabel10.setText("Hora fin jornada laboral:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbDesvOVarP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbDesvOVarP6)
                            .addComponent(jlbDesvOVarP7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbDesvOVarP5)
                                    .addComponent(jlbDesvOVarP3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaFSL, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plasoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horaI, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ciudadRP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDesvOVarP1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaFSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDesvOVarP3)
                    .addComponent(jLabel7)
                    .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ciudadRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbDesvOVarP5)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDesvOVarP6)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDesvOVarP7)
                    .addComponent(plasoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCivilActionPerformed

    private void plasoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plasoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plasoPagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( cedulaP.getText().isEmpty()||estadoCivil.getSelectedIndex()==0||
            ciudadRP.getText().isEmpty()||
            diaFSL.getText().isEmpty()|| FechaInicio.getAutoscrolls()||
            salario.getText().isEmpty()||
            plasoPago.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Verifica que todos los campos se encuentren llenos");
        }if( CC.buscarTrabajador(Long.parseLong(cedulaP.getText()))==null){
            JOptionPane.showMessageDialog(this, "La cedula ingresada no se encuentra registrada");
        }else{
            String estadoCivilP = "";
            String plasoPagoP = "";
            if(estadoCivil.getSelectedIndex()==1){
                estadoCivilP = "Casado";
            }if(estadoCivil.getSelectedIndex()==2){
                estadoCivilP = "Soltero";
            }else{
                estadoCivilP = "UnionLibre";
            }
            if(plasoPago.getSelectedIndex()==1){
                plasoPagoP = "Quincenal";
            }else{
                plasoPagoP = "Mensual";
            }
            try {
                CC.crearContratoIndefinido(Long.parseLong(cedulaP.getText()), estadoCivilP,
                        ciudadRP.getText(), diaFSL.getText(),FechaInicio.getCalendar(), plasoPagoP,Integer.parseInt(horaI.getText()),
                        Integer.parseInt(horaFin.getText()), Integer.parseInt(salario.getText()));
                JOptionPane.showMessageDialog(this, "Contrato creado exitosamente");
            } catch (IOException ex) {
                Logger.getLogger(contratoTerminoIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cedulaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JFormattedTextField cedulaP;
    private javax.swing.JTextField ciudadRP;
    private javax.swing.JFormattedTextField diaFSL;
    private javax.swing.JComboBox<String> estadoCivil;
    private javax.swing.JTextField horaFin;
    private javax.swing.JTextField horaI;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbDesvOVarP1;
    private javax.swing.JLabel jlbDesvOVarP3;
    private javax.swing.JLabel jlbDesvOVarP5;
    private javax.swing.JLabel jlbDesvOVarP6;
    private javax.swing.JLabel jlbDesvOVarP7;
    private javax.swing.JComboBox<String> plasoPago;
    private javax.swing.JFormattedTextField salario;
    // End of variables declaration//GEN-END:variables
controlContrato CC = new controlContrato();
}
