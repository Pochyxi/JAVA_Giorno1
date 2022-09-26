package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		System.out.println( perimetro(43.39, 20.6) );
		System.out.println( pariDispari(26) );
		System.out.println( area(5.6, 6.7, 8.9) );
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("dammi una parola: ");
		String stringa1 = in.nextLine();
		
		System.out.println( "dammene un'altra: ");
		String stringa2 =  in.nextLine();
		
		System.out.println( "dammene un'altra: ");
		String stringa3 =  in.nextLine();
		
		System.out.println(stringa1 + stringa2 + stringa3);
		System.out.println(stringa3 + stringa2 + stringa1);
		
		in.close();
		
	}
	
	public static double perimetro(double lato1, double lato2 ) {
        return ((lato1 + lato2) * 2);
    };

    public static int pariDispari(int x) {
        if(x %2 == 0) {
            return 0;
        } else {
            return 1;
        }
    };

    public static double area(double a, double b, double c) {
        double p = a + b + c;
        return Math.sqrt(p * (p - a) * (p - b)*(p - c));
    }

}
