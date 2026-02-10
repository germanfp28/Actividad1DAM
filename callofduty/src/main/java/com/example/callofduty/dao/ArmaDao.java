package com.example.callofduty.dao;

import com.example.callofduty.conexion.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArmaDao {
    public static void CreaciondeArma(String nombre) throws SQLException {
    String sql = "INSERT INTO arma (nombre) VALUES (?) ";
        Connection con= ConexionBD.getConexion();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,nombre);
        ps.executeUpdate();
    }

}
