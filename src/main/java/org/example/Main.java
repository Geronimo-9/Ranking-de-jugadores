package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        int cursor;
        do{

            System.out.println("Ranking de Jugadores (By Geronimo M.");
            System.out.println("[1]: Buscar Por nombre");
            System.out.println("[2]: Ordenar Jugadores por puntuacion (descendiente)");
            System.out.println("[3]: Buscar Primer puntaje (ordenado)");
            System.out.println("[4]: Buscar ultimo puntaje (ordenado)");
            System.out.println("[5]: Buscar Jugadores asociados al puntaje dado");
            System.out.println("[6]: Salir");

           cursor = teclado.nextInt();
          teclado.nextLine(); //salto de buffer corregido

           switch (cursor){
               case 1:
                   System.out.println("Introduce el nombre del jugador:");
                   String nombre = teclado.nextLine();
                   Operaciones.buscarNombre(BaseDeDatos.jugadores, nombre);
                   break;

               case 2:Operaciones.ordenamientoPuntaje(BaseDeDatos.jugadores); break;
               case 3:Operaciones.buscarPrimerPuntaje(BaseDeDatos.jugadores); break;
               case 4:Operaciones.buscarUltimoPuntaje(BaseDeDatos.jugadores); break;
               case 5:
                   System.out.println("Introduce el puntaje de jugadores para asociar:");
                   int puntajeJugador = teclado.nextInt();
                   Operaciones.consultarPuntajeJugadores(BaseDeDatos.jugadores, puntajeJugador);
                   break;

               case 6:
                   System.out.println("Saliendo del programa...");
                   break;

               default:
                   System.out.println("Debe seleccionar una opción válida.");
                   break;
           }

        } while (cursor != 6);




    }
}