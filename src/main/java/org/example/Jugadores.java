package org.example;

public class Jugadores {

    private String nombre;
    private int puntaje;





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


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
