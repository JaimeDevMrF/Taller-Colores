package tallerconcolores;

public class Obejtosarbol {
    
    public static void main (String[] args){
        Arboldenavidad arbol = new Arboldenavidad();
        arbol.setBolasdelarbol(8);
        arbol.setCantidaddeluces(0);
        arbol.setAlturaarbol(200);
        arbol.setNumerodeangeles(0);
        arbol.setNumeroestrella(1);
        arbol.Arbolquemado();
        arbol.Niñossinregalos();
        arbol.Decoracion();
        arbol.pecebre();
        arbol.Tren();
        
        System.out.println("El arbol tiene " + arbol.getBolasdelarbol()+" bolas de luces");
        System.out.println("El arbol tiene " + arbol.getCantidaddeluces()+" luces");
        System.out.println("El arbol tiene una altura de " + arbol.getAlturaarbol()+" cm");
        System.out.println("El arbol tiene " + arbol.getNumerodeangeles()+" numero de angeles");
        System.out.println("El arbol tiene " + arbol.getNumeroestrella()+" estrella de belen");
    }
}
