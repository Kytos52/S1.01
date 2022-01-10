package Nivell1_Ex6;

public class GestionAnfibios {

	public static void main(String[] args) {
		
		Frog rana1 = new Frog("Gustavo","Zancuda");
		rana1.moure("charco");
		rana1.menjar("mosquitos");
		rana1.respirar(5);
		
		Amphibian ranaAmp1 = (Amphibian)rana1;
	
		ranaAmp1.moure("charco");
		ranaAmp1.menjar("mosquitos");
		ranaAmp1.respirar(5);
		
	}

}
