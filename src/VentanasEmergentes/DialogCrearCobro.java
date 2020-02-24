package VentanasEmergentes;

import java.awt.event.KeyEvent;

public class DialogCrearCobro extends javax.swing.JDialog {

    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // ------------------------------------------------------------------------- 
    private String nombre;

    // -------------------------------------------------------------------------
    // CONSTRUCTOR.
    // ------------------------------------------------------------------------- 
    public DialogCrearCobro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblError.setVisible(false);
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
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Cobro");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(320, 100));
        setMinimumSize(new java.awt.Dimension(320, 100));
        setPreferredSize(new java.awt.Dimension(320, 100));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(120, 23));
        txtNombre.setMinimumSize(new java.awt.Dimension(120, 23));
        txtNombre.setPreferredSize(new java.awt.Dimension(120, 23));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
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
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 23, 23));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 23, 23));

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Falta Dato");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 4, 120, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getNombre() {
        return nombre;
    }

    private void crearCobro() {
        if (txtNombre.getText().isEmpty() | txtNombre.getText().equals("")) {
            lblError.setVisible(true);
        } else {
            nombre = txtNombre.getText().toUpperCase();
            this.dispose();
        }
    }

    // -------------------------------------------------------------------------
    // EVENTOS.
    // ------------------------------------------------------------------------- 
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nombre = null;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        crearCobro();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

        if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            crearCobro();
        }

    }//GEN-LAST:event_formKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            crearCobro();
        }

    }//GEN-LAST:event_txtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
