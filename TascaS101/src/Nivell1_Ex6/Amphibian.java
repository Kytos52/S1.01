package Nivell1_Ex6;

public class Amphibian {
	
	private String nombre;

	public Amphibian(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void moure(String habitat) {
		System.out.println("El anfibio " + this.nombre + " vive en "+ habitat);
	}
	public void respirar(int veces) {
		System.out.println("El anfibio " + this.nombre + " respira "+ veces + " veceas cada minuto.");
	}
	public void menjar(String comida) {
		System.out.println("El anfibio " + this.nombre + " come "+ comida);
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
