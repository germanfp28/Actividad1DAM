package com.example.callofduty.models;

public class Partida {
    private String jugador;
    private String arma;
    private int baja;
    private int muerte;

    public Partida(String jugador,String arma,int baja,int muerte){
        setJugador(jugador);
        setBaja(baja);
        setMuerte(muerte);
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getBaja() {
        return baja;
    }

    public void setBaja(int baja) {
        this.baja = baja;
    }

    public int getMuerte() {
        return muerte;
    }

    public void setMuerte(int muerte) {
        this.muerte = muerte;
    }

}
