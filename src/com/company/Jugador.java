package com.company;

public class Jugador {

    private String nombreJugador;
    private String posicionJugador;

    public Jugador() {
    }

    public Jugador(String nombreJugador, String posicionJugador) {
        this.nombreJugador = nombreJugador;
        this.posicionJugador = posicionJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }
}
