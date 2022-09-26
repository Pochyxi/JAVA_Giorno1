package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(Moltiplica(5, 6));
		System.out.println(Concatena("ciao", 2));
		
		String[] string5 = {
				"ciao",
				"a",
				"tutti",
				"belli",
				"epicoders"
		};
		
		
		
		System.out.println(inseriscilnArray(string5, "bellissimi"));
		for (int i = 0; i < 6; i++) {
			System.out.println(inseriscilnArray(string5, "bellissimi")[i]);
		};
		}


	// ESERCIZIO #2

	//Punto 1
	public static int Moltiplica(int n1, int n2) {
		
		return n1 * n2;
	};
	
	//Punto 2
	public static String Concatena(String stringa, int intero) {
		return stringa + intero;
	};
	
	//Punto 3
	public static String[] inseriscilnArray(String[] arrString, String stringa) {
		
		String[] arrayRiempito = new String[6];
		
		for (int i = 0; i < 6; i++) {
			if(i < 3) {
				arrayRiempito[i] = arrString[i];
			} else if (i == 3) {
				arrayRiempito[i] = stringa;
			} else {
				arrayRiempito[i] = arrString[i - 1];
			};
			
			
			
		};
		
		
		return arrayRiempito;
	};
	
	
	
}



