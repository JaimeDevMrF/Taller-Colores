
package clasejaime;

public class Planeta {
    String poblacion;
    boolean habitable;
    boolean agua;
    String años;
    boolean atmosfera;
    
    public Planeta(){
        
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
    public void setHabitable(boolean habitable){
        this.habitable = habitable;
    }
    
    public void setAgua(boolean agua){
        this.agua = agua;
    }
    
    public void setAños(String años){
        this.años = años;
    }
    
    public void setAtmosfera(boolean atmosfera){
        this.atmosfera = atmosfera;
    }
    
    public String getPoblacion(){
        return poblacion;
    }
    
    public boolean getHabitable(){
        return habitable;
    }
    
    public boolean getAgua(){
        return agua;
    }
    
    public String getAños(){
        return años;
    }
    
    public boolean getAtmosfera(){
        return atmosfera;
    }
} 
