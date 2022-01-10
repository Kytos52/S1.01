package Nivell1_Ex2;


public class GestionVehicle {

	public static void main(String[] args) {
		
		Vehicle coche1 = new Vehicle("Seat 500");
		coche1.iniciar();
		coche1.acelerar(50);
		Vehicle.parar();
	}

}
