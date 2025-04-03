/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola;

/**
 *
 * @author B11
 */
public class jugador {
    String deporte;
    String nombre;
    int horas;
    float altura;
    int edad;
   
    public String getdeporte(){
        return deporte; 
    }
    public void setdeporte(String deporte){
        this.deporte = deporte;
    }
    
    public String getnombre(){
        return nombre; 
        
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public float getdaltura(){
        return altura; 
    }
    public void setaltura(float altura){
        this.altura = altura;
    }
    public int getedad(){
        return edad; 
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    
    
    public void caractiristicas(){
        System.out.println("horas jugadas: "+horas+" Altura: "+altura+" Deporte: "+deporte+" Nombre: "+nombre+ " Edad: "+edad);
    }
    
    public void Ganancia(){
        System.out.println("102310301 dolares");
    }
    public void entrenar(){
        System.out.println("Entreno mucho");
    }
    
    public void mostrartrofeos(){
        System.out.println("Tengo 231 trofeos");
    }
    public void estudiar(){
        System.out.println("Estudio mucho");
    }


    
}
