package Nivell1_Ex5;

public class Animal {
	
	private String nombre;

	public Animal(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void correr() {
		System.out.println("El animal " + this.nombre + " está corriendo.");
	}
	
	public void correr(String ciudad){
		System.out.println("El animal " + this.nombre + " está corriendo por " + ciudad);
	}

	public void correr(String ciudad, int perros){
		System.out.println("El animal " + this.nombre + " está corriendo por " + ciudad +" persiguiendo a " + perros +" perros");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 

	
}
