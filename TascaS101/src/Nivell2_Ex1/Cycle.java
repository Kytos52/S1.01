package Nivell2_Ex1;

public class Cycle {
	
	private int rodes;

	public Cycle(int rodes) {
		
		this.rodes = rodes;
	}
	
	public static void ride(Cycle c) {
		System.out.println( c.getClass());
		Cycle c1 = (Cycle)c;
		
		System.out.println( c1.getClass());
	}
	

	
	public void cuentaRuedas() {
		System.out.println("Tengo ruedas " + this.rodes);
	}

	
}
