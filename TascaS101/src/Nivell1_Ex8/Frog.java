package Nivell1_Ex8;

public class Frog extends Amphibian{
	
	private String raza;

	public Frog(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	public void moure(String habitat) {
		System.out.println("La rana " + super.getNombre() + " vive en "+ habitat);
	}
	public void respirar(int veces) {
		System.out.println("La rana " + super.getNombre() + " respira "+ veces + " veces cada minuto.");
	}
	public void menjar(String comida) {
		System.out.println("La rana " + super.getNombre() + " come "+ comida);
	}
	
	
	
	
}
