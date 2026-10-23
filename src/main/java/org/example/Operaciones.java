package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Operaciones {




    public static Jugadores buscarNombre(Jugadores[] jugador, String nombre){

        Jugadores jugadorEncontrado = new Jugadores();
        int coincidencias = 0;
        for (int i = 0; i < jugador.length; i++) {
            if (jugador[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Jugador encontrado: "+ jugador[i]);
                jugadorEncontrado = jugador[i];
                coincidencias +=1;
                break;
            }
        }
        if (coincidencias == 0){
            System.out.println("No hemos encontrado jugador");
        }
        Arrays.toString(jugador);
        return jugadorEncontrado;
    }



    public static Jugadores[] ordenamientoPuntaje(Jugadores jugadores[]) {


        // Algoritmo de Ordenamiento Burbuja (Descendente)
        for (int i = 0; i < jugadores.length - 1; i++) {
            for (int j = 0; j < jugadores.length - 1 - i; j++) {

                if (jugadores[j].getPuntaje() < jugadores[j + 1].getPuntaje()) {

                    Jugadores aux = jugadores[j];
                    jugadores[j] = jugadores[j + 1];
                    jugadores[j + 1] = aux;

                }
            }
        }
        System.out.println("Los datos se ordenaron");

        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(" Ranking Actual: "+ jugadores[i]+"\n");
        }

        return jugadores;

    }

    public static Jugadores buscarPrimerPuntaje(Jugadores puntajes[]){
        ordenamientoPuntaje(puntajes);
        Arrays.toString(puntajes);
        System.out.println("Primer Puntaje: "+puntajes[0]);
        return puntajes[0];
    }


    public static Jugadores buscarUltimoPuntaje(Jugadores puntajes[]){
        ordenamientoPuntaje(puntajes);
        Arrays.toString(puntajes);

        System.out.println("Ultimo Puntaje: "+puntajes[puntajes.length - 1]);
        return puntajes[puntajes.length -1];
    }



    public static Jugadores[] consultarPuntajeJugadores(Jugadores puntajes[], int puntajeJugador) {
        int coincidencias = 0;

        System.out.println("Jugadores Encontrados por el Puntaje:");


        for (int i = 0; i < puntajes.length; i++) {
            Jugadores jugadorActual = puntajes[i];

            if (jugadorActual.getPuntaje() == puntajeJugador) {
                System.out.println("- " + jugadorActual);
                coincidencias += 1;
            }
        }

        if (coincidencias == 0) {
            System.out.println("No hemos encontrado jugadores asociados a ese puntaje");
        }
        return puntajes;
    }




}


