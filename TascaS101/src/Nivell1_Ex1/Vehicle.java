package Nivell1_Ex1;

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

	
	@Override
	public String toString() {
		return "Vehicle [modelo=" + modelo + "]";
	}
	
	
	
}
