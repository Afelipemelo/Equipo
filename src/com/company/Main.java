package com.company;

import javax.swing.JOptionPane;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String nombreEquipo = JOptionPane.showInputDialog("Nombre de equipo");
        String nombreEstadio = JOptionPane.showInputDialog("Nombre del estadio");
        int cantidadTitulos = Integer.parseInt(JOptionPane.showInputDialog("cantdad de titulos"));
        int cantidadJugadores = Integer.parseInt(JOptionPane.showInputDialog("cantidad de jugadores titulares"));


        Jugador[] jugadoresTitulares = new Jugador[cantidadJugadores] ;


        for (int i = 0; i < cantidadJugadores; i++) {
            String nombreJugador = JOptionPane.showInputDialog("Nombre jugador del #"+i);
            String posicionJugador = JOptionPane.showInputDialog("Posicion del jugador #"+i);

            Jugador juadorTitular= new Jugador(nombreJugador,posicionJugador);
            jugadoresTitulares[i] = juadorTitular;
        }

        int cantidadJugadoressuplentes = Integer.parseInt(JOptionPane.showInputDialog("cantidad de jugadores suplente"));
        Jugador[] jugadoresSuplente = new Jugador[cantidadJugadoressuplentes] ;

        for (int i = 0; i < cantidadJugadoressuplentes; i++) {
            String nombreJugador = JOptionPane.showInputDialog("Nombre jugador del #"+i);
            String posicionJugador = JOptionPane.showInputDialog("Posicion del jugador #"+i);

            Jugador juadorTitular= new Jugador(nombreJugador,posicionJugador);
            jugadoresSuplente[i] = juadorTitular;
        }

        Equipo equipo = new Equipo(nombreEquipo, nombreEstadio ,cantidadTitulos,jugadoresTitulares,jugadoresSuplente);

        int option = Integer.parseInt(JOptionPane.showInputDialog("Que deseas ver: \n "
                + "1. Reporte básico (Nombre del equipo, títulos ganados y cantidad total de jugadores)\n"
                + "2. Reporte detallado (Nombre del equipo, listado con el detalle de todos los titulares y todos los suplentes)"));

        switch (option) {
            case 1:
                JOptionPane.showConfirmDialog(null, "Nombre :" + equipo.getNombreEquipo() + "\n"
                        + "Titulo :" + equipo.getCatidadTitulos() + "\n"
                        + "Cantidad jugadores :" + equipo.getJugadorTitular().length);
                break;
            case 2:
                String jugadores = "";
                for (int i = 0; i < equipo.getJugadorTitular().length; i++) {
                    jugadores += " - " +  jugadoresTitulares[i].getNombreJugador();
                }

                JOptionPane.showConfirmDialog(null, "Nombre :" + equipo.getNombreEquipo() + "\n"
                        + "Jugadores :" +  jugadores);
            default:
                throw new AssertionError();
        }
    }
}
