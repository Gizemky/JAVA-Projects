package Projeler;

import java.util.Scanner;

public class Proje12 {

	public static void main(String[] args) {
		
     Scanner scanner = new Scanner(System.in);
     System.out.println("Bankam�z�na ho�geldiniz - Bankam�z�n faiz oran� %6");
     System.out.println("****************************************************");
     
     int anapara;
     int vade;
     
     System.out.println("L�tfen bankam�za yat�rmak istedi�iniz miktar� giriniz: ");
     anapara = scanner.nextInt();
     
     System.out.println("Paran�z� ka� y�l vadeli yat�rmak istiyorsunuz:");
     vade = scanner.nextInt();
     
     double toplampara = anapara; // her vadenin sonunda paran�n de�erini atayaca��m�z bir de�i�ken tan�mlad�k.
     
     double faizorani = 0.06;
     
     for (int i = 1 ; i<= vade ; i++ ) {
    	 
    	 
    	 toplampara = (toplampara * faizorani) + toplampara;
    	 
    System.out.println( i + ". y�l�n sonunda : " + toplampara);
     
     }
     
     
     
     
     
     
	}

}
