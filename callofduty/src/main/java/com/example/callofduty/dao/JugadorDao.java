package com.example.callofduty.dao;

import com.example.callofduty.conexion.ConexionBD;
import com.example.callofduty.models.Arma;
import com.example.callofduty.models.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JugadorDao {
    public static void CreaciondeJugador(String nickname, int idArma) throws SQLException {
        String sql = "INSERT INTO jugador (nickname, id_arma) VALUES (?,?) ";
        Connection con= ConexionBD.getConexion();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,nickname);
        ps.setInt(2,idArma);
        ps.executeUpdate();
    }

    public static List<Jugador> getJugadores() throws SQLException {
        List<Jugador> lista = new ArrayList<>();
        String sql = "SELECT jugador.id_jugador,jugador.nickname,arma.nombre FROM jugador" +
                "JOIN arma ON jugador.id_arma_jugador = arma.id_arma";
        Connection con= ConexionBD.getConexion();
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();

        while(rs.next()){
            lista.add(new Jugador(
                    rs.getInt("id_jugador"),
                    rs.getString("nickname"),
                    rs.getString("nombre")
            ));
        }
        return lista;
    }
}
