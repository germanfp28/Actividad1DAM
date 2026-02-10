package com.example.callofduty.dao;

import com.example.callofduty.conexion.ConexionBD;
import com.example.callofduty.models.Arma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JugadorDao {
    public static void CreaciondeJugador(String nickname, Arma arma) throws SQLException {
        String sql = "INSERT INTO jugador (nickname, id_arma) VALUES (?,?) ";
        Connection con= ConexionBD.getConexion();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,nickname);
        ps.setInt(2,arma.getId());
        ps.executeUpdate();
    }
}
