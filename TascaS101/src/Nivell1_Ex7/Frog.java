package Nivell1_Ex7;

public class Frog extends Amphibian{
	
	private String raza;

	public Frog(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	public void saltar() {
		System.out.println("El anfibio " + super.getNombre() + " salta");
	}
	
	
	
	
}
