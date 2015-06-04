/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Basica;

import java.awt.Component;
import static java.util.Collections.list;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import static org.eclipse.persistence.jpa.jpql.utility.CollectionTools.list;

/**
 *
 * @author AndresFelipe
 * @param <T>
 * @param panelEdicion
 */
public class VentanaBasica<T> extends javax.swing.JInternalFrame {

    private IPanelEdicion panelEdicion = null;
    private Estado_Ventana estado_Ventana = null;
    private List<Object[]> list;
    
    /**
     * Creates new form VentanaBasica
     * 
     */
    public VentanaBasica(IPanelEdicion panelEdicion) {
        this.panelEdicion = panelEdicion;
        initComponents();
        SplitPanel.setTopComponent((Component) panelEdicion);
        cargarTabla();
    }    
    
    public void cargarTabla() {
        list = panelEdicion.getListaParaTabla();
        DefaultTableModel defaultTableModel;
        TablaRegistro.setModel(defaultTableModel = new DefaultTableModel(panelEdicion.getNombreDeColumnas(), 0));
        for (Object[] fila : list) {
            defaultTableModel.addRow(fila);
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

        PanelHeadOpciones = new javax.swing.JPanel();
        BotonNuevo = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonActivarEdicion = new javax.swing.JButton();
        SplitPanel = new javax.swing.JSplitPane();
        ScrollPaneTablaRegistro = new javax.swing.JScrollPane();
        TablaRegistro = new javax.swing.JTable();
        PanelFooterProgreso = new javax.swing.JPanel();
        BarraProgreso = new javax.swing.JProgressBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(502, 524));

        PanelHeadOpciones.setMinimumSize(new java.awt.Dimension(332, 23));
        PanelHeadOpciones.setPreferredSize(new java.awt.Dimension(486, 40));
        PanelHeadOpciones.setLayout(new java.awt.GridBagLayout());

        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });
        PanelHeadOpciones.add(BotonNuevo, new java.awt.GridBagConstraints());

        BotonGuardar.setText("Guardar");
        BotonGuardar.setEnabled(false);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelHeadOpciones.add(BotonGuardar, new java.awt.GridBagConstraints());

        BotonEliminar.setText("Eliminar");
        BotonEliminar.setEnabled(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        PanelHeadOpciones.add(BotonEliminar, new java.awt.GridBagConstraints());

        BotonActivarEdicion.setText("Activar Edición");
        BotonActivarEdicion.setEnabled(false);
        BotonActivarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActivarEdicionActionPerformed(evt);
            }
        });
        PanelHeadOpciones.add(BotonActivarEdicion, new java.awt.GridBagConstraints());

        SplitPanel.setBorder(null);
        SplitPanel.setDividerLocation(110);
        SplitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitPanel.setOneTouchExpandable(true);
        SplitPanel.setPreferredSize(new java.awt.Dimension(452, 430));

        TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaRegistroMouseReleased(evt);
            }
        });
        TablaRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaRegistroKeyReleased(evt);
            }
        });
        ScrollPaneTablaRegistro.setViewportView(TablaRegistro);

        SplitPanel.setBottomComponent(ScrollPaneTablaRegistro);

        javax.swing.GroupLayout PanelFooterProgresoLayout = new javax.swing.GroupLayout(PanelFooterProgreso);
        PanelFooterProgreso.setLayout(PanelFooterProgresoLayout);
        PanelFooterProgresoLayout.setHorizontalGroup(
            PanelFooterProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelFooterProgresoLayout.setVerticalGroup(
            PanelFooterProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHeadOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(PanelFooterProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHeadOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SplitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooterProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Confirma guardar ?", "Guardar", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            //this.panelEdicion.Guardar(estado_Ventana);
            estado_Ventana = Estado_Ventana.GUARDADO;
            evualuarEstadoEnVentana();
            this.cargarTabla();
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        estado_Ventana = Estado_Ventana.NUEVO;
        this.panelEdicion.Nuevo();
        evualuarEstadoEnVentana();
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void TablaRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaRegistroKeyReleased
        notificarSeleccionDeObjeto();
    }//GEN-LAST:event_TablaRegistroKeyReleased

    private void TablaRegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistroMouseReleased
        notificarSeleccionDeObjeto();
    }//GEN-LAST:event_TablaRegistroMouseReleased

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Confirma eliminar ?", "Eliminar", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            estado_Ventana = Estado_Ventana.ELIMINADO;
            this.panelEdicion.Eliminar();
            evualuarEstadoEnVentana();
            this.cargarTabla();
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonActivarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActivarEdicionActionPerformed
        estado_Ventana = Estado_Ventana.EDICION;
        this.panelEdicion.ActivarEdicion();
        evualuarEstadoEnVentana();
    }//GEN-LAST:event_BotonActivarEdicionActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProgreso;
    private javax.swing.JButton BotonActivarEdicion;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JPanel PanelFooterProgreso;
    private javax.swing.JPanel PanelHeadOpciones;
    private javax.swing.JScrollPane ScrollPaneTablaRegistro;
    private javax.swing.JSplitPane SplitPanel;
    public javax.swing.JTable TablaRegistro;
    // End of variables declaration//GEN-END:variables

    
    private void notificarSeleccionDeObjeto() {
        estado_Ventana = Estado_Ventana.SELECCION_EN_TABLA;

        int Filas = TablaRegistro.getSelectedRow();
        int Columnas = TablaRegistro.getSelectedColumn();
        if (Filas > -1 && Columnas > -1) {
            this.panelEdicion.Seleccionar((Vector) ((DefaultTableModel) TablaRegistro.getModel()).getDataVector().get(Filas));
        }
        evualuarEstadoEnVentana();
    }
    
    private void evualuarEstadoEnVentana() {
        if (estado_Ventana != null) {
            if (estado_Ventana.equals(Estado_Ventana.SELECCION_EN_TABLA)) {
                for (int i = 0; i < ((JPanel) panelEdicion).getComponents().length; i++) {
                    Component component = ((JPanel) panelEdicion).getComponents()[i];
                    if (!(component instanceof JLabel)) {
                        component.setEnabled(false);
                    }
                }
                BotonActivarEdicion.setEnabled(true);
                BotonEliminar.setEnabled(true);
                BotonGuardar.setEnabled(false);
                BotonNuevo.setEnabled(true);
            } else if (estado_Ventana.equals(Estado_Ventana.ELIMINADO)) {
                for (int i = 0; i < ((JPanel) panelEdicion).getComponentCount(); i++) {
                    Component component = ((JPanel) panelEdicion).getComponents()[i];
                    if (component instanceof JTextField) {
                        ((JTextField) component).setText("");
                    }
                    component.setEnabled(false);
                }
                BotonActivarEdicion.setEnabled(false);
                BotonEliminar.setEnabled(false);
                BotonGuardar.setEnabled(false);
                BotonNuevo.setEnabled(true);
            } else if (estado_Ventana.equals(Estado_Ventana.EDICION)) {
                for (int i = 0; i < ((JPanel) panelEdicion).getComponentCount(); i++) {
                    Component component = ((JPanel) panelEdicion).getComponents()[i];
                    component.setEnabled(true);
                }
                BotonActivarEdicion.setEnabled(false);
                BotonEliminar.setEnabled(true);
                BotonGuardar.setEnabled(true);
                BotonNuevo.setEnabled(true);
            } else if (estado_Ventana.equals(Estado_Ventana.GUARDADO)) {
                for (int i = 0; i < ((JPanel) panelEdicion).getComponentCount(); i++) {
                    Component component = ((JPanel) panelEdicion).getComponents()[i];
                    component.setEnabled(false);
                }
                BotonActivarEdicion.setEnabled(true);
                BotonEliminar.setEnabled(true);
                BotonEliminar.setEnabled(false);
                BotonNuevo.setEnabled(true);
            } else if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
                for (int i = 0; i < ((JPanel) panelEdicion).getComponentCount(); i++) {
                    Component component = ((JPanel) panelEdicion).getComponents()[i];
                    if (component instanceof JTextField) {
                        ((JTextField) component).setText("");
                    }
                    if (component instanceof JLabel) {
                        ((JTextField) component).setText("");
                    }
                    component.setEnabled(true);
                }
                BotonActivarEdicion.setEnabled(false);
                BotonEliminar.setEnabled(false);
                BotonGuardar.setEnabled(true);
                BotonNuevo.setEnabled(true);
            }
        }
    }
}
