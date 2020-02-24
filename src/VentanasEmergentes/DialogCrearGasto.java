package VentanasEmergentes;

import Mundo.Consulta;
import javax.swing.JOptionPane;

public class DialogCrearGasto extends javax.swing.JDialog {

    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // ------------------------------------------------------------------------- 

    private Consulta consulta;

    // -------------------------------------------------------------------------
    // CONSTRUCTOR.
    // ------------------------------------------------------------------------- 
    public DialogCrearGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblErrorValor.setVisible(false);
        lblErrorNombre.setVisible(false);
    }

    // -------------------------------------------------------------------------
    // METODOS.
    // ------------------------------------------------------------------------- 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblErrorValor = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Gasto");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(262, 162));
        setMinimumSize(new java.awt.Dimension(262, 162));
        setPreferredSize(new java.awt.Dimension(262, 162));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(120, 23));
        txtNombre.setMinimumSize(new java.awt.Dimension(120, 23));
        txtNombre.setPreferredSize(new java.awt.Dimension(120, 23));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/accept.png"))); // NOI18N
        btnAceptar.setToolTipText("Crear");
        btnAceptar.setMaximumSize(new java.awt.Dimension(23, 23));
        btnAceptar.setMinimumSize(new java.awt.Dimension(23, 23));
        btnAceptar.setPreferredSize(new java.awt.Dimension(23, 23));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 23, 23));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(23, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(23, 23));
        btnCancelar.setPreferredSize(new java.awt.Dimension(23, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 23, 23));

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtValor.setMaximumSize(new java.awt.Dimension(120, 23));
        txtValor.setMinimumSize(new java.awt.Dimension(120, 23));
        txtValor.setPreferredSize(new java.awt.Dimension(120, 23));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Valor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblErrorValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        getContentPane().add(lblErrorValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 20, 20));

        lblErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        getContentPane().add(lblErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 20, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarFormulario() {
        if (txtNombre.getText().isEmpty()) {
            lblErrorNombre.setVisible(true);
            return false;
        } else {
            lblErrorNombre.setVisible(false);
        }

        if (txtValor.getText().isEmpty()) {
            lblErrorValor.setVisible(true);
            return false;
        } else {
            lblErrorValor.setVisible(false);
        }

        return true;
    }

    // -------------------------------------------------------------------------
    // EVENTOS.
    // ------------------------------------------------------------------------- 
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (validarFormulario()) {
            if (JOptionPane.showConfirmDialog(this, "¿Deseas crear el gasto?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                consulta = new Consulta();
                consulta.crearGasto(txtNombre.getText(), Double.parseDouble(txtValor.getText()));
                consulta.cerrar();
                this.dispose();

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorValor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
