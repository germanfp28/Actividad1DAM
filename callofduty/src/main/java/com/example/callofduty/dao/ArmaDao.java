package com.example.callofduty.dao;

import com.example.callofduty.conexion.ConexionBD;
import com.example.callofduty.models.Arma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArmaDao {
    public static List<Arma> getArmas()throws SQLException {
        List<Arma> lista =  new ArrayList<>();
        String sql = "SELECT * FROM arma";
        Connection con =  ConexionBD.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            lista.add(new Arma(rs.getInt("id"),rs.getString("nombre")));
        }
        return lista;

    }
}
