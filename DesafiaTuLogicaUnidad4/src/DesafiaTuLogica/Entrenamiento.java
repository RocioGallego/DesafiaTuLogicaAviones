package DesafiaTuLogica;

public class Entrenamiento extends Avion {
	
	protected boolean tieneDobleMando;
	
	public Entrenamiento (int idAvion, String modAvion, int capAvion, Piloto pilotoAvion, boolean tieneDobleMando) {
	    super (idAvion, modAvion,capAvion,pilotoAvion);
		this.tieneDobleMando=false;
	}
	
	//métodos//
	
	public boolean getTieneDobleMando(){
		
		return tieneDobleMando;
	}
	
	public void setTieneDobleMando (boolean tieneDobleMando) {
		this.tieneDobleMando=tieneDobleMando;
	}
	
	public void mando() {
		if(!tieneDobleMando) {
			System.out.println("El avión tiene doble mando, el instructor puede tomar el control en caso necesario");
			tieneDobleMando=true;
		}else {
			System.out.println("El avión no tiene doble mando");
		}
	}
	
	

}
