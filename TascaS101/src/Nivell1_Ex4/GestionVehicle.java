package Nivell1_Ex4;



public class GestionVehicle {

	public static void main(String[] args) {
		
		//Campo static pertenece a la clase, por lo que si lo modificamos en una instancia lo 
		//modificamos para toda la clase
		
		System.out.println("--------CAMPO STATIC-------");
		System.out.println("Campo static antes crear instancias de vehícle tipoVehiculo =  "+ Vehicle.tipoVehiculo);
		Vehicle coche1 = new Vehicle("Seat 500");
		System.out.println("Campo static coche1.tipoVahiculo = "  + coche1.tipoVehiculo);
		System.out.println("Campo static coche1.tipoVehiculo = " + Vehicle.tipoVehiculo);
		System.out.println("Campo static despues de crear instancias de vehícle tipoVehiculo =  "+ Vehicle.tipoVehiculo);
		
		//Campo FINAL no podemos modificarlo y es un campo de cada instancia de clase
		
		System.out.println("--------CAMPO FINAL-------");
		//System.out.println("Campo final antes crear instancias de vehícle final ruedas  =  "+ Vehicle.RUEDAS); ERROR 
		Vehicle coche2 = new Vehicle("Fiat 500");
		System.out.println("Campo Final coche2.ruedas = "  + coche2.RUEDAS);
		
		//Campo STATIC FINAL no podemos modificarlo y es un campo de clase
		
		System.out.println("--------CAMPO STATIC FINAL-------");
		System.out.println("Campo final antes crear instancias de vehícle  static final motores  =  "+ Vehicle.MOTORES);  
		Vehicle coche3 = new Vehicle("Lada 500");
		System.out.println("Campo Static Final coche3.motores = "  + coche3.MOTORES);
		System.out.println("Campo Static Final vehicle.motores = "  + Vehicle.MOTORES);
		
		
		
		
		
		
		
		
	}
	

}
