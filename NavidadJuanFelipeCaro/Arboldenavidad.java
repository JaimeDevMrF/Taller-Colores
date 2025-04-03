package tallerconcolores;

public class Arboldenavidad {
    int Bolasdelarbol;
    int Numeroestrella;
    int Alturaarbol;
    int Cantidaddeluces;
    int Numerodeangeles;
    
    public void setBolasdelarbol(int Bolasdelarbol){
        this.Bolasdelarbol = Bolasdelarbol;
    }
    public void setNumeroestrella(int Numeroestrella){
        this.Numeroestrella = Numeroestrella;
    }
    public void setAlturaarbol(int Alturaarbol){
        this.Alturaarbol = Alturaarbol;
    }
    public void setCantidaddeluces(int Cantidaddeluces){
        this.Cantidaddeluces = Cantidaddeluces;
    }
    public void setNumerodeangeles(int Numerodeangeles){
        this.Numerodeangeles = Numerodeangeles;
    }
    public void Arbolquemado(){
    System.out.println("El arbol se va a quemar por las luces");
    }
    public void Niñossinregalos(){
    System.out.println("Los niños no recibiran regalo solo carbon");
    }
    public void Decoracion(){
    System.out.println("El arbol se ve que está bien decorado");
    }
    public void pecebre(){
    System.out.println("El arbol tiene que ir encima del pecebre para recibir al niño jesus");
    }
    public void Tren(){
    System.out.println("La nividad este año va a tener un tren con galletas y leche para santa");
    }
    public int getBolasdelarbol(){
        return Bolasdelarbol;
    }
    public int getNumeroestrella(){
        return Numeroestrella;
    }
    public int getAlturaarbol(){
        return Alturaarbol;
    }
    public int getCantidaddeluces(){
        return Cantidaddeluces;
    }
    public int getNumerodeangeles(){
        return Numerodeangeles;
    }
}
