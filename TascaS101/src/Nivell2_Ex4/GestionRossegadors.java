package Nivell2_Ex4;

import java.util.ArrayList;



public class GestionRossegadors {

	static ArrayList<Rossegador> rossegadors = new ArrayList<Rossegador>();

	public static void main(String[] args) {

		
		Rossegador r1 = new Rossegador();
		Ratoli rat1 = new Ratoli();
		Jerbu j1 = new Jerbu();
		Hamster h1 = new Hamster();
		
		
		rossegadors.add(r1);
		rossegadors.add(rat1);
		rossegadors.add(j1);
		rossegadors.add(h1);
		
		for (int i = 0; i<rossegadors.size();i++) {
			System.out.println(rossegadors.get(i).getClass());
			rossegadors.get(i).correr();
			rossegadors.get(i).ensumar();
			rossegadors.get(i).rosegar();
		}
	
	
	}

}
