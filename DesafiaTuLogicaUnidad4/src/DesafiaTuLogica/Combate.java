package DesafiaTuLogica;

public class Combate extends Avion {
    private boolean esFurtivo;
    
    public Combate (int idAvion, String modAvion, int capAvion, Piloto pilotoAvion, boolean esFurtivo) {
    	super (idAvion, modAvion,capAvion,pilotoAvion);
    	this.esFurtivo=false;
    }
    
    //métodos//
    
    public boolean getEsFurtivo() {
    	return esFurtivo;
    }
    
    public void setEsFurtivo(boolean esFurtivo) {
    	this.esFurtivo=esFurtivo;
    }
    
    public void tecnologiaFurtiva() {
    	if(!esFurtivo) {
    		System.out.println("El avión cuenta con tecnología para minimizar la visibilidad de radares");
    		esFurtivo=true;
    	}else {
    		System.out.println("El avión no cuenta con tecnología furtiva");
    	}
    }
}
