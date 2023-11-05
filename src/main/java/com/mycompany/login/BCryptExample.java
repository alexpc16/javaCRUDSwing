/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author gonzaloferrer
 */
import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {

    public static String hashPassword(String password) {
        // Generar un hash con BCrypt
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        // Verificar si la contraseña coincide con el hash almacenado
        return BCrypt.checkpw(password, hashedPassword);
    }

    public static void main(String[] args) {
        String passwordToHash = "contrasena123";

        // Cifrar la contraseña
        String hashedPassword = hashPassword(passwordToHash);
        System.out.println("Contraseña cifrada: " + hashedPassword);

        // Verificar una contraseña (por ejemplo, durante el inicio de sesión)
        boolean passwordMatches = checkPassword("contrasena123", hashedPassword);
        System.out.println("La contraseña coincide: " + passwordMatches);
    }
}
