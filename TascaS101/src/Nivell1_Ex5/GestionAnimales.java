package Nivell1_Ex5;

public class GestionAnimales {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Rufo");
		animal1.correr();
		animal1.correr("París");
		animal1.correr("París", 7);
		Gat gato1 = new Gat("Pepe" , " gato Persa");
		gato1.correr();
		gato1.correr("Barcelona");
		gato1.correr("Barcelona", 5);
	}

}
