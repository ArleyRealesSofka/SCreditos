package Mundo;

import static Utilidades.CreacionCliente_Utilidad.CLIENTE_PRIMERO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Consulta {

    // -------------------------------------------------------------------------
    // ATRIBUTOS.
    // -------------------------------------------------------------------------
    private Connection BaseDatos = null;

    private Statement st = null;

    private ResultSet rs = null;

    private Usuario usuario;

    private Cobro cobro;

    private ArrayList<Cobro> listaCobros;

    private Cliente cliente;

    private ArrayList<Cliente> listaClientes, listaClientesNoCuota;

    private ArrayList<Prestamo> listaPrestamos;

    private Prestamo prestamoActual;

    private int domingos, clientesCancelaroPrestamos, numeroAbonos, cantidadPrestamos;

    private ArrayList<Abono> listaAbonos;

    private Abono abono;

    private Object clientes_PrestamosCancelados[][] = null;

    //private Cliente cliente;
    //private Cuota cuota;
    //private Calificacion calificacion;
    //private Cartera credito;
    //private ArrayList<Cliente> listaClientes;
    //private ArrayList<Cuota> listaCuotas;
    //private ArrayList<Cartera> listaCreditos;
    //private ArrayList<Calificacion> listaCalificaciones;
    // -------------------------------------------------------------------------
    // CONSTRUCTORES.
    // -------------------------------------------------------------------------
    public Consulta() {
        Conexion conexion = new Conexion();
        BaseDatos = conexion.open();
    }

    // -------------------------------------------------------------------------
    // MÉTODOS.
    // -------------------------------------------------------------------------    
    // Cierra la conexion a la base de datos. APROBADO
    public void cerrar() {
        try {
            st.close();
            BaseDatos.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //valida si el usuario con el que se va a iniciar sesion existe. return true si existe. APROBADO
    public boolean validarUsuario(String pUsuario) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM USUARIOS WHERE USUARIO= '" + pUsuario + "'");

            if (rs != null && rs.next()) {
                this.usuario = new Usuario(rs.getString("NOMBRES"), rs.getString("PRIMER_APELLIDO"), rs.getString("SEGUNDO_APELLIDO"), rs.getString("USUARIO"), rs.getString("CONTRASENA"));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return false;
    }

    //return el usuario.  APROBADO
    public Usuario getUsuario() {
        return usuario;
    }

    // Crear Cobro Nuevo. APROBADO
    public void crearCobro(String pNombreCobro) {
        try {
            if (existeCobro(pNombreCobro)) {
                JOptionPane.showMessageDialog(null, "El cobro de nombre: " + pNombreCobro + ", \n ya existe.");
            } else {
                st = BaseDatos.createStatement();
                rs = st.executeQuery("SELECT CREAR_COBROS('" + pNombreCobro + "');");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Crear Cobro.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Valida si el cobro ya existe en la base de datos. APROBADO
    public boolean existeCobro(String pNombreCobro) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT 1 AS EXISTE FROM COBROS WHERE NOMBRE = '" + pNombreCobro + "'");

            if (rs != null) {
                if (rs.next() && rs.getInt("EXISTE") == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Existe Cobro.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return false;
    }

    // Valida si el cliente ya existe en la base de datos. APROBADO
    public boolean existeCliente(String pCedula) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT 1 AS EXISTE FROM CLIENTES WHERE CEDULA = '" + pCedula + "'");

            if (rs != null) {
                if (rs.next() && rs.getInt("EXISTE") == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Existe Cobro.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return false;
    }

    // Crea la lista de los cobros que existen en la base de datos. APROBADO
    public ArrayList<Cobro> listarCobros() {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM COBROS");
            listaCobros = new ArrayList<>();
            while (rs.next()) {
                cobro = new Cobro(rs.getInt("ID"), rs.getString("NOMBRE"));
                listaCobros.add(cobro);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Listar Cobro.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return listaCobros;
    }

    // Crea cliente nuevo. APROBADO
    public Cliente crearCliente(Cliente pClienteNuevo, String pDespuesDe, Cliente pClienteActual, Prestamo pPrestamo) {
        try {
            st = BaseDatos.createStatement();
            if (pDespuesDe.equals(CLIENTE_PRIMERO)) {
                rs = st.executeQuery("SELECT CREAR_CLIENTE('" + pClienteNuevo.getCedula() + "', '" + pClienteNuevo.getNombre() + "', '" + pClienteNuevo.getDireccion() + "', '" + pClienteNuevo.getCobro() + "', '" + pClienteNuevo.getTelefono() + "', '" + pDespuesDe + "', 0, " + (long) pPrestamo.getPrestamo() + ", " + (long) pPrestamo.getValor() + ", " + (long) (pPrestamo.getValor() - pPrestamo.getPrestamo()) + ", " + pPrestamo.getPlazo() + ", '" + pPrestamo.getFecha() + "');");
            } else {
                rs = st.executeQuery("SELECT CREAR_CLIENTE('" + pClienteNuevo.getCedula() + "', '" + pClienteNuevo.getNombre() + "', '" + pClienteNuevo.getDireccion() + "', '" + pClienteNuevo.getCobro() + "', '" + pClienteNuevo.getTelefono() + "', '" + pDespuesDe + "', " + pClienteActual.getRuta() + ", " + (long) pPrestamo.getPrestamo() + ", " + (long) pPrestamo.getValor() + ", " + (long) (pPrestamo.getValor() - pPrestamo.getPrestamo()) + ", " + pPrestamo.getPlazo() + ", '" + pPrestamo.getFecha() + "');");
            }
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTES WHERE CEDULA= '" + pClienteNuevo.getCedula() + "';");
            if (rs.next()) {
                cliente = new Cliente(rs.getInt("ID"), rs.getInt("RUTA"), rs.getString("CEDULA"), rs.getString("NOMBRE"), rs.getString("DIRECCION"), rs.getString("COBRO"), rs.getString("TELEFONO"), rs.getString("CALIFICACION"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace(), "Consulta: Crear Cliente.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return cliente;
    }

    // Crea un nuevo prestamo para el cliente.
    public void crearNuevoPrestamo(Cliente pCliente, Prestamo pPrestamo) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT CREAR_NUEVO_PRESTAMO( '" + pCliente.getCedula() + "', " + pPrestamo.getPrestamo() + ", " + pPrestamo.getValor() + ", " + pPrestamo.getInteres() + ", " + pPrestamo.getPlazo() + ", '" + pPrestamo.getFecha() + "')");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace(), "Consulta: Crear Nuevo Prestamo.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Crea la lista de los cobros que existen en la base de datos. APROBADO
    public ArrayList<Cliente> listarClientes(String pCobro) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTES WHERE COBRO='" + pCobro + "' ORDER BY RUTA ASC;");
            listaClientes = new ArrayList<>();
            while (rs.next()) {
                cliente = new Cliente(rs.getInt("ID"), rs.getInt("RUTA"), rs.getString("CEDULA"), rs.getString("NOMBRE"), rs.getString("DIRECCION"), rs.getString("COBRO"), rs.getString("TELEFONO"), rs.getString("CALIFICACION"));
                listaClientes.add(cliente);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Listar Clientes.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return listaClientes;
    }

    // Buscar cliente por cedula y lo retorna. APROBADO
    public Cliente buscarClientePorCedula(String pCedula, String pCobro) {
        cliente = null;

        try {
            if (!pCedula.equals("")) {
                st = BaseDatos.createStatement();
                rs = st.executeQuery("SELECT * FROM CLIENTES WHERE CEDULA LIKE '" + pCedula + "%' AND COBRO = '" + pCobro + "'");
                if (rs.next()) {
                    cliente = new Cliente(rs.getInt("ID"), rs.getInt("RUTA"), rs.getString("CEDULA"), rs.getString("NOMBRE"), rs.getString("DIRECCION"), rs.getString("COBRO"), rs.getString("TELEFONO"), rs.getString("CALIFICACION"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Buscar Cliente Por Cedula.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return cliente;
    }

    // Return prestamo del cliente actual. APROBADO
    public Prestamo getPrestamoClienteActual(String pCedula) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM PRESTAMOS WHERE CEDULA_CLIENTE = '" + pCedula + "' ORDER BY ID DESC;");
            if (rs.next()) {
                prestamoActual = new Prestamo(pCedula, rs.getDouble("PRESTAMO") / 1000);
                prestamoActual.setId(rs.getInt("ID"));
                prestamoActual.setFecha(rs.getString("FECHA_INICIO"));
                prestamoActual.setValorDebe(rs.getDouble("VALOR_DEBE"));
                prestamoActual.setValorPago(rs.getDouble("VALOR_PAGO"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: get Prestamo Cliente Actual.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return prestamoActual;
    }

    // Retorna los domingos de un prestamo. APROBADO
    public int getDomingosPrestamo(String pCedula) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM PRESTAMOS WHERE CEDULA_CLIENTE = '" + pCedula + "' AND ESTADO = 'ACTIVO'");
            if (rs.next()) {
                rs = st.executeQuery("SELECT OBTENER_DOMINGOS_PRESTAMO(" + rs.getInt("ID") + ");");
                if (rs.next()) {
                    domingos = rs.getInt("OBTENER_DOMINGOS_PRESTAMO");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Domingos prestamo.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return domingos;
    }

    // Carga el pago de los domingos. APROBADO
    public void pagarDomingos(int pIdPrestamo, int pDomingos, double pValorPagar, double pValorPorDomingo) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT PAGO_DOMINGOS(" + pIdPrestamo + ", " + pDomingos + ", " + pValorPagar + ", " + pValorPorDomingo + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Pagar Domingos.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Carga el pago de las cuotas y de los abonos. APROBADO
    public void pagarAbono(int pIdPrestamo, String pFecha, double pValor) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT CARGAR_ABONO(" + pIdPrestamo + ", '" + pFecha + "', " + pValor + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Pagar Abono.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Obtiene la lista de los abonos que existen en la base de datos. APROBADO
    public ArrayList<Abono> listarAbonos(int pIdPrestamo) {
        try {
            listaAbonos = new ArrayList<>();
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT FECHA_INICIO FROM PRESTAMOS WHERE ID = " + pIdPrestamo + ";");
            Date fechaDomingo = null;
            if (rs.next()) {
                fechaDomingo = rs.getDate("FECHA_INICIO");
            }
            rs = st.executeQuery("SELECT * FROM DOMINGOS WHERE ID_PRESTAMO = " + pIdPrestamo + ";");
            if (rs.next()) {
                abono = new Abono(rs.getInt("ID"), fechaDomingo, rs.getDouble("VALOR_PAGO"), "DOMINGOS", rs.getDouble("VALOR_RESTANTE"));
                listaAbonos.add(abono);
            }

            rs = st.executeQuery("SELECT * FROM ABONOS WHERE ID_PRESTAMO = " + pIdPrestamo + ";");
            while (rs.next()) {
                abono = new Abono(rs.getInt("ID"), rs.getDate("FECHA"), rs.getDouble("VALOR"), "ABONO", rs.getDouble("VALOR_RESTANTE"));
                listaAbonos.add(abono);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Listar Abonos.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return listaAbonos;
    }

    // crea un nuevo gasto en la base de datos. APROBADO
    public void crearGasto(String pNombre, double pValor) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT CREAR_GASTO('" + pNombre + "', " + pValor + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Listar Abonos.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // carga la lista de prestamos que se cancelaron en un dia especifico. APROBADO
    public Object[][] obtenerPrestamosCancelados(String pFecha, String pCobro) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM PRESTAMOS WHERE ESTADO = 'PAGÓ' AND FECHA_PAGO = '" + pFecha + "'");
            listaPrestamos = new ArrayList<>();
            while (rs.next() && rs != null) {
                prestamoActual = new Prestamo(rs.getString("CEDULA_CLIENTE"), rs.getDouble("PRESTAMO") / 1000);
                prestamoActual.setId(rs.getInt("ID"));
                prestamoActual.setFecha(rs.getString("FECHA_INICIO"));
                prestamoActual.setValorDebe(rs.getDouble("VALOR_DEBE"));
                prestamoActual.setValorPago(rs.getDouble("VALOR_PAGO"));
                listaPrestamos.add(prestamoActual);
            }

            if (listaPrestamos.size() <= 0) {
            } else {
                listaClientes = new ArrayList<>();
                for (Prestamo prestamo : listaPrestamos) {
                    rs = st.executeQuery("SELECT * FROM CLIENTES WHERE CEDULA = '" + prestamo.getCedulaCliente() + "';");
                    while (rs.next() && rs != null) {
                        cliente = new Cliente(rs.getInt("ID"), rs.getInt("RUTA"), rs.getString("CEDULA"), rs.getString("NOMBRE"), rs.getString("DIRECCION"), rs.getString("COBRO"), rs.getString("TELEFONO"), rs.getString("CALIFICACION"));
                        listaClientes.add(cliente);
                    }
                }

                if (listaClientes.size() <= 0) {

                } else {
                    clientesCancelaroPrestamos = listaClientes.size();
                    this.clientes_PrestamosCancelados = new Object[listaClientes.size()][2];
                    int contador = 0;
                    for (Cliente cliente : listaClientes) {
                        for (Prestamo prestamo : listaPrestamos) {
                            if (cliente.getCedula().equals(prestamo.getCedulaCliente())) {
                                clientes_PrestamosCancelados[contador][0] = cliente;
                                clientes_PrestamosCancelados[contador][1] = prestamo;
                            }
                        }
                        contador++;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Listar Prestamos Cancelados.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return clientes_PrestamosCancelados;
    }

    // Retorna los prestamos cancelados. APROBADO
    public int obtenerNumeroPrestamosCancelados() {
        return clientesCancelaroPrestamos;
    }

    // Retorna los clientes que no dieron cuota en el dia. APROBADO
    public ArrayList<Cliente> obtenerClientesNoCuota(String pCobro, String pFecha) {
        try {
            st = BaseDatos.createStatement();
            // Almacenamos los abonos en cero.
            rs = st.executeQuery("SELECT * FROM ABONOS WHERE VALOR = 0 AND FECHA = '" + pFecha + "'");
            listaAbonos = new ArrayList<>();
            while (rs.next() && rs != null) {
                abono = new Abono(rs.getInt("ID"), rs.getDate("FECHA"), rs.getDouble("VALOR"), "ABONO", rs.getDouble("VALOR_RESTANTE"), rs.getInt("ID_PRESTAMO"));
                listaAbonos.add(abono);
            }

            listaPrestamos = new ArrayList<>();

            listaClientesNoCuota = new ArrayList<>();
            if (listaAbonos.size() > 0) {
                for (Abono abono : listaAbonos) {
                    rs = st.executeQuery("SELECT * FROM PRESTAMOS WHERE ID = " + abono.getIdPrestamo() + ";");
                    if (rs.next()) {
                        prestamoActual = new Prestamo(rs.getString("CEDULA_CLIENTE"), rs.getDouble("PRESTAMO") / 1000);
                        listaPrestamos.add(prestamoActual);
                    }
                }

                for (Prestamo prestamo : listaPrestamos) {
                    rs = st.executeQuery("SELECT * FROM CLIENTES WHERE CEDULA = '" + prestamo.getCedulaCliente() + "' AND COBRO = '" + pCobro + "'");
                    if (rs.next()) {
                        cliente = new Cliente(rs.getInt("ID"), rs.getInt("RUTA"), rs.getString("CEDULA"), rs.getString("NOMBRE"), rs.getString("DIRECCION"), rs.getString("COBRO"), rs.getString("TELEFONO"), rs.getString("CALIFICACION"));
                        listaClientesNoCuota.add(cliente);
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Obtener Clientes No Cuota.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return listaClientesNoCuota;
    }

    // Retorna si true si el cliente no tiene prestamos activos. APROBADO
    public boolean validarPrestamoNuevo(String pCedula) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT 1 AS EXISTE FROM CLIENTES WHERE CEDULA = '" + pCedula + "'");

            if (rs != null) {
                if (rs.next() && rs.getInt("EXISTE") == 1) {
                    rs = st.executeQuery("SELECT 0 AS EXISTE FROM PRESTAMOS WHERE CEDULA_CLIENTE = '" + pCedula + "' AND ESTADO = 'ACTIVO'");
                    if (rs != null) {
                        if (rs.next() && rs.getInt("EXISTE") == 0) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Validacion Nuevo Prestamo.", JOptionPane.INFORMATION_MESSAGE, null);
        }
        return false;
    }

    // Retorna true si el cliente tiene un prestamo para paga.
    public boolean validarCancelacionPrestamo(int pIdPrestamo) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT 1 AS EXISTE FROM PRESTAMOS WHERE ID = " + pIdPrestamo + " AND ESTADO = 'ACTIVO';");

            if (rs != null) {
                if (rs.next() && rs.getInt("EXISTE") == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Validacion Cancelacion Prestamo.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return false;
    }

    // Realiza la cancelación del prestamo.
    public void cancelarPrestamo(int pIdPrestamo, String pFecha) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT CANCELAR_PRESTAMO(" + pIdPrestamo + ", '" + pFecha + "')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Cancelacion Prestamo.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Calificar cliente
    public void calificarCliente(String pCedula) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT CALIFICAR_CLIENTE('" + pCedula + "');");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Calificar Cliente.", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    // Retorna la cantidad de abonos que a pagado el cliente en un prestamo.
    public int obtenerNumeroAbonos(int pIdPrestamo) {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS ABONOS FROM ABONOS WHERE ID_PRESTAMO = " + pIdPrestamo + ";");

            if (rs.next() && rs != null) {
                numeroAbonos = rs.getInt("ABONOS");
            } else {
                numeroAbonos = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Obtener Numero Abonos.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return numeroAbonos;
    }

    // Retorna la cantidad de prestamos.
    public int obtenerCantidadPrestamos() {
        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT COUNT(*) AS PRESTAMOS FROM PRESTAMOS WHERE ESTADO = 'ACTIVO';");

            if (rs.next() && rs != null) {
                cantidadPrestamos = rs.getInt("PRESTAMOS");
            } else {
                cantidadPrestamos = 0;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Obtener Cantidad Prestamos.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return cantidadPrestamos;
    }

    // Retorna los abonos entre dos fechas se gun el cobro.
    public double valorAbonoDeSemana(String pFechaInicio, String pFechaFinal, String pCobro) {
        double cobro = 0;

        try {
            st = BaseDatos.createStatement();
            rs = st.executeQuery("SELECT * FROM CLIENTES WHERE COBRO ='" + pCobro + "'");

            if (rs.next() && rs != null) {
                ArrayList cedulas = new ArrayList<>();
                do {                    
                    cedulas.add(rs.getString("CEDULA"));
                } while (rs.next());

                int i = 0;
                while (i < cedulas.size()) {
                    rs = null;
                    rs = st.executeQuery("SELECT * FROM PRESTAMOS WHERE CEDULA_CLIENTE = '" + cedulas.get(i) + "';");
                    if (rs.next() && rs != null) {
                        ArrayList idPrestamos = new ArrayList<>();
                        do {
                            idPrestamos.add(rs.getString("ID"));
                        } while (rs.next());
                        
                        int j = 0;
                        while (j < idPrestamos.size()) {
                            rs = null;                            
                            rs = st.executeQuery("SELECT * FROM ABONOS WHERE ID_PRESTAMO = "+ idPrestamos.get(j) +" AND FECHA >= CAST('"+ pFechaInicio +"' AS DATE) AND FECHA <= CAST('"+ pFechaFinal +"' AS DATE);");
                           
                            if (rs.next() && rs != null) {
                                do {
                                    System.err.println("do de valor");
                                    cobro = cobro + rs.getDouble("VALOR");
                                } while (rs.next());
                            }
                            j++;
                        }
                    }
                    i++;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Consulta: Valor Abono De Semana.", JOptionPane.INFORMATION_MESSAGE, null);
        }

        return cobro;
    }
}
