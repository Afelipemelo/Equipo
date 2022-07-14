package com.company;

import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private String estadio;
    private int catidadTitulos;
    private Jugador[]jugadorTitular;
    private Jugador[]jugadorSuplente;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String estadio, int catidadTitulos, Jugador[] jugadorTitular, Jugador[] jugadorSuplente) {
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
        this.catidadTitulos = catidadTitulos;
        this.jugadorTitular = jugadorTitular;
        this.jugadorSuplente = jugadorSuplente;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getCatidadTitulos() {
        return catidadTitulos;
    }

    public void setCatidadTitulos(int catidadTitulos) {
        this.catidadTitulos = catidadTitulos;
    }

    public Jugador[] getJugadorTitular() {
        return jugadorTitular;
    }

    public void setJugadorTitular(Jugador[] jugadorTitular) {
        this.jugadorTitular = jugadorTitular;
    }

    public Jugador[] getJugadorSuplente() {
        return jugadorSuplente;
    }

    public void setJugadorSuplente(Jugador[] jugadorSuplente) {
        this.jugadorSuplente = jugadorSuplente;
    }


}
