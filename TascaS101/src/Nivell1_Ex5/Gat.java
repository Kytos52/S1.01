package Nivell1_Ex5;



public class Gat extends Animal{

	private String raza;

	public Gat(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	public void correr() {
		System.out.println("El animal " + super.getNombre()+  " es un "+this.raza+" que está corriendo.");
	}
	
	

}
