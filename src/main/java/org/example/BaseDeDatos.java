package org.example;

public class BaseDeDatos {
    public static Jugadores[] jugadores = new Jugadores[10];




    static {
        jugadores[0] = new Jugadores("Carlos",34503); //primer puntaje
        jugadores[1] = new Jugadores("Merlina23",948020); //-- puntaje de prueba para buscar
        jugadores[2] = new Jugadores("GeronMusk",999999999);
        jugadores[3] = new Jugadores("teSlashSenior",1592093);
        jugadores[4] = new Jugadores("KastLobby",224234);
        jugadores[5] = new Jugadores("MarkZuckerberg",888888888);
        jugadores[6] = new Jugadores("LarryWheels",92394923);
        jugadores[7] = new Jugadores("KennySoto",948020);
        jugadores[8] = new Jugadores("JerryTheCrack",9234283);
        jugadores[9] = new Jugadores("GranGero Club",948020); //ultimo puntaje
    }

    private BaseDeDatos(){}



}
