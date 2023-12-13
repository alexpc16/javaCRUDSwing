package com.mycompany.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase para gestionar la conexión a la base de datos MySQL.
 */
class Conexion {
    private String user = "root";
    private String password = "";
    private String bd;
    private String url;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection CX;

    /**
     * Constructor que acepta el nombre de la base de datos.
     * @param bd Nombre de la base de datos.
     */
    public Conexion(String bd) {
        this.bd = bd;
        this.url = "jdbc:mysql://localhost:3306/" + bd;
    }

    /**
     * Establece la conexión a la base de datos.
     * @return La conexión establecida.
     */
    public Connection conectar() {
        try {
            // Cargar dinámicamente el controlador JDBC
            //Class.forName(driver);
            
            // Establecer la conexión
            CX = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la Base de Datos");
        } catch (SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión. Error: " + e.getMessage());
            
        }
        return CX;
    }

    /**
     * Cierra la conexión a la base de datos.
     * @throws SQLException Si hay un error al cerrar la conexión.
     */
    public void cerrarConexion() {
        try {
            if (CX != null && !CX.isClosed()) {
                CX.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
