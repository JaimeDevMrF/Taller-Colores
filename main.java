
package clasejaime;

public class main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta();
        tierra.setAgua(true);
        tierra.setAtmosfera(true);
        tierra.setHabitable(true);
        tierra.setPoblacion("8 mil millones");
        tierra.setAños("4,543 miles de millones");
        
        System.out.println("Tiene agua: "+tierra.getAgua()+"\nTiene Atmosfera: "+tierra.getAtmosfera()+"\nEs habitable: "+tierra.getHabitable()+"\nPoblacion: "+tierra.getPoblacion()+"\nAños: "+tierra.getAños());
    }
    
}
