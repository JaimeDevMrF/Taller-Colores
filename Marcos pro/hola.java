/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola;

/**
 *
 * @author B11
 */
public class hola {
    public static void main(String[] args){
        jugador yo= new jugador();
        yo.setdeporte("Tennis");
        yo.setnombre("Marcos pro");
        yo.setaltura(1.90f);
        yo.setedad(30);
        System.out.println(yo.getdaltura());
        System.out.println(yo.getnombre());
        System.out.println(yo.getdeporte());
        yo.caractiristicas();
        yo.mostrartrofeos();
        yo.Ganancia();
        yo.estudiar();
        yo.entrenar();
        
    }
    
}
