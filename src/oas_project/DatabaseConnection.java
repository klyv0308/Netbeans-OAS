/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oas_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection details
            String url = "jdbc:mysql://localhost:3306/oas_database"; // replace 'ace' with your database name if needed
            String user = "root";                            // your MySQL username
            String password = "mysql-DB1502";              // your MySQL password

            // Establish connection
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace(); // Log any error
        }
        return con;
    }

    // Optional: Test connection via main
    public static void main(String[] args) {
        Connection testConnection = getConnection();
        if (testConnection != null) {
            System.out.println("Connection successful!");
            try {
                testConnection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Connection failed.");
        }
    }  
}
