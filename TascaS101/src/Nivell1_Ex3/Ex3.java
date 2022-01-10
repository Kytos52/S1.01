package Nivell1_Ex3;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba p1 = new Prueba();
		p1.imprime();
	}
	
		
}

class Prueba{
	
	public Prueba() {
		System.out.println("Accedemos al constructor");
	}
	
	static void imprime() {
		System.out.println("Muestro un mensaje");
	}
}