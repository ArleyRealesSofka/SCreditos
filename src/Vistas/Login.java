package Vistas;

import Mundo.Consulta;
import Mundo.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author arley
 */
public class Login extends javax.swing.JFrame{
    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // -------------------------------------------------------------------------  
    private Usuario usuario;
    
    private Consulta consulta;
    
    //private DialogCambiarContraseñaUsuario dialogCambiarContraseñaUsuario;
    
    private InterfazPrincipal main;
    
    // -------------------------------------------------------------------------
    // CONSTRUCTOR.
    // -------------------------------------------------------------------------
    public Login() {
        initComponents();
    }

    
    // -------------------------------------------------------------------------
    // MÉTODOS.
    // -------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginCerrarVentana = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtLoginPassword = new javax.swing.JPasswordField();
        fondoBtnIniciarSesion = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JLabel();
        btnCambiarContraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCreditos");
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginCerrarVentana.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLoginCerrarVentana.setForeground(new java.awt.Color(3, 69, 102));
        btnLoginCerrarVentana.setText("X");
        btnLoginCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginCerrarVentanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginCerrarVentanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginCerrarVentanaMouseExited(evt);
            }
        });
        getContentPane().add(btnLoginCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 532));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 168, -1, -1));

        txtLoginUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLoginUsuario.setText("SANDRA");
        txtLoginUsuario.setBorder(null);
        txtLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuarioActionPerformed(evt);
            }
        });
        txtLoginUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 215, 292, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 253, 292, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 285, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 373, 292, -1));

        txtLoginPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLoginPassword.setText("0987654321");
        txtLoginPassword.setBorder(null);
        txtLoginPassword.setPreferredSize(new java.awt.Dimension(111, 32));
        txtLoginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtLoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 332, 292, 35));

        fondoBtnIniciarSesion.setBackground(new java.awt.Color(3, 69, 102));
        fondoBtnIniciarSesion.setForeground(new java.awt.Color(238, 238, 238));
        fondoBtnIniciarSesion.setName("btnLoginIniciar"); // NOI18N
        fondoBtnIniciarSesion.setLayout(new java.awt.BorderLayout());

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setText("Iniciar");
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        fondoBtnIniciarSesion.add(btnIniciarSesion, java.awt.BorderLayout.CENTER);

        jPanel1.add(fondoBtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 110, 40));

        btnCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnCambiarContraseña.setText("cambiar contraseña");
        btnCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarContraseñaMouseExited(evt);
            }
        });
        jPanel1.add(btnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 381, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 69, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCreditos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 67, 292, 69));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/enter.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aaaaa.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarFormulario(){
        return this.txtLoginUsuario.getText().isEmpty() | this.txtLoginPassword.getText().isEmpty();        
    }
    
    private void iniciarSesion(){   
        
        if(this.validarFormulario())
        {
            JOptionPane.showMessageDialog(this, "¡Debe ingresar un usuario y una contraseña.!");
        } else {
            
            this.consulta = new Consulta();
            
            if(this.consulta.validarUsuario(this.txtLoginUsuario.getText().toUpperCase()))
            {   
                this.usuario = this.consulta.getUsuario();
                if(this.usuario.getContraseña().equals(this.txtLoginPassword.getText().toString()))
                {
                    main = new InterfazPrincipal(this.usuario);
                    main.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                }                               
            } else
            {
                JOptionPane.showMessageDialog(this, "El usuario no existe.");
            }  
              
            this.consulta.cerrar();
        }
    }
    
    private void cerrarVentana(){        
        System.exit(0);
    }
    
    private void hoverEntradaBotonIniciarSesion(){
        this.fondoBtnIniciarSesion.setBackground(Utilidades.Colores_Utilidad.SECUNDARIO_LOGIN);
    }
    
    private void hoverSalidaBotonIniciarSesion(){
        this.fondoBtnIniciarSesion.setBackground(Utilidades.Colores_Utilidad.PRINCIPAL_LOGIN);
    }
    
    private void hoverEntradaBotonCerrarVentana(){
        this.btnLoginCerrarVentana.setForeground(Utilidades.Colores_Utilidad.TERCIARIO_LOGIN);
    }
    
    private void hoverSalidaBotonCerrarVentana(){
        this.btnLoginCerrarVentana.setForeground(Utilidades.Colores_Utilidad.PRINCIPAL_LOGIN);
    }
    
    
    // -------------------------------------------------------------------------
    // EVENTOS.
    // -------------------------------------------------------------------------
    /*
    * Eventos De Teclado.
    */
    private void txtLoginPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginPasswordKeyPressed
        if((char) evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.iniciarSesion();            
        }
    }//GEN-LAST:event_txtLoginPasswordKeyPressed

    private void txtLoginUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginUsuarioKeyPressed
        if((char) evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.txtLoginPassword.requestFocus(true);
        }
    }//GEN-LAST:event_txtLoginUsuarioKeyPressed

    
    /*
    * Eventos Boton Cambiar Contraseña
    */
    private void btnCambiarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseEntered
        this.btnCambiarContraseña.setForeground(Utilidades.Colores_Utilidad.TERCIARIO_LOGIN);
    }//GEN-LAST:event_btnCambiarContraseñaMouseEntered

    private void btnCambiarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseExited
        this.btnCambiarContraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnCambiarContraseñaMouseExited

    private void btnCambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaMouseClicked
        //this.dialogCambiarContraseñaUsuario = new DialogCambiarContraseñaUsuario(this, true);
        //this.dialogCambiarContraseñaUsuario.setVisible(true);
    }//GEN-LAST:event_btnCambiarContraseñaMouseClicked

    
    /*
    * Eventos Boton Iniciar Sesion
    */
    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        this.iniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        this.hoverEntradaBotonIniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        this.hoverSalidaBotonIniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    
    /*
    * Eventos Boton Cerrar Ventana
    */
    private void btnLoginCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginCerrarVentanaMouseClicked
        this.cerrarVentana();
    }//GEN-LAST:event_btnLoginCerrarVentanaMouseClicked

    private void btnLoginCerrarVentanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginCerrarVentanaMouseEntered
        this.hoverEntradaBotonCerrarVentana();
    }//GEN-LAST:event_btnLoginCerrarVentanaMouseEntered

    private void btnLoginCerrarVentanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginCerrarVentanaMouseExited
        this.hoverSalidaBotonCerrarVentana();
    }//GEN-LAST:event_btnLoginCerrarVentanaMouseExited

    private void txtLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuarioActionPerformed
    
    
    
    public static void main(String args[]) {       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCambiarContraseña;
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnLoginCerrarVentana;
    private javax.swing.JPanel fondoBtnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtLoginPassword;
    private javax.swing.JTextField txtLoginUsuario;
    // End of variables declaration//GEN-END:variables
}
