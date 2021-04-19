package Projeler;

import java.util.Scanner;

public class Proje12 {

	public static void main(String[] args) {
		
     Scanner scanner = new Scanner(System.in);
     System.out.println("Bankamýzýna hoþgeldiniz - Bankamýzýn faiz oraný %6");
     System.out.println("****************************************************");
     
     int anapara;
     int vade;
     
     System.out.println("Lütfen bankamýza yatýrmak istediðiniz miktarý giriniz: ");
     anapara = scanner.nextInt();
     
     System.out.println("Paranýzý kaç yýl vadeli yatýrmak istiyorsunuz:");
     vade = scanner.nextInt();
     
     double toplampara = anapara; // her vadenin sonunda paranýn deðerini atayacaðýmýz bir deðiþken tanýmladýk.
     
     double faizorani = 0.06;
     
     for (int i = 1 ; i<= vade ; i++ ) {
    	 
    	 
    	 toplampara = (toplampara * faizorani) + toplampara;
    	 
    System.out.println( i + ". yýlýn sonunda : " + toplampara);
     
     }
     
     
     
     
     
     
	}

}
