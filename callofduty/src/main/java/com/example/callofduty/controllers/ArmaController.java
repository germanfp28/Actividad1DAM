package com.example.callofduty.controllers;

import com.example.callofduty.dao.ArmaDao;

import java.sql.SQLException;

public class ArmaController {
    public void CreaciondeArma(String nombre) throws SQLException {
        String dato="";
        try{
            dato=nombre.toUpperCase();
        }catch(Exception e){

        }
        //LLamada a la función armadao.
        ArmaDao.CreaciondeArma(dato);
    }
}
