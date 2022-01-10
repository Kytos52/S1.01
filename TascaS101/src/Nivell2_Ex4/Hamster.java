package Nivell2_Ex4;

public class Hamster extends Rossegador{

	public Hamster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ensumar() {
		System.out.println("Soy un Hamster "+ this.getClass() + " ensumant");
	}
	
	public void rosegar() {
		System.out.println("Soy un Hamster "+ this.getClass() + " rosegant");
	}
	
	public void correr() {
		System.out.println("Soy un Hamster "+ this.getClass() + " corriendo");
	}
}
