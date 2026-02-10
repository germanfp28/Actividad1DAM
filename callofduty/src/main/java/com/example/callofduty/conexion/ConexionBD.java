package com.example.callofduty.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL="jdbc:mysql://localhost/Actividad1";
    private static final String USER="root";
    private static final String PASS="";


    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
}
