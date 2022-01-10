package Nivell3_Ex1;

public class GestionBase {

	public static void main(String[] args) {
		
		
		System.out.println("Creo objeto de la clase Base y llamo al metodo 1");
		
		Base base1 = new Base();
		base1.metodo1();
		
		
		System.out.println("Creo objeto de la clase Derivada y llamo al metodo 1");
				
		Derivada derivada1 = new Derivada();
		derivada1.metodo1();
		
		System.out.println("Realizo un upcasting de Derivada a Base y llamo al método1 y vemos que aunque se hay hecho un upcasting sigue llamando al metodo2 sobreescrito en la clase Derivada ");
		Base derivada1B= (Base)derivada1;
		derivada1B.metodo1();
		

	}

}
