/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basquetbolista;

/**
 *
 * @author B11
 */
public class Main {
        public static void main(String[] args) {
        Basquetbolista jugador1 = new Basquetbolista("Carlos", 25, "Lakers", 2.05, 24);
        Basquetbolista jugador2 = new Basquetbolista("Juan", 27, "Bulls", 1.98, 28);
        Basquetbolista jugador3 = new Basquetbolista("Jose",23,"Hornets",1.78,23);
        
        System.out.println("La altura de "+ jugador1.getNombre() +" es " +jugador1.getAltura()+" metros");
        jugador2.setEdad(50);
        

        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();

        jugador1.anotarPuntos(10);
        jugador2.saltar();
        jugador3.compararPuntos(jugador2);

        jugador2.entrenar();
        jugador2.mostrarInformacion();
    }
}
