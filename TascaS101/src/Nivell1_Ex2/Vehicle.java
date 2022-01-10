package Nivell1_Ex2;

public class Vehicle {

	String modelo;

	//Constructor
	public Vehicle(String modelo) {
		this.modelo = modelo;
	}

	//Getters Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void iniciar()
	{
		System.out.println("Has arrancado un coche modelo " + this.modelo);
	}

	public void acelerar(int velocidad) {
		System.out.println("Has acelerado el coche modelo " + this.modelo + " hasta "+ velocidad + " km/h");
	}
	
	public static void parar() {
		System.out.println("Has parado el coche.");
	}
	
	@Override
	public String toString() {
		return "Vehicle [modelo=" + modelo + "]";
	}
}
