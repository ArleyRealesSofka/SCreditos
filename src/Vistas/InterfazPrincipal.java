package Vistas;

import Mundo.Abono;
import Mundo.Cliente;
import Mundo.Cobro;
import Mundo.Consulta;
import Mundo.CopiaSeguridad;
import Mundo.Prestamo;
import Mundo.Usuario;
import static Utilidades.CreacionCliente_Utilidad.CLIENTE_ANTERIOR;
import static Utilidades.CreacionCliente_Utilidad.CLIENTE_DESPUES;
import static Utilidades.CreacionCliente_Utilidad.CLIENTE_PRIMERO;
import VentanasEmergentes.DialogCargarDomingos;
import VentanasEmergentes.DialogCrearCobro;
import VentanasEmergentes.DialogCrearGasto;
import VentanasEmergentes.DialogListaGastos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazPrincipal extends javax.swing.JFrame {

    // -------------------------------------------------------------------------
    // CONSTANTES.
    // -------------------------------------------------------------------------
    public final static String CREAR_COBRO = "Crear_Cobro";

    public final static String CERRAR_PROGRAMA = "Salir_Del_Programa";

    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // -------------------------------------------------------------------------
    private Login login;

    private Usuario usuario;

    private Cliente clienteActual, clienteNuevo, clienteBuscado;

    private ArrayList<Cliente> listaClientes, listaClientesNoCuota;

    private Consulta consulta;

    private Prestamo prestamoActual, prestamoNuevoCliente;

    private CopiaSeguridad copiaSeguridad;

    private DialogCrearCobro dialogCrearCobro;

    private DialogCrearGasto dialogCrearGasto;

    private DialogListaGastos dialogListaGastos;

    private ArrayList<Cobro> listaCobros;

    private ArrayList<Abono> listaAbonos;

    private ArrayList<Prestamo> listaPrestamosActivos;

    private Object[][] clientes_PrestamosCancelados = null;

    private DefaultTableModel dtmTablaDescripcionPrestamo, dtmTablaPrestamosCancelados, dtmTablaClientesNoCuota;

    // -------------------------------------------------------------------------
    // CONSTRUCTOR.
    // -------------------------------------------------------------------------
    public InterfazPrincipal(Usuario pUsuario) {
        usuario = pUsuario;

        initComponents();
        this.setTitle(usuario.getNombres() + " " + usuario.getPriApellido());
        //cerrarAplicacion(); 
        cargarInterfaz();
        agregarOyente();
        cargarCobros();
        cargarListaClientes();
        cargarClienteInicial();
    }

    // -------------------------------------------------------------------------
    // MÉTODOS.
    // -------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboCobros = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCuota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrestamo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSaldoCapital = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSaldoInteres = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCuotaCapital = new javax.swing.JTextField();
        txtCuotaInteres = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        panelDescripcion = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaDescripcionPrestamo = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        rbAntes = new javax.swing.JRadioButton();
        rbDespues = new javax.swing.JRadioButton();
        chkFechaSistema = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientesNoCuota = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPrestamosCancelados = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lblCantidadClientesNoPaganCuota = new javax.swing.JLabel();
        lblCantidadPrestamosCancelados = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        panelFunciones = new javax.swing.JPanel();
        btnAbono = new javax.swing.JButton();
        btnClientePrimero = new javax.swing.JButton();
        btnClienteAnterior = new javax.swing.JButton();
        btnClienteSiguiente = new javax.swing.JButton();
        btnClienteUltimo = new javax.swing.JButton();
        btnCancelarPrestamo = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnSalirPrograma = new javax.swing.JButton();
        btnNuevoPrestamo = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lblTarjetas = new javax.swing.JLabel();
        lblCantidadAbonos = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        panelCalificacionCliente = new javax.swing.JPanel();
        lblCalificacionCliente = new javax.swing.JLabel();
        lblErrorFecha = new javax.swing.JLabel();
        lblErrorCobro = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorDireccion = new javax.swing.JLabel();
        lblErrorPrestamo = new javax.swing.JLabel();
        lblErrorCedula = new javax.swing.JLabel();
        pkcFecha = new com.toedter.calendar.JDateChooser();
        lblErrorTelefono = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenu();
        barraMenuNuevoCobro = new javax.swing.JMenuItem();
        barraMenuNuevoGasto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Ver = new javax.swing.JMenu();
        barraMenuVerGastos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCreditos");
        setMinimumSize(new java.awt.Dimension(1150, 700));
        setResizable(false);

        panelEscritorio.setBackground(new java.awt.Color(238, 238, 238));
        panelEscritorio.setMaximumSize(new java.awt.Dimension(1150, 700));
        panelEscritorio.setMinimumSize(new java.awt.Dimension(1150, 700));
        panelEscritorio.setPreferredSize(new java.awt.Dimension(1150, 700));
        panelEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nombre Del Cobro");
        panelEscritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        cboCobros.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cboCobros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCobrosItemStateChanged(evt);
            }
        });
        panelEscritorio.add(cboCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 166, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Cedula");
        panelEscritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Valor");
        panelEscritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });
        panelEscritorio.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 80, 120, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEscritorio.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Descripción");
        panelEscritorio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        panelEscritorio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 80, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Dirección");
        panelEscritorio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        panelEscritorio.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Cuota");
        panelEscritorio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 122, -1, -1));

        txtCuota.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCuota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEscritorio.add(txtCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 120, 107, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Fecha");
        panelEscritorio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Prestamo");
        panelEscritorio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        txtPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrestamoKeyReleased(evt);
            }
        });
        panelEscritorio.add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, -1));

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 23));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setText("CAPITAL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 23));

        txtSaldoCapital.setEditable(false);
        txtSaldoCapital.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSaldoCapital.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtSaldoCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, 23));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel13.setText("INTERES");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 23));

        txtSaldoInteres.setEditable(false);
        txtSaldoInteres.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSaldoInteres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtSaldoInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, 23));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel14.setText("Boleta");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 23));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SALDO");
        jPanel2.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, 20));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel15.setBackground(new java.awt.Color(153, 153, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CUOTA");
        jPanel3.add(jLabel15, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 70, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel17.setText("INTERES");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 23));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel18.setText("CAPITAL");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 23));

        txtCuotaCapital.setEditable(false);
        txtCuotaCapital.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCuotaCapital.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCuotaCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 23));

        txtCuotaInteres.setEditable(false);
        txtCuotaInteres.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCuotaInteres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCuotaInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 80, 23));

        panelEscritorio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 300, 170));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Tel-Cel");
        panelEscritorio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEscritorio.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, -1));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel16.setBackground(new java.awt.Color(153, 153, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CAP_TOTAL = 10.258.123     INT_TOTAL = 2.158.321");
        jPanel4.add(jLabel16, java.awt.BorderLayout.CENTER);

        panelEscritorio.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 20));

        panelDescripcion.setBackground(new java.awt.Color(238, 238, 238));
        panelDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDescripcion.setLayout(new java.awt.BorderLayout());

        tablaDescripcionPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaDescripcionPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA -> ABONO", "ABONO", "RESTA", "TIPO"
            }
        ));
        jScrollPane5.setViewportView(tablaDescripcionPrestamo);

        panelDescripcion.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        panelEscritorio.add(panelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 420, 310));

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nuevo Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        rbAntes.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        rbAntes.setSelected(true);
        rbAntes.setText("Antes");
        rbAntes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbAntesMouseExited(evt);
            }
        });

        rbDespues.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        rbDespues.setText("Despues");
        rbDespues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbDespuesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDespues)
                    .addComponent(rbAntes))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAntes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDespues)
                .addGap(22, 22, 22))
        );

        panelEscritorio.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 90));

        chkFechaSistema.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        chkFechaSistema.setSelected(true);
        chkFechaSistema.setText("Colocar Fecha Del Sistema");
        chkFechaSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkFechaSistemaMouseClicked(evt);
            }
        });
        panelEscritorio.add(chkFechaSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        jPanel7.setBackground(new java.awt.Color(238, 238, 238));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 23));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 255));
        jLabel19.setText("EFECTIVO");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 23));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 255));
        jLabel20.setText("Otr Gas");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 40, 23));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 255));
        jLabel21.setText("PRESTAMOS");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 23));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 255));
        jLabel22.setText("GASTOS");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 23));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 255));
        jLabel23.setText("BASE");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 23));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 255));
        jLabel24.setText("DESCUENTO");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 23));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 23));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 50, 23));

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 23));

        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 50, 23));

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 23));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 255));
        jLabel25.setText("COBRO");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 23));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 255));
        jLabel26.setText("Utilidad ");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 23));

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 23));

        jTextField22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 23));

        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 23));

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 50, 23));

        panelEscritorio.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 250, 200));

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel27.setBackground(new java.awt.Color(153, 153, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Intereses");
        jPanel8.add(jLabel27, java.awt.BorderLayout.CENTER);

        panelEscritorio.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 50, 20));

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel28.setBackground(new java.awt.Color(153, 153, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Capital");
        jPanel9.add(jLabel28, java.awt.BorderLayout.CENTER);

        panelEscritorio.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 50, 20));

        jPanel10.setBackground(new java.awt.Color(238, 238, 238));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaClientesNoCuota.setBackground(new java.awt.Color(255, 153, 153));
        tablaClientesNoCuota.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaClientesNoCuota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO DIERON CUOTA"
            }
        ));
        jScrollPane1.setViewportView(tablaClientesNoCuota);

        jTable2.setBackground(new java.awt.Color(255, 204, 204));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRESTAMOS INGRESADOS"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        tablaPrestamosCancelados.setBackground(new java.awt.Color(153, 255, 204));
        tablaPrestamosCancelados.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaPrestamosCancelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRESTAMOS CANCELADOS"
            }
        ));
        jScrollPane3.setViewportView(tablaPrestamosCancelados);

        jTable4.setBackground(new java.awt.Color(102, 153, 255));
        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRESTAMOS NUEVOS"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        lblCantidadClientesNoPaganCuota.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidadClientesNoPaganCuota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadClientesNoPaganCuota.setText("0");

        lblCantidadPrestamosCancelados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidadPrestamosCancelados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadPrestamosCancelados.setText("0");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("0");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidadClientesNoPaganCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidadPrestamosCancelados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadClientesNoPaganCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadPrestamosCancelados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEscritorio.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 300, 440));

        panelFunciones.setBackground(new java.awt.Color(238, 238, 238));
        panelFunciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAbono.setText("Abono");
        btnAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoActionPerformed(evt);
            }
        });

        btnClientePrimero.setText("Primero");
        btnClientePrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientePrimeroActionPerformed(evt);
            }
        });

        btnClienteAnterior.setText("Anterior");
        btnClienteAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAnteriorActionPerformed(evt);
            }
        });

        btnClienteSiguiente.setText("Siguiente");
        btnClienteSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteSiguienteActionPerformed(evt);
            }
        });

        btnClienteUltimo.setText("Ultimo");
        btnClienteUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteUltimoActionPerformed(evt);
            }
        });

        btnCancelarPrestamo.setText("Cancelar");
        btnCancelarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPrestamoActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnSalirPrograma.setText("Salir");
        btnSalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProgramaActionPerformed(evt);
            }
        });

        btnNuevoPrestamo.setText("Nuevo Prestamo");
        btnNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFuncionesLayout = new javax.swing.GroupLayout(panelFunciones);
        panelFunciones.setLayout(panelFuncionesLayout);
        panelFuncionesLayout.setHorizontalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnClientePrimero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirPrograma)
                .addContainerGap())
        );
        panelFuncionesLayout.setVerticalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientePrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelEscritorio.add(panelFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 460, 110));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel33.setText("Plazo Días");
        panelEscritorio.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        txtPlazo.setEditable(false);
        txtPlazo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelEscritorio.add(txtPlazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 30, -1));

        jPanel12.setBackground(new java.awt.Color(238, 238, 238));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTarjetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTarjetas.setText("0/0");
        jPanel12.add(lblTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        lblCantidadAbonos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidadAbonos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadAbonos.setText("0");
        jPanel12.add(lblCantidadAbonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel35.setText("Tarjetas");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel36.setText("Abonos");
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        panelCalificacionCliente.setBackground(new java.awt.Color(238, 238, 238));
        panelCalificacionCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCalificacionCliente.setLayout(new java.awt.BorderLayout());

        lblCalificacionCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCalificacionCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCalificacionCliente.add(lblCalificacionCliente, java.awt.BorderLayout.CENTER);

        jPanel12.add(panelCalificacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        panelEscritorio.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 250, 230));

        lblErrorFecha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorFecha.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorFecha.setToolTipText("Ingrese un número telefonico.");
        lblErrorFecha.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorFecha.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorFecha.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 20, 20));

        lblErrorCobro.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorCobro.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorCobro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorCobro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorCobro.setToolTipText("Debes selecionar o crear un cobro.");
        lblErrorCobro.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorCobro.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorCobro.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 20, 20));

        lblErrorNombre.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorNombre.setToolTipText("Ingrese el nombre.");
        lblErrorNombre.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorNombre.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorNombre.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 20, 20));

        lblErrorDireccion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorDireccion.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorDireccion.setToolTipText("Ingrese una direccion.");
        lblErrorDireccion.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorDireccion.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorDireccion.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 20, 20));

        lblErrorPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorPrestamo.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorPrestamo.setToolTipText("Ingrese el valor del prestamo.");
        lblErrorPrestamo.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorPrestamo.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorPrestamo.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 20, 20));

        lblErrorCedula.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorCedula.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorCedula.setToolTipText("Ingrese la cedula.");
        lblErrorCedula.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorCedula.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorCedula.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, 20));

        pkcFecha.setBackground(new java.awt.Color(238, 238, 238));
        pkcFecha.setDateFormatString("yyyy-MM-dd");
        pkcFecha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pkcFecha.setMinSelectableDate(new java.util.Date(-62135747924000L));
        panelEscritorio.add(pkcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 120, -1));

        lblErrorTelefono.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorTelefono.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/error.png"))); // NOI18N
        lblErrorTelefono.setToolTipText("Ingrese un número telefonico.");
        lblErrorTelefono.setMaximumSize(new java.awt.Dimension(20, 20));
        lblErrorTelefono.setMinimumSize(new java.awt.Dimension(20, 20));
        lblErrorTelefono.setPreferredSize(new java.awt.Dimension(20, 20));
        panelEscritorio.add(lblErrorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 20, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Nombre Del Cliente");
        panelEscritorio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 82, -1, -1));

        getContentPane().add(panelEscritorio, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        Nuevo.setText("Nuevo");

        barraMenuNuevoCobro.setText("Cobro");
        barraMenuNuevoCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraMenuNuevoCobroActionPerformed(evt);
            }
        });
        Nuevo.add(barraMenuNuevoCobro);

        barraMenuNuevoGasto.setText("Gasto");
        barraMenuNuevoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraMenuNuevoGastoActionPerformed(evt);
            }
        });
        Nuevo.add(barraMenuNuevoGasto);

        jMenu1.add(Nuevo);
        jMenu1.add(jSeparator1);

        Ver.setText("Ver");

        barraMenuVerGastos.setText("Gastos");
        barraMenuVerGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraMenuVerGastosActionPerformed(evt);
            }
        });
        Ver.add(barraMenuVerGastos);

        jMenu1.add(Ver);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        barraMenu.add(jMenu1);

        setJMenuBar(barraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Agrega caracteristicas para que cuando se cierre la app se cree una copia de seguridad.
    private void cerrarAplicacion() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    if (JOptionPane.showConfirmDialog(null, "¿Realmente deseas salir?", "SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

//                        Calendar c = Calendar.getInstance();
//                        String fecha = "_Hora_"+c.get(Calendar.HOUR)+"_"+c.get(Calendar.MINUTE)+"_"+c.get(Calendar.SECOND)+"_Dia_"+c.get(Calendar.DATE)+"_"+(c.get(Calendar.MONTH)+1)+"_"+c.get(Calendar.YEAR);
//                        copiaSeguridad = new CopiaSeguridad(fecha);
//                        
                        System.exit(0);
                    }
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Carga otros ajustes de la interfaz.
    private void cargarInterfaz() {
        lblErrorCobro.setVisible(false);
        lblErrorPrestamo.setVisible(false);
        lblErrorNombre.setVisible(false);
        lblErrorDireccion.setVisible(false);
        lblErrorFecha.setVisible(false);
        lblErrorCedula.setVisible(false);
        lblErrorTelefono.setVisible(false);
        pkcFecha.setCalendar(Calendar.getInstance());
        pkcFecha.setEnabled(false);
        cboCobros.setSelectedItem(0);
    }

    // Crea un nuevo cobro en la base de datos.
    private void crearNuevoCobro(String pNombreCobro) {
        consulta = new Consulta();
        consulta.crearCobro(pNombreCobro);
        consulta.cerrar();
        cargarCobros();
    }

    // Carga la lista de cobros de la base de datos.
    private void cargarCobros() {
        consulta = new Consulta();
        listaCobros = consulta.listarCobros();
        consulta.cerrar();
        cboCobros.removeAllItems();
        for (Cobro cobro : listaCobros) {
            cboCobros.addItem(cobro.getNombre());
        }
    }

    // Carga la lista de clientes de del cobro seleccionado.
    private void cargarListaClientes() {
        consulta = new Consulta();
        listaClientes = consulta.listarClientes((String) cboCobros.getSelectedItem());
        consulta.cerrar();
    }

    // Carga el primer cliente por defecto.
    private void cargarClienteInicial() {
        if (listaClientes.size() <= 0) {
            clienteActual = null;
        } else {
            clienteActual = listaClientes.get(0);
            consulta = new Consulta();
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());
            consulta.cerrar();

            txtCedula.setText(clienteActual.getCedula());
            txtNombre.setText(clienteActual.getNombre());
            txtDireccion.setText(clienteActual.getDireccion());
            txtTelefono.setText(clienteActual.getTelefono());

            txtPrestamo.setText(String.valueOf((long) prestamoActual.getPrestamo() / 1000));
            txtPlazo.setText(String.valueOf(prestamoActual.getPlazo()));
            txtValor.setText(String.valueOf((long) prestamoActual.getValor()));

            txtCuota.setText(String.valueOf((long) prestamoActual.getCuota()));
            txtValor.setText(String.valueOf((long) prestamoActual.getValor()));
            txtPlazo.setText(String.valueOf(prestamoActual.getPlazo()));

            txtSaldoCapital.setText(String.valueOf((long) prestamoActual.getPrestamo()));
            txtSaldoInteres.setText(String.valueOf((long) (prestamoActual.getValor() - prestamoActual.getPrestamo())));

            txtCuotaCapital.setText(String.valueOf((long) prestamoActual.getCuotaCapital()));
            txtCuotaInteres.setText(String.valueOf((long) prestamoActual.getCuotaInteres()));
            cargarTablaDetalles();
        }
    }

    // Te lleva a el primer cliente de la ruta.
    private void irPrimerCliente() {
        consulta = new Consulta();
        listaClientes = consulta.listarClientes((String) cboCobros.getSelectedItem());
        if (listaClientes.size() > 0) {
            clienteActual = listaClientes.get(0);
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());

            cargarInformacionActual();
        }
        consulta.cerrar();
    }

    // Te lleva a el ultimo cliente de la ruta.
    private void irUltimoCliente() {
        consulta = new Consulta();
        listaClientes = consulta.listarClientes((String) cboCobros.getSelectedItem());
        if (listaClientes.size() > 0) {
            clienteActual = listaClientes.get(listaClientes.size() - 1);
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());

            cargarInformacionActual();
        }
        consulta.cerrar();
    }

    // Te lleva a el anterior cliente de la ruta.
    private void irAnteriorCliente() {
        consulta = new Consulta();
        listaClientes = consulta.listarClientes((String) cboCobros.getSelectedItem());
        if (listaClientes.size() > 0) {
            if (clienteActual.getRuta() == 1) {
                clienteActual = listaClientes.get(listaClientes.size() - 1);
            } else {
                for (Cliente cliente : listaClientes) {
                    if (clienteActual.getRuta() - 1 == cliente.getRuta()) {
                        clienteActual = cliente;
                        break;
                    }
                }
            }
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());

            cargarInformacionActual();

        }
        consulta.cerrar();
    }

    // Te lleva a el siguiente cliente de la ruta.
    private void irSiguienteCliente() {
        consulta = new Consulta();
        listaClientes = consulta.listarClientes((String) cboCobros.getSelectedItem());
        if (listaClientes.size() > 0) {
            if (clienteActual.getRuta() == listaClientes.get(listaClientes.size() - 1).getRuta()) {
                clienteActual = listaClientes.get(0);
            } else {
                for (Cliente cliente : listaClientes) {
                    if (clienteActual.getRuta() + 1 == cliente.getRuta()) {
                        clienteActual = cliente;
                        break;
                    }
                }
            }
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());

            cargarInformacionActual();
        }
        consulta.cerrar();
    }

    // Crea un nuevo cliente en la base de datos. CORREGIDO
    private void crearNuevoCliente() {
        // Validamos que el formulario este completo.
        if (validarFormularioCrearCliente()) {
            // Abrimos conexion en la base de datos.
            consulta = new Consulta();
            // Validamos si el cliente que se desea crear ya existe en la base de datos.
            if (consulta.existeCliente(txtCedula.getText().toUpperCase())) {
                JOptionPane.showMessageDialog(null, "El cliente ya existe.", "No se pudo crear.", JOptionPane.ERROR_MESSAGE, null);
                // Cerramos conexion en la base de datos.
                consulta.cerrar();
            } else {
                // Creamos un objeto cliente nuevo.
                clienteNuevo = new Cliente(txtCedula.getText().toUpperCase(), txtNombre.getText().toUpperCase(), txtDireccion.getText().toUpperCase(), (String) cboCobros.getSelectedItem(), txtTelefono.getText().toUpperCase());
                // cargamos la lista de los clientes del mismo cobro para saber si es el primero o va antes o despues de alguien.
                cargarListaClientes();
                // Abrimos conexion en la base de datos.
                consulta = new Consulta();
                // Creamos una instancia de objeto prestamo para el nuevo cliente.
                prestamoNuevoCliente = new Prestamo(clienteNuevo.getCedula(), Double.parseDouble(txtPrestamo.getText()));
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = formato.format(pkcFecha.getDate());
                prestamoNuevoCliente.setFecha(fecha);
                // Verificamos si el cliente que se va a crear es el primero en el cobro.
                if (listaClientes.size() <= 0) {
                    // creamos el nuevo cliente en la base de datos como primero en la ruta cuando no existe ninguno en el cobro y creamos una instancia del cliente actual.
                    clienteActual = consulta.crearCliente(clienteNuevo, CLIENTE_PRIMERO, clienteActual, prestamoNuevoCliente);
                } else {
                    if (rbAntes.isSelected()) {
                        // creamos el nuevo cliente en la base de datos segun la ruta antes del cliente actual y creamos una instancia del cliente actual.
                        clienteActual = consulta.crearCliente(clienteNuevo, CLIENTE_ANTERIOR, clienteActual, prestamoNuevoCliente);
                    } else if (rbDespues.isSelected()) {
                        // creamos el nuevo cliente en la base de datos segun la ruta despues del cliente actual y creamos una instancia del cliente actual.
                        clienteActual = consulta.crearCliente(clienteNuevo, CLIENTE_DESPUES, clienteActual, prestamoNuevoCliente);
                    }
                }
                // creamos una instancia del prestamo del cliente actual.
                prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());
                consulta.cerrar();
                cargarListaClientes();
                //cargarClienteActual();
                cargarInformacionActual();
                JOptionPane.showMessageDialog(null, "Se ha creado el cliente.", "Exitoso.", JOptionPane.INFORMATION_MESSAGE, null);
                // Cargar domingos
                cargarPagoDomingos();
                cargarInformacionActual();
            }
        }
    }

    // Se ejecuta despues de crear un cliente nuevo.
    private void cargarPagoDomingos() {
        consulta = new Consulta();
        int domingos = consulta.getDomingosPrestamo(clienteActual.getCedula());
        consulta.cerrar();

        DialogCargarDomingos emergenteCargarDomingos = new DialogCargarDomingos(this, true, domingos, prestamoActual.getValor(), prestamoActual.getId());
        emergenteCargarDomingos.setVisible(true);
    }

    // Carga el cliente nuevo como cliente actual en la interfaz.
    private void cargarClienteActual() {
        consulta = new Consulta();
        prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());
        consulta.cerrar();

        cargarInformacionActual();
    }

    // Valida formulario para la creacion de un cliente.
    private boolean validarFormularioCrearCliente() {
        String combo = null;
        combo = (String) cboCobros.getSelectedItem();
        if (combo == null) {
            lblErrorCobro.setVisible(true);
            return false;
        } else {
            lblErrorCobro.setVisible(false);
        }

        if (txtCedula.getText().isEmpty()) {
            lblErrorCedula.setVisible(true);
            return false;
        } else {
            lblErrorCedula.setVisible(false);
        }

        if (txtNombre.getText().isEmpty()) {
            lblErrorNombre.setVisible(true);
            return false;
        } else {
            lblErrorNombre.setVisible(false);
        }

        if (txtDireccion.getText().isEmpty()) {
            lblErrorDireccion.setVisible(true);
            return false;
        } else {
            lblErrorDireccion.setVisible(false);
        }

        if (pkcFecha.getDate() == null) {
            lblErrorFecha.setVisible(true);
            return false;
        } else {
            lblErrorFecha.setVisible(false);
        }

        if (txtPrestamo.getText().isEmpty()) {
            lblErrorPrestamo.setVisible(true);
            return false;
        } else {
            lblErrorPrestamo.setVisible(false);
        }

        if (txtTelefono.getText().isEmpty()) {
            lblErrorTelefono.setVisible(true);
            return false;
        } else {
            lblErrorTelefono.setVisible(false);
        }

        return true;
    }

    // Busca el cliente en la base de datos por cedula se ejecuta cuando se teclea enter en el campo cedula.
    private void buscarClientePorCedula() {
        txtNombre.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);

        txtCuota.setText(null);
        txtPrestamo.setText(null);
        txtPlazo.setText(null);
        txtValor.setText(null);

        txtSaldoCapital.setText(null);
        txtSaldoInteres.setText(null);

        txtCuotaCapital.setText(null);
        txtCuotaInteres.setText(null);

        if (cboCobros.getSelectedItem() != null) {
            String cedula = txtCedula.getText();
            consulta = new Consulta();
            clienteBuscado = consulta.buscarClientePorCedula(cedula, cboCobros.getSelectedItem().toString());
            consulta.cerrar();
        } else {
            JOptionPane.showMessageDialog(this, "Debes crear primero un cobro");
            txtCedula.setText(null);
            dialogCrearCobro = new DialogCrearCobro(this, true);
            dialogCrearCobro.setVisible(true);
            if (dialogCrearCobro.getNombre() != null) {
                crearNuevoCobro(dialogCrearCobro.getNombre());
            }
        }

        if (clienteBuscado != null) {

            clienteActual = clienteBuscado;

            consulta = new Consulta();
            prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());
            consulta.cerrar();
            cargarInformacionActual();
        }
    }

    // Carga la informacion en la interfaz.
    private void cargarInformacionActual() {
        txtCedula.setText(clienteActual.getCedula());
        txtNombre.setText(clienteActual.getNombre());
        txtDireccion.setText(clienteActual.getDireccion());
        txtTelefono.setText(clienteActual.getTelefono());

        txtPrestamo.setText(String.valueOf((long) prestamoActual.getPrestamo() / 1000));
        txtPlazo.setText(String.valueOf(prestamoActual.getPlazo()));
        txtValor.setText(String.valueOf((long) prestamoActual.getValor()));

        txtCuota.setText(String.valueOf((long) prestamoActual.getCuota()));
        txtValor.setText(String.valueOf((long) prestamoActual.getValor()));
        txtPlazo.setText(String.valueOf(prestamoActual.getPlazo()));

        txtSaldoCapital.setText(String.valueOf((long) prestamoActual.getPrestamo()));
        txtSaldoInteres.setText(String.valueOf((long) (prestamoActual.getValor() - prestamoActual.getPrestamo())));

        txtCuotaCapital.setText(String.valueOf((long) prestamoActual.getCuotaCapital()));
        txtCuotaInteres.setText(String.valueOf((long) prestamoActual.getCuotaInteres()));

        if (clienteActual.getCalificacion().equals("BUENO")) {
            panelCalificacionCliente.setBackground(Color.GREEN);
            lblCalificacionCliente.setText(clienteActual.getCalificacion());
        } else if (clienteActual.getCalificacion().equals("REGULAR")) {
            panelCalificacionCliente.setBackground(Color.YELLOW);
            lblCalificacionCliente.setText(clienteActual.getCalificacion());
        } else if (clienteActual.getCalificacion().equals("MALO")) {
            panelCalificacionCliente.setBackground(Color.ORANGE);
            lblCalificacionCliente.setText(clienteActual.getCalificacion());
        } else if (clienteActual.getCalificacion().equals("CLAVO")) {
            panelCalificacionCliente.setBackground(Color.RED);
            lblCalificacionCliente.setText(clienteActual.getCalificacion());
        }

        consulta = new Consulta();
        lblCantidadAbonos.setText(String.valueOf(consulta.obtenerNumeroAbonos(prestamoActual.getId())));
        listaPrestamosActivos = new ArrayList<>();

        consulta.cerrar();

        cargarTablaDetalles();
    }

    // Limpia la informacion del formulario.
    private void limpiarInformacionActual() {
        txtCedula.setText(null);
        txtNombre.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);

        txtCuota.setText(null);
        txtPrestamo.setText(null);
        txtPlazo.setText(null);
        txtValor.setText(null);

        txtSaldoCapital.setText(null);
        txtSaldoInteres.setText(null);

        txtCuotaCapital.setText(null);
        txtCuotaInteres.setText(null);

    }

    // Calcula todo lo relacionado con el prestamo para clientes nuevos.
    private void calcularPrestamo(Double pPrestamo) {
        if (pPrestamo > 0) {
            Prestamo prestamo = new Prestamo("", pPrestamo);
            txtCuota.setText(String.valueOf((long) prestamo.getCuota()));
            txtValor.setText(String.valueOf((long) prestamo.getValor()));
            txtPlazo.setText(String.valueOf(prestamo.getPlazo()));

            txtSaldoCapital.setText(String.valueOf((long) prestamo.getPrestamo()));
            txtSaldoInteres.setText(String.valueOf((long) (prestamo.getValor() - prestamo.getPrestamo())));

            txtCuotaCapital.setText(String.valueOf((long) prestamo.getCuotaCapital()));
            txtCuotaInteres.setText(String.valueOf((long) prestamo.getCuotaInteres()));
        }
    }

    // Carga los abonos en la base de datos.
    private void cargarAbono() {
        if (validarFormularioCrearCliente()) {
            if (Double.parseDouble(txtCuota.getText()) <= prestamoActual.getValorDebe()) {
                if (JOptionPane.showConfirmDialog(this, "¿Realmente deseas cargar el abono?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fecha = formato.format(pkcFecha.getDate());

                    consulta = new Consulta();
                    consulta.pagarAbono(prestamoActual.getId(), fecha, Double.parseDouble(txtCuota.getText()));
                    consulta.calificarCliente(clienteActual.getCedula());
                    consulta.cerrar();
                    //cargar informacion en la tabla.
                    buscarClientePorCedula();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El valor a abonar es superior\n a lo que debe el cliente.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // Cargar abonos a tabla detalles.
    private void cargarTablaDetalles() {
        //tablaDescripcionPrestamo.removeAll();        
        this.dtmTablaDescripcionPrestamo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rows, int colunms) {
                return false;
            }
        };
        String[] tablaAbonosTitulos = new String[]{"FECHA -> ABONO", "ABONO", "RESTA", "TIPO",};
        this.dtmTablaDescripcionPrestamo.setColumnIdentifiers(tablaAbonosTitulos);
        this.tablaDescripcionPrestamo.setModel(dtmTablaDescripcionPrestamo);

        consulta = new Consulta();
        listaAbonos = consulta.listarAbonos(prestamoActual.getId());
        consulta.cerrar();

        for (Abono abono : listaAbonos) {
            this.dtmTablaDescripcionPrestamo.addRow(new Object[]{
                abono.getFecha(), (long) abono.getValor(), (long) abono.getRestante(), abono.getTipo()
            });
        }

    }

    // Cargar prestamos cancelados.
    private void cargarPrestamosCancelados() {
        if (pkcFecha.getDate() != null && !cboCobros.getSelectedItem().toString().isEmpty()) {
            // Cargamos el modelo de la tabla prestamos cancelados.
            this.dtmTablaPrestamosCancelados = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int rows, int colunms) {
                    return false;
                }
            };
            // Creamos los titulos que llevara la tabla.
            String[] titulos = new String[]{"PRESTAMOS CANCELADOS",};
            // Cargamos los titulos de la tabla.
            this.dtmTablaPrestamosCancelados.setColumnIdentifiers(titulos);
            // Cargamos el modelo a la tabla.
            this.tablaPrestamosCancelados.setModel(dtmTablaPrestamosCancelados);
            // Formato para la fecha.
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            // Guardamos la fecha.
            String fecha = formato.format(pkcFecha.getDate());
            // Guardamos el cobro.
            String cobro = cboCobros.getSelectedItem().toString();
            // Consultamos los prestamos.
            consulta = new Consulta();
            clientes_PrestamosCancelados = consulta.obtenerPrestamosCancelados(fecha, cobro);
            /*
             * Cargamos los prestamos cancelados en la tabla de prestamos cancelados
             * solo si la existen prestamos cancelados en la fecha.
             */
            if (clientes_PrestamosCancelados != null) {
                //recorremos la matriz para sacar la informacion y cargarla en la tabla.
                for (int i = 0; i < consulta.obtenerNumeroPrestamosCancelados(); i++) {
                    Cliente cliente = (Cliente) clientes_PrestamosCancelados[i][0];
                    Prestamo prestamo = (Prestamo) clientes_PrestamosCancelados[i][1];
                    // Cargamos las filas en la tabla prestamos cancelados.
                    this.dtmTablaPrestamosCancelados.addRow(new Object[]{
                        cliente.getCedula() + " " + cliente.getNombre() + " " + (long) (prestamo.getValor() / 1000)
                    });
                }
            }
            // Agregamos cuantas filas o prestamos fueron cancelados.
            lblCantidadPrestamosCancelados.setText(String.valueOf(tablaPrestamosCancelados.getRowCount()));
            // Cerramos la conexion a la base de datos.
            consulta.cerrar();

        }
    }

    // Cargar clientes que no dieron cuota.
    private void cargarClientesNoCuota() {
        if (pkcFecha.getDate() != null && !cboCobros.getSelectedItem().toString().isEmpty()) {
            // Cargamos el modelo de la tabla prestamos cancelados.
            this.dtmTablaClientesNoCuota = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int rows, int colunms) {
                    return false;
                }
            };
            // Creamos los titulos que llevara la tabla.
            String[] titulos = new String[]{"NO DIERON CUOTA",};
            // Cargamos los titulos de la tabla.
            this.dtmTablaClientesNoCuota.setColumnIdentifiers(titulos);
            // Cargamos el modelo a la tabla.
            this.tablaClientesNoCuota.setModel(dtmTablaClientesNoCuota);
            // Formato para la fecha.
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            // Guardamos la fecha.
            String fecha = formato.format(pkcFecha.getDate());
            // Guardamos el cobro.
            String cobro = cboCobros.getSelectedItem().toString();
            // Consultamos los clientes.
            consulta = new Consulta();
            listaClientesNoCuota = consulta.obtenerClientesNoCuota(cobro, fecha);

            /*
             * Cargamos los clientes que no pagaron cuota en la tabla no pagaron cuota.
             * solo si existen clientes que no pagaron cuota en la fecha.
             */
            if (listaClientesNoCuota.size() > 0) {
                for (Cliente cliente : listaClientesNoCuota) {
                    // Cargamos las filas en la tabla prestamos cancelados.
                    this.dtmTablaClientesNoCuota.addRow(new Object[]{
                        cliente.getCedula() + " " + cliente.getNombre()
                    });
                }
            }
            // Agregamos cuantas filas o prestamos fueron cancelados.
            lblCantidadClientesNoPaganCuota.setText(String.valueOf(tablaClientesNoCuota.getRowCount()));
            // Cerramos la conexion a la base de datos.
            consulta.cerrar();

        }
    }

    // Crear nuevo prestamo.
    private void crearNuevoPrestamo() {
        if (validarFormularioCrearCliente()) {
            consulta = new Consulta();
            if (consulta.validarPrestamoNuevo(clienteActual.getCedula())) {
                if (JOptionPane.showConfirmDialog(this, "Realmente deseas crear el prestamo\n para el cliente: " + clienteActual.getCedula() + " " + clienteActual.getNombre(), "CONFIRMAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Prestamo nP = new Prestamo(clienteActual.getCedula(), Double.parseDouble(txtPrestamo.getText()));
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fecha = formato.format(pkcFecha.getDate());
                    nP.setFecha(fecha);
                    consulta.crearNuevoPrestamo(clienteActual, nP);
                    JOptionPane.showMessageDialog(this, "Se creó el prestamo.");
                    // creamos una instancia del prestamo del cliente actual.
                    prestamoActual = consulta.getPrestamoClienteActual(clienteActual.getCedula());
                    cargarInformacionActual();
                    consulta.cerrar();
                    cargarPagoDomingos();
                    cargarInformacionActual();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El cliente no existe o tiene\n un prestamo ACTIVO.", "NO SE PUDO", JOptionPane.WARNING_MESSAGE);
            }
            consulta.cerrar();
        }
    }

    // Cancela el total que se debe del prestamo.
    private void cancelarPrestamo() {
        if (validarFormularioCrearCliente()) {
            consulta = new Consulta();
            if (consulta.validarCancelacionPrestamo(prestamoActual.getId())) {
                if (JOptionPane.showConfirmDialog(this, "¿Realmente deseas cancelar el prestamo.?", "CONFIRMAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fecha = formato.format(pkcFecha.getDate());

                    consulta.cancelarPrestamo(prestamoActual.getId(), fecha);
                    consulta.calificarCliente(clienteActual.getCedula());
                    JOptionPane.showMessageDialog(this, "Cancelación Exitosa.");

                }
            } else {
                JOptionPane.showMessageDialog(this, "El cliente no tiene prestamos ACTIVOS.", "NO SE PUDO", JOptionPane.WARNING_MESSAGE);
            }
            consulta.cerrar();
            buscarClientePorCedula();
        }
    }

    // Limpia la tabla que describe al prestamo.
    private void limpiarTablaDescripcionPrestamo() {
        if (tablaDescripcionPrestamo.getRowCount() > 0) {
            for (int i = 0; i < tablaDescripcionPrestamo.getRowCount(); i++) {
                dtmTablaDescripcionPrestamo.removeRow(i);
            }
        }
    }

    // -------------------------------------------------------------------------
    // EVENTOS.
    // -------------------------------------------------------------------------
    private void agregarOyente() {
        this.pkcFecha.getDateEditor().addPropertyChangeListener(
                new java.beans.PropertyChangeListener() {

            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if (listaCobros.size() > 0) {
                    if (pkcFecha.getDate() != null) {
                        cargarPrestamosCancelados();
                        cargarClientesNoCuota();
                    }
                }
            }
        });
    }

    // Evento para crear un nuevo cobro.
    private void barraMenuNuevoCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraMenuNuevoCobroActionPerformed
        dialogCrearCobro = new DialogCrearCobro(this, true);
        dialogCrearCobro.setVisible(true);
        if (dialogCrearCobro.getNombre() != null) {
            crearNuevoCobro(dialogCrearCobro.getNombre());
        }
    }//GEN-LAST:event_barraMenuNuevoCobroActionPerformed

    // Evento para crear un nuevo cliente.
    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        crearNuevoCliente();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void rbAntesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAntesMouseExited
        if (this.rbAntes.isSelected()) {
            this.rbDespues.setSelected(false);
            this.rbDespues.requestFocus(true);
        } else {
            this.rbDespues.setSelected(true);
            this.rbDespues.requestFocus(true);
        }
    }//GEN-LAST:event_rbAntesMouseExited

    private void rbDespuesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDespuesMouseExited
        if (this.rbDespues.isSelected()) {
            this.rbAntes.setSelected(false);
            this.rbAntes.requestFocus(true);
        } else {
            this.rbAntes.setSelected(true);
            this.rbAntes.requestFocus(true);
        }
    }//GEN-LAST:event_rbDespuesMouseExited

    private void btnClientePrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientePrimeroActionPerformed
        irPrimerCliente();
    }//GEN-LAST:event_btnClientePrimeroActionPerformed

    private void btnClienteUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteUltimoActionPerformed
        irUltimoCliente();
    }//GEN-LAST:event_btnClienteUltimoActionPerformed

    private void btnClienteAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAnteriorActionPerformed
        irAnteriorCliente();
    }//GEN-LAST:event_btnClienteAnteriorActionPerformed

    private void btnClienteSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteSiguienteActionPerformed
        irSiguienteCliente();
    }//GEN-LAST:event_btnClienteSiguienteActionPerformed

    private void cboCobrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCobrosItemStateChanged
        limpiarInformacionActual();
        cargarListaClientes();
        cargarClienteInicial();
    }//GEN-LAST:event_cboCobrosItemStateChanged

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (!txtCedula.getText().isEmpty()) {
            if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER) {
                buscarClientePorCedula();
                if (txtNombre.getText().isEmpty()) {
                    txtNombre.requestFocus(true);
                }
            }
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        limpiarInformacionActual();
        if (clienteActual != null) {
            limpiarTablaDescripcionPrestamo();
        }

    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER && txtPrestamo.getText().isEmpty()) {
            txtPrestamo.requestFocus(true);
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrestamoKeyReleased
        if (!txtPrestamo.getText().isEmpty()) {
            calcularPrestamo(Double.parseDouble(txtPrestamo.getText()));
        } else {
            txtPlazo.setText(null);
            txtValor.setText(null);
            txtCuota.setText(null);
            txtSaldoCapital.setText(null);
            txtSaldoInteres.setText(null);
            txtCuotaCapital.setText(null);
            txtCuotaInteres.setText(null);
        }

        if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER && txtDireccion.getText().isEmpty()) {
            txtDireccion.requestFocus(true);
        }
    }//GEN-LAST:event_txtPrestamoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER && chkFechaSistema.isSelected() == false) {
            pkcFecha.requestFocus(true);
        } else if ((char) evt.getKeyChar() == KeyEvent.VK_ENTER && txtTelefono.getText().isEmpty()) {
            txtTelefono.requestFocus(true);
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void chkFechaSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkFechaSistemaMouseClicked
        if (chkFechaSistema.isSelected()) {
            pkcFecha.setCalendar(Calendar.getInstance());
            pkcFecha.setEnabled(false);
        } else {
            pkcFecha.setCalendar(null);
            pkcFecha.setEnabled(true);
        }
    }//GEN-LAST:event_chkFechaSistemaMouseClicked

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed
        cargarAbono();
    }//GEN-LAST:event_btnAbonoActionPerformed

    private void btnSalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirProgramaActionPerformed

    private void btnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrestamoActionPerformed
        crearNuevoPrestamo();
    }//GEN-LAST:event_btnNuevoPrestamoActionPerformed

    private void barraMenuNuevoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraMenuNuevoGastoActionPerformed
        dialogCrearGasto = new DialogCrearGasto(this, true);
        dialogCrearGasto.setVisible(true);
    }//GEN-LAST:event_barraMenuNuevoGastoActionPerformed

    private void btnCancelarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPrestamoActionPerformed
        cancelarPrestamo();
    }//GEN-LAST:event_btnCancelarPrestamoActionPerformed

    private void barraMenuVerGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraMenuVerGastosActionPerformed
        // dialogListaGastos = new DialogListaGastos(this, true);
        //dialogListaGastos.setVisible(true);
    }//GEN-LAST:event_barraMenuVerGastosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Nuevo;
    private javax.swing.JMenu Ver;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem barraMenuNuevoCobro;
    private javax.swing.JMenuItem barraMenuNuevoGasto;
    private javax.swing.JMenuItem barraMenuVerGastos;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnCancelarPrestamo;
    private javax.swing.JButton btnClienteAnterior;
    private javax.swing.JButton btnClientePrimero;
    private javax.swing.JButton btnClienteSiguiente;
    private javax.swing.JButton btnClienteUltimo;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JButton btnSalirPrograma;
    private javax.swing.JComboBox cboCobros;
    private javax.swing.JCheckBox chkFechaSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblCalificacionCliente;
    private javax.swing.JLabel lblCantidadAbonos;
    private javax.swing.JLabel lblCantidadClientesNoPaganCuota;
    private javax.swing.JLabel lblCantidadPrestamosCancelados;
    private javax.swing.JLabel lblErrorCedula;
    private javax.swing.JLabel lblErrorCobro;
    private javax.swing.JLabel lblErrorDireccion;
    private javax.swing.JLabel lblErrorFecha;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorPrestamo;
    private javax.swing.JLabel lblErrorTelefono;
    private javax.swing.JLabel lblTarjetas;
    private javax.swing.JPanel panelCalificacionCliente;
    private javax.swing.JPanel panelDescripcion;
    private javax.swing.JPanel panelEscritorio;
    private javax.swing.JPanel panelFunciones;
    private com.toedter.calendar.JDateChooser pkcFecha;
    private javax.swing.JRadioButton rbAntes;
    private javax.swing.JRadioButton rbDespues;
    private javax.swing.JTable tablaClientesNoCuota;
    private javax.swing.JTable tablaDescripcionPrestamo;
    private javax.swing.JTable tablaPrestamosCancelados;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtCuotaCapital;
    private javax.swing.JTextField txtCuotaInteres;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlazo;
    private javax.swing.JTextField txtPrestamo;
    private javax.swing.JTextField txtSaldoCapital;
    private javax.swing.JTextField txtSaldoInteres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
