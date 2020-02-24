package Mundo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Utilidades.Conexion_Utilidad;

public class Conexion {
    Connection BaseDatos = null;
    Statement st = null;
    
    protected Connection  open() {
        
        try {
        //Conexion con la base de datos
        BaseDatos = DriverManager.getConnection( Conexion_Utilidad.URL, Conexion_Utilidad.USUARIO, Conexion_Utilidad.CONTRASEÑA);        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.err.println( e.getMessage() ); 
            
        }
        
        return BaseDatos;
    }
}
