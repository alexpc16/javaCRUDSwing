/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author gonzaloferrer
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class PasswordEncryption {

    public static String encryptPassword(String password) {
        try {
            // Seleccionamos el algoritmo de hash (SHA-256 en este caso)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convertimos la contraseña a bytes y generamos el hash
            byte[] hashedBytes = digest.digest(password.getBytes());

            // Convertimos los bytes del hash a una representación legible (hexadecimal)
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Manejo de la excepción en caso de algoritmo no encontrado
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String passwordToEncrypt = "contrasena123";
        String encryptedPassword = encryptPassword(passwordToEncrypt);

        if (encryptedPassword != null) {
            System.out.println("Contraseña cifrada: " + encryptedPassword);
        }
    }
}
