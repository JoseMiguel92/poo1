/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import elecciones.FormacionPolitica;
import elecciones.PartidoPolitico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josemi
 */
public class Igelec extends javax.swing.JFrame {
    
    private ArrayList<FormacionPolitica> formacionesPoliticas = new ArrayList<>();

    /**
     * Creates new form igelec
     */
    public Igelec() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameAñadirPartido = new javax.swing.JFrame();
        jButtonAñadirPP = new javax.swing.JButton();
        jLabelNombrePP = new javax.swing.JLabel();
        jTextFieldNombrePP = new javax.swing.JTextField();
        jLabelSiglasPP = new javax.swing.JLabel();
        jTextFieldSiglasPP = new javax.swing.JTextField();
        jLabelLogoPP = new javax.swing.JLabel();
        jTextFieldLogoPP = new javax.swing.JTextField();
        jFrameAñadirMilitantePartido = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombreAñadirM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEdadAñadirM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldGeneroAñadirM = new javax.swing.JTextField();
        jTextFieldProfesionM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Cargar = new javax.swing.JTabbedPane();
        TabPersonas = new javax.swing.JPanel();
        InfoPersonas = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        añadirPersona = new javax.swing.JButton();
        borrarPersona = new javax.swing.JButton();
        importarPersona = new javax.swing.JButton();
        exportarPersona = new javax.swing.JButton();
        TabFP = new javax.swing.JPanel();
        InfoFormacionesPoliticas = new javax.swing.JScrollPane();
        jTableFormacionesPoliticas = new javax.swing.JTable();
        añadirPartido = new javax.swing.JButton();
        añadirCoalicion = new javax.swing.JButton();
        borrarFormacion = new javax.swing.JButton();
        importarPartido = new javax.swing.JButton();
        exportarPartido = new javax.swing.JButton();
        TabCircun = new javax.swing.JPanel();
        InfoCircunscripciones = new javax.swing.JScrollPane();
        jTableCircunscripcion = new javax.swing.JTable();
        añadirCircun = new javax.swing.JButton();
        borrarCircun = new javax.swing.JButton();
        importarCircun = new javax.swing.JButton();
        exportarCircun = new javax.swing.JButton();
        salidaTexto = new java.awt.TextArea();

        jButtonAñadirPP.setText("Añadir");
        jButtonAñadirPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirPPActionPerformed(evt);
            }
        });

        jLabelNombrePP.setText("Nombre");

        jLabelSiglasPP.setText("Siglas");

        jLabelLogoPP.setText("Logo");

        javax.swing.GroupLayout jFrameAñadirPartidoLayout = new javax.swing.GroupLayout(jFrameAñadirPartido.getContentPane());
        jFrameAñadirPartido.getContentPane().setLayout(jFrameAñadirPartidoLayout);
        jFrameAñadirPartidoLayout.setHorizontalGroup(
            jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAñadirPartidoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAñadirPP)
                    .addGroup(jFrameAñadirPartidoLayout.createSequentialGroup()
                        .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombrePP)
                            .addComponent(jLabelSiglasPP)
                            .addComponent(jLabelLogoPP))
                        .addGap(38, 38, 38)
                        .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLogoPP, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextFieldSiglasPP)
                            .addComponent(jTextFieldNombrePP))))
                .addContainerGap(696, Short.MAX_VALUE))
        );
        jFrameAñadirPartidoLayout.setVerticalGroup(
            jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAñadirPartidoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombrePP)
                    .addComponent(jTextFieldNombrePP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSiglasPP)
                    .addComponent(jTextFieldSiglasPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jFrameAñadirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogoPP)
                    .addComponent(jTextFieldLogoPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jButtonAñadirPP)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jLabel4.setText("Nombre y Apellidos:");

        jTextFieldNombreAñadirM.setText("jTextField1");

        jLabel5.setText("Edad:");

        jTextFieldEdadAñadirM.setText("jTextField2");

        jLabel6.setText("Genero:");

        jTextFieldGeneroAñadirM.setText("jTextField3");

        jTextFieldProfesionM.setText("jTextField4");

        jLabel7.setText("Profesion:");

        jButton3.setText("Añadir Militante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameAñadirMilitantePartidoLayout = new javax.swing.GroupLayout(jFrameAñadirMilitantePartido.getContentPane());
        jFrameAñadirMilitantePartido.getContentPane().setLayout(jFrameAñadirMilitantePartidoLayout);
        jFrameAñadirMilitantePartidoLayout.setHorizontalGroup(
            jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAñadirMilitantePartidoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldNombreAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEdadAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldGeneroAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldProfesionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jFrameAñadirMilitantePartidoLayout.setVerticalGroup(
            jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAñadirMilitantePartidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNombreAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEdadAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldGeneroAñadirM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jFrameAñadirMilitantePartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldProfesionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePersonas.setModel(new modelos.PersonaTableModel());
        InfoPersonas.setViewportView(jTablePersonas);

        añadirPersona.setText("Añadir");
        añadirPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPersonaActionPerformed(evt);
            }
        });

        borrarPersona.setText("Eliminar seleccionados");

        importarPersona.setText("Importar");

        exportarPersona.setText("Exportar");

        javax.swing.GroupLayout TabPersonasLayout = new javax.swing.GroupLayout(TabPersonas);
        TabPersonas.setLayout(TabPersonasLayout);
        TabPersonasLayout.setHorizontalGroup(
            TabPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TabPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarPersona)
                    .addComponent(importarPersona)
                    .addComponent(exportarPersona)
                    .addComponent(añadirPersona))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabPersonasLayout.setVerticalGroup(
            TabPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPersonasLayout.createSequentialGroup()
                        .addComponent(añadirPersona)
                        .addGap(18, 18, 18)
                        .addComponent(borrarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(importarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(exportarPersona))
                    .addComponent(InfoPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Cargar.addTab("Personas", TabPersonas);

        jTableFormacionesPoliticas.setModel(new modelos.PartidoTableModel());
        InfoFormacionesPoliticas.setViewportView(jTableFormacionesPoliticas);
        if (jTableFormacionesPoliticas.getColumnModel().getColumnCount() > 0) {
            jTableFormacionesPoliticas.getColumnModel().getColumn(0).setResizable(false);
            jTableFormacionesPoliticas.getColumnModel().getColumn(1).setResizable(false);
        }

        añadirPartido.setText("Añadir Partido Político");
        añadirPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirPartidoMouseClicked(evt);
            }
        });
        añadirPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPartidoActionPerformed(evt);
            }
        });

        añadirCoalicion.setText("Crear Coalición");
        añadirCoalicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCoalicionActionPerformed(evt);
            }
        });

        borrarFormacion.setText("Eliminar Seleccionados");

        importarPartido.setText("Importar Partido");

        exportarPartido.setText("Exportar Partido");

        javax.swing.GroupLayout TabFPLayout = new javax.swing.GroupLayout(TabFP);
        TabFP.setLayout(TabFPLayout);
        TabFPLayout.setHorizontalGroup(
            TabFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabFPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoFormacionesPoliticas, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TabFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadirCoalicion)
                    .addComponent(añadirPartido)
                    .addComponent(borrarFormacion)
                    .addComponent(importarPartido)
                    .addComponent(exportarPartido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabFPLayout.setVerticalGroup(
            TabFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabFPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabFPLayout.createSequentialGroup()
                        .addComponent(añadirPartido)
                        .addGap(18, 18, 18)
                        .addComponent(añadirCoalicion)
                        .addGap(18, 18, 18)
                        .addComponent(borrarFormacion)
                        .addGap(18, 18, 18)
                        .addComponent(importarPartido)
                        .addGap(18, 18, 18)
                        .addComponent(exportarPartido))
                    .addComponent(InfoFormacionesPoliticas, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Cargar.addTab("Formaciones Políticas", TabFP);

        jTableCircunscripcion.setModel(new modelos.CircunscripcionTableModel());
        InfoCircunscripciones.setViewportView(jTableCircunscripcion);

        añadirCircun.setText("Añadir");
        añadirCircun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCircunActionPerformed(evt);
            }
        });

        borrarCircun.setText("Borrar");

        importarCircun.setText("Importar");

        exportarCircun.setText("Exportar");

        javax.swing.GroupLayout TabCircunLayout = new javax.swing.GroupLayout(TabCircun);
        TabCircun.setLayout(TabCircunLayout);
        TabCircunLayout.setHorizontalGroup(
            TabCircunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabCircunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoCircunscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TabCircunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarCircun)
                    .addComponent(importarCircun)
                    .addComponent(exportarCircun)
                    .addComponent(añadirCircun))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        TabCircunLayout.setVerticalGroup(
            TabCircunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabCircunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabCircunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabCircunLayout.createSequentialGroup()
                        .addComponent(añadirCircun)
                        .addGap(18, 18, 18)
                        .addComponent(borrarCircun)
                        .addGap(18, 18, 18)
                        .addComponent(importarCircun)
                        .addGap(18, 18, 18)
                        .addComponent(exportarCircun))
                    .addComponent(InfoCircunscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Cargar.addTab("Circunscripciones", TabCircun);

        salidaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        salidaTexto.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cargar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salidaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salidaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        Cargar.getAccessibleContext().setAccessibleName("Pestañas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPartidoActionPerformed
        // TODO add your handling code here:
        jFrameAñadirPartido.setLocationRelativeTo(null);
        jFrameAñadirPartido.setSize(400, 400);
        jFrameAñadirPartido.setVisible(true);
        
        
    }//GEN-LAST:event_añadirPartidoActionPerformed

    private void añadirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirPersonaActionPerformed

    private void añadirCircunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCircunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirCircunActionPerformed

    private void añadirPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPartidoMouseClicked
        //jPanelAñadirPartido.setVisible(true);
    }//GEN-LAST:event_añadirPartidoMouseClicked

    private void jButtonAñadirPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirPPActionPerformed
        // TODO add your handling code here:
        PartidoPolitico nuevoPartido = new PartidoPolitico(jTextFieldNombrePP.getText(), jTextFieldSiglasPP.getText(), jTextFieldLogoPP.getText());
        formacionesPoliticas.add(nuevoPartido);
        
        //Rellena tabla formaciones politicas
        DefaultTableModel modelo = (DefaultTableModel) jTableFormacionesPoliticas.getModel();
        Object[] fila = new Object[]{nuevoPartido.getNombre(),nuevoPartido.getSiglas()};
        modelo.addRow(fila);
        
        
        //Resetea campos
        jFrameAñadirPartido.setVisible(false);
        jTextFieldNombrePP.setText("");
        jTextFieldLogoPP.setText("");
        jTextFieldSiglasPP.setText("");
        
        System.out.println(formacionesPoliticas.toString());
        
    }//GEN-LAST:event_jButtonAñadirPPActionPerformed

    private void añadirCoalicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCoalicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirCoalicionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Igelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Igelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Igelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Igelec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Igelec().setVisible(true);
            }
        });
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Cargar;
    private javax.swing.JScrollPane InfoCircunscripciones;
    private javax.swing.JScrollPane InfoFormacionesPoliticas;
    private javax.swing.JScrollPane InfoPersonas;
    private javax.swing.JPanel TabCircun;
    private javax.swing.JPanel TabFP;
    private javax.swing.JPanel TabPersonas;
    private javax.swing.JButton añadirCircun;
    private javax.swing.JButton añadirCoalicion;
    private javax.swing.JButton añadirPartido;
    private javax.swing.JButton añadirPersona;
    private javax.swing.JButton borrarCircun;
    private javax.swing.JButton borrarFormacion;
    private javax.swing.JButton borrarPersona;
    private javax.swing.JButton exportarCircun;
    private javax.swing.JButton exportarPartido;
    private javax.swing.JButton exportarPersona;
    private javax.swing.JButton importarCircun;
    private javax.swing.JButton importarPartido;
    private javax.swing.JButton importarPersona;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAñadirPP;
    private javax.swing.JFrame jFrameAñadirMilitantePartido;
    private javax.swing.JFrame jFrameAñadirPartido;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLogoPP;
    private javax.swing.JLabel jLabelNombrePP;
    private javax.swing.JLabel jLabelSiglasPP;
    private javax.swing.JTable jTableCircunscripcion;
    private javax.swing.JTable jTableFormacionesPoliticas;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JTextField jTextFieldEdadAñadirM;
    private javax.swing.JTextField jTextFieldGeneroAñadirM;
    private javax.swing.JTextField jTextFieldLogoPP;
    private javax.swing.JTextField jTextFieldNombreAñadirM;
    private javax.swing.JTextField jTextFieldNombrePP;
    private javax.swing.JTextField jTextFieldProfesionM;
    private javax.swing.JTextField jTextFieldSiglasPP;
    private java.awt.TextArea salidaTexto;
    // End of variables declaration//GEN-END:variables
}
