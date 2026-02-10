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

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nickname='" + nickname + '\'' +
                ", arma=" + arma +
                '}';
    }
}
