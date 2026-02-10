package com.example.callofduty.models;

public class Jugador {
    private int id;
    private String nickname;
    private Arma arma;

    public Jugador (String nickname, Arma arma) {
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

    @Override
    public String toString() {
        return "Jugador{" +
                "nickname='" + nickname + '\'' +
                ", arma=" + arma +
                '}';
    }
}
