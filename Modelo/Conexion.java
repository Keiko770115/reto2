package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //1. Crear la instancia de la clase Connection del JAR JDBC
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/";
    String nombreBaseDatos = "reto1_g56_db";
    String usuario = "root";
    String contraseña = "";

    //2. Añadimos el constructor de la clase sin argumentos
    public Conexion() {
       
        try {
            //4. Buscamos la clase dentro JAR que coincide con este nombre
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(cadenaConexion + nombreBaseDatos, usuario, contraseña );
            if (connection != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida");

        }
    }

    //6. Creamos una funcion que retorne la connection de la clase
    public Connection getConnection() {
        return connection;
    }

}
