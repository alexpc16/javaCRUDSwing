/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login;

import static com.mycompany.login.BCryptExample.checkPassword;
import static com.mycompany.login.BCryptExample.hashPassword;
import static com.mycompany.login.PasswordEncryption.encryptPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzaloferrer
 */
public class LoginVentana extends javax.swing.JFrame {

    /**
     * Creates new form LoginVentana
     */
    public LoginVentana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Snell Roundhand", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDC Patolli");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nombre.setColumns(10);

        jLabel2.setText("Nombre");

        jLabel4.setText("Contraseña");

        enviarBtn.setText("Registro");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/gonzaloferrer/Desktop/IniciarSesion/Login/src/main/resource/img/perfil-del-usuario.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(enviarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre)
                                    .addComponent(password))))))
                .addGap(61, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarBtn)
                    .addComponent(jButton1))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        try {
            // TODO add your handling code here:
            
            Conexion conexion = new Conexion("Login");
            Connection conexionRegistro = conexion.conectar();
            
            String nombreUsuarioNuevo = nombre.getText();
            String passwordNuevo = password.getText();
            String passwordNuevoEncriptado = hashPassword(passwordNuevo);
            
            
            String consultaUsuarios = "SELECT password FROM usuario WHERE nombre = ?  ;";
            
            PreparedStatement buscarUsuario = conexionRegistro.prepareStatement(consultaUsuarios);
            
            buscarUsuario.setString(1,nombreUsuarioNuevo);
            //buscarUsuario.setString(2,passwordNuevoEncriptado);
            
            ResultSet resultadoBusqueda = buscarUsuario.executeQuery();
            
            
             if (!resultadoBusqueda.next()) { // Mover al primer resultado (si existe)
                 
                String consultaString = "INSERT INTO usuario(nombre,password) VALUES (?, ?);";
                PreparedStatement preparedStatement = conexionRegistro.prepareStatement(consultaString);
                
                preparedStatement.setString(1, nombreUsuarioNuevo);
                preparedStatement.setString(2, passwordNuevoEncriptado);
                
                int filasInsertadas = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro agregado" + filasInsertadas);
                
                nombre.setText("");
                password.setText("");
                
                
                // Establecer el nombre de usuario en el JTextField
            } else {
                // No se encontraron resultados
                System.out.println("No se encontro nada");
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
                nombre.setText("");
                password.setText("");
                
            }
             
            
            
            
            
           
            
          
            
            
            
            
            /*if (resultadoSQL.next()) { // Mover al primer resultado (si existe)
                String nombreUsuario = resultadoSQL.getString("nombre");
                System.out.println(nombreUsuario);
                
                // Establecer el nombre de usuario en el JTextField
            } else {
                // No se encontraron resultados
                
                
            }*/
            
        } catch (SQLException ex) {
            //Logger.getLogger(LoginVentana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo");

        }
        
        
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      try {
            // TODO add your handling code here:
            
            Conexion conexion = new Conexion("Login");
            Connection conexionRegistro = conexion.conectar();
            
            String nombreUsuarioNuevo = nombre.getText();
            String passwordNuevo = password.getText();
            //String passwordNuevoEncriptado = hashPassword(passwordNuevo);
            
            
            String consultaUsuarios = "SELECT password FROM usuario WHERE nombre = ?  ;";
            
            PreparedStatement buscarUsuario = conexionRegistro.prepareStatement(consultaUsuarios);
            
            buscarUsuario.setString(1,nombreUsuarioNuevo);
            //buscarUsuario.setString(2,passwordNuevoEncriptado);
            
            ResultSet resultadoBusqueda = buscarUsuario.executeQuery();
            
            
             if (resultadoBusqueda.next()) { // Mover al primer resultado (si existe)
                String passwordSys = resultadoBusqueda.getString("password");
                System.out.println(passwordSys);
                boolean passwordMatches = checkPassword(passwordNuevo, passwordSys);
                if(passwordMatches){
                      nombre.setText("");
                password.setText("");
                    
                    RegistroCalificaciones registroCalificaciones = new RegistroCalificaciones(); // Instancia de la ventana de registro
                    registroCalificaciones.setVisible(true);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                      nombre.setText("");
                password.setText("");
                }
                System.out.println(passwordMatches);
                
                
               
                
                // Establecer el nombre de usuario en el JTextField
            } else {
                // No se encontraron resultados
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                  nombre.setText("");
                password.setText("");
                
                
            }
             

                      
            
            
            /*if (resultadoSQL.next()) { // Mover al primer resultado (si existe)
                String nombreUsuario = resultadoSQL.getString("nombre");
                System.out.println(nombreUsuario);
                
                // Establecer el nombre de usuario en el JTextField
            } else {
                // No se encontraron resultados
                
                
            }*/
            
        } catch (SQLException ex) {
            //Logger.getLogger(LoginVentana.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión");

        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
