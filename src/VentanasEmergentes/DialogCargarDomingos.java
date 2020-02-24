package VentanasEmergentes;

import Mundo.Consulta;
import javax.swing.JOptionPane;

public class DialogCargarDomingos extends javax.swing.JDialog {

    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // -------------------------------------------------------------------------
    private double valorAbono;

    private int domingos;

    private double valorPorDomingo;

    private boolean esPorAbono = false;

    private boolean esPorDomingos = false;

    private int idPrestamo;

    private Consulta consulta;

    // -------------------------------------------------------------------------
    // CONSTRUCTOR.
    // -------------------------------------------------------------------------
    public DialogCargarDomingos(java.awt.Frame parent, boolean modal, int pDomingos, double pValor, int pIdPrestamo) {
        super(parent, modal);
        initComponents();

        idPrestamo = pIdPrestamo;

        cboDomingos.removeAllItems();
        int contador = 0;
        while (contador < pDomingos + 1) {
            cboDomingos.addItem(contador);
            contador++;
        }
        valorPorDomingo = ((long) (pValor / 50000)) * 2000;
        lblError.setVisible(false);
        cargarInterfaz();
    }

    // -------------------------------------------------------------------------
    // METODOS.
    // -------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAbono = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblDomingos = new javax.swing.JLabel();
        cboDomingos = new javax.swing.JComboBox();
        chkAbono = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pago de domingos");
        setMaximumSize(new java.awt.Dimension(207, 183));
        setMinimumSize(new java.awt.Dimension(207, 183));
        setPreferredSize(new java.awt.Dimension(207, 183));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAbono.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAbono.setMaximumSize(new java.awt.Dimension(120, 23));
        txtAbono.setMinimumSize(new java.awt.Dimension(120, 23));
        txtAbono.setPreferredSize(new java.awt.Dimension(120, 23));
        getContentPane().add(txtAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, -1));

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblError.setToolTipText("Ingrese un valor.");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 20, 20));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 23, 23));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/accept.png"))); // NOI18N
        btnAceptar.setToolTipText("Cargar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(23, 23));
        btnAceptar.setMinimumSize(new java.awt.Dimension(23, 23));
        btnAceptar.setPreferredSize(new java.awt.Dimension(23, 23));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 23, 23));

        lblDomingos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblDomingos.setText("Domingos:");
        getContentPane().add(lblDomingos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        cboDomingos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        getContentPane().add(cboDomingos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, -1));

        chkAbono.setToolTipText("Abono otro valor: se usa cuando el cliende no paga domingo sino que abona.");
        chkAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAbonoActionPerformed(evt);
            }
        });
        getContentPane().add(chkAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarInterfaz() {
        if (chkAbono.isSelected()) {
            lblDomingos.setEnabled(false);
            cboDomingos.setEnabled(false);

            txtAbono.setEnabled(true);
        } else {
            lblDomingos.setEnabled(true);
            cboDomingos.setEnabled(true);

            txtAbono.setEnabled(false);
        }
    }

    private boolean validarFormulario() {
        if (chkAbono.isSelected() && txtAbono.getText().isEmpty()) {
            lblError.setVisible(true);
            return false;
        } else {
            lblError.setVisible(false);
        }

        return true;
    }

    public boolean isEsPorAbono() {
        return esPorAbono;
    }

    public boolean isEsPorDomingos() {
        return esPorDomingos;
    }

    // -------------------------------------------------------------------------
    // EVENTOS.
    // -------------------------------------------------------------------------
    private void chkAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAbonoActionPerformed
        if (chkAbono.isSelected()) {
            lblDomingos.setEnabled(false);
            cboDomingos.setEnabled(false);

            txtAbono.setEnabled(true);
        } else {
            lblDomingos.setEnabled(true);
            cboDomingos.setEnabled(true);

            txtAbono.setEnabled(false);
        }
    }//GEN-LAST:event_chkAbonoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        valorAbono = Double.parseDouble(txtAbono.getText());

        if (JOptionPane.showConfirmDialog(this, "No Deseas cargar pago de domingos o abono.", "CONFIRMACIÓN", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
            domingos = Integer.parseInt(String.valueOf((long) (valorAbono / valorPorDomingo)));
            consulta = new Consulta();
            consulta.pagarDomingos(this.idPrestamo, domingos, valorAbono, valorPorDomingo);
            consulta.cerrar();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (validarFormulario()) {
            if (chkAbono.isSelected()) {
                valorAbono = Double.parseDouble(txtAbono.getText());

                if (JOptionPane.showConfirmDialog(this, "Deseas cargar el pago.", "CONFIRMACIÓN", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    domingos = Integer.parseInt(String.valueOf((long) (valorAbono / valorPorDomingo)));
                    consulta = new Consulta();
                    consulta.pagarDomingos(this.idPrestamo, domingos, valorAbono, valorPorDomingo);
                    consulta.cerrar();
                    this.dispose();
                }
            } else {
                domingos = Integer.parseInt(cboDomingos.getSelectedItem().toString());

                if (JOptionPane.showConfirmDialog(this, "Deseas cargar el pago.", "CONFIRMACIÓN", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    double valorPagar = domingos * this.valorPorDomingo;
                    consulta = new Consulta();
                    consulta.pagarDomingos(this.idPrestamo, domingos, valorPagar, valorPorDomingo);
                    consulta.cerrar();
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if (!chkAbono.isSelected()) {
            int domingos = Integer.parseInt(cboDomingos.getSelectedItem().toString());
            txtAbono.setText(String.valueOf((long) (domingos * valorPorDomingo)));
        }
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cboDomingos;
    private javax.swing.JCheckBox chkAbono;
    private javax.swing.JLabel lblDomingos;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtAbono;
    // End of variables declaration//GEN-END:variables
}
