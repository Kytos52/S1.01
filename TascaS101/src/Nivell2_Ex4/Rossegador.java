package Nivell2_Ex4;

/*
 * Creu una jerarquia d'herència Rossegador: Ratolí, Jerbu, Hamster.
 *  A la classe base proporcioni els mètodes que són comuns als rosegadors (ensumar, rosegar, correr)
 *   i substitueixi aquests mètodes a les classes derivades per a obtenir diferents comportaments depenent 
 *   del tipus específic de rossegador (per exemple, enviant un missatge a la consola). 
 *   Crea un array d'objectes Rossegador, emplena'l amb diferents tipus específics de -rossegadors 
 *   i invoqui els mètodes de la classe base demostrant què succeeix.
 * 
 */

public class Rossegador {
	
	public void ensumar() {
		System.out.println("Soy un Rossegador "+ this.getClass() + " ensumant");
	}
	
	public void rosegar() {
		System.out.println("Soy un Rossegador "+ this.getClass() + " rosegant");
	}
	
	public void correr() {
		System.out.println("Soy un Rossegador "+ this.getClass() + " corriendo");
	}
}
