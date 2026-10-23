package org.example;

public class Jugadores {

    private String nombre;
    private int puntaje;



public Jugadores(){

}

public Jugadores(String nombre, int puntaje){
    this.nombre = nombre;
    this.puntaje = puntaje;
}


    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }



    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }


}
