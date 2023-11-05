/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzaloferrer
 */

class Conexion {
    String user = "root";
    String password = "";
    String bd = "Login";
    String url = "jdbc:mysql://localhost:3306/" + bd; // Agregar el nombre de la base de datos a la URL

    String driver = "com.mysql.cj.jdbc.Driver";
    
    static Connection CX;
    
    public Conexion(String bd){
        this.bd = bd;
    
    }
    
    public Connection conectar() {
        try {
            //Class.forName(driver);
            CX = DriverManager.getConnection(url, user, password);
            
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la Base de Datos");
            
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return CX;
    }
    
    
}


