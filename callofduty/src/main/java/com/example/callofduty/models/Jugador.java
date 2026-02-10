package com.example.callofduty.models;

public class Jugador {
    private int id;
    private String nickname;
    private String arma;

    public Jugador (int id, String nickname, String arma) {
       this.id = id;
       this.nickname = nickname;
       this.arma = arma;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getArma() {
        return arma;
    }
}
