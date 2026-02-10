package com.example.callofduty.dao;

import com.example.callofduty.conexion.ConexionBD;
import com.example.callofduty.models.Partida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartidaDao {
    public static void  CreaciondePartida(String jugador,int baja,int muerte)throws SQLException{
    String sql= "INSERT INTO partida(jugador,baja,muerte) VALUES (?,?,?)";
    Connection con= ConexionBD.getConexion();
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setString(1,jugador);
    ps.setInt(2,baja);
    ps.setInt(3,muerte);
    ps.executeUpdate();
    }
    public static List<Partida> getPartida()throws SQLException{
       List <Partida> lista=new ArrayList<>();
       String sql= "SELECT jugador.nickname,arma.nombre,partida.bajas,partida.muertes FROM partidas" +
               "JOIN jugador ON partida.id_jugador_partida=jugador.id_jugador" +
               "JOIN arma ON jugador.id_arma_jugador = arma.id_arma";
       Connection con=ConexionBD.getConexion();
       PreparedStatement ps=con.prepareStatement(sql);
       ResultSet rs=ps.executeQuery();
       while(rs.next()) {
           lista.add(new Partida(
           rs.getString("nickname"),
                   rs.getString("nombre"),
                   rs.getInt("bajas"),
                   rs.getInt("muertes")
           ));

       }
        return lista;
    }
}
