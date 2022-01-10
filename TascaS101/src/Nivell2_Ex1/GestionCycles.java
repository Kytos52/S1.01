package Nivell2_Ex1;

public class GestionCycles {

	public static void main(String[] args) {
		
		Unicycle unicycle1 = new Unicycle(1);
		Biclycle bicycle1 = new Biclycle(2);
		Tricycle tricycle1 = new Tricycle(3);
		System.out.println( unicycle1.getClass());
		
		Cycle.ride(unicycle1);
		Cycle.ride(bicycle1);
		Cycle.ride(tricycle1);
		
		
		System.out.println( unicycle1.getClass());
		System.out.println( unicycle1 instanceof Cycle );
		
	
		
		
	}

}
