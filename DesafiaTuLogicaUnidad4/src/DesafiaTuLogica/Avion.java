package DesafiaTuLogica;

public class Avion {
	
	protected int idAvion;
	protected String modAvion;
	protected int capAvion;
	protected Piloto pilotoAvion;
	
	//Constructor con parámetros//
	public Avion (int idAvion, String modAvion, int capAvion, Piloto pilotoAvion) {
		this.idAvion=idAvion;
		this.modAvion=modAvion;
		this.capAvion=capAvion;
		this.pilotoAvion=pilotoAvion;
		}
	
	//métodos//
	
	public int getIdAvion() {
		return idAvion;
	}
	
	public void setIdAvion(int idAvion) {
		this.idAvion=idAvion;
	}
	
	public String getModAvion() {
		return modAvion;
	}
	
	public void setModAvion(String modAvion) {
		this.modAvion=modAvion;
	}
	
	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion=capAvion;
	}
	
	public Piloto getPilotoAvion() {
		return pilotoAvion;
	}
	
	public void setPilotoAvion( Piloto pilotoAvion) {
		this.pilotoAvion=pilotoAvion;
	}
	
	public void mostrarAvion() {
		System.out.println("Identificador de vuelo: " +  getIdAvion() );
		System.out.println("Modelo: " + getModAvion());
		System.out.println("Cantidad máxima de ocupantes del avión: " + getCapAvion() + " personas");
		System.out.println();
		System.out.println("Información del piloto: "); pilotoAvion.mostrarPiloto ();
										
	}
	
}
