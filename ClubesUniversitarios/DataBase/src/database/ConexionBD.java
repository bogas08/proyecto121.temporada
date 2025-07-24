/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author VictorAlbertoMachaca
 */
public class ConexionBD {
    private Connection conectar = null;
    

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Para MySQL 5.x
            // Para MySQL 8.x o superior: Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/clubesuniversitarios", "root", "");

            JOptionPane.showMessageDialog(null, "Conexcion Aceptada.. !!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return conectar;
    }
}
