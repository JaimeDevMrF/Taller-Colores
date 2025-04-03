/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basquetbolista;

/**
 *
 * @author B11
 */
public class Basquetbolista {

    String nombre;
    int edad;
    String equipo;
    double altura;
    int puntosPorPartido;


    public Basquetbolista(String nombre, int edad, String equipo, double altura, int puntosPorPartido) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.altura = altura;
        this.puntosPorPartido = puntosPorPartido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(int puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public void anotarPuntos(int puntos) {
        this.puntosPorPartido += puntos;
        System.out.println(nombre + " anotó " + puntos + " puntos.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Equipo: " + equipo);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Puntos por partido: " + puntosPorPartido);
    }

    public void saltar() {
        System.out.println(nombre + " saltó " + altura * 1.5 + " metros.");
    }

    public boolean compararPuntos(Basquetbolista otroJugador) {
        if (this.puntosPorPartido > otroJugador.getPuntosPorPartido()) {
            System.out.println(nombre + " tiene más puntos que " + otroJugador.getNombre());
            return true;
        } else if (this.puntosPorPartido < otroJugador.getPuntosPorPartido()) {
            System.out.println(otroJugador.getNombre() + " tiene más puntos que " + nombre);
            return false;
        } else {
            System.out.println(nombre + " y " + otroJugador.getNombre() + " tienen la misma cantidad de puntos.");
            return false;
        }
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando para mejorar su rendimiento.");
        // al entrenar mejora su puntaje promedio
        this.puntosPorPartido += 2;
    }


}
