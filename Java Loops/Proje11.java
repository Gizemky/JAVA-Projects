//Kullan�c� giri� program� (Kullan�c�n�n sitemde daha �nceden kay�tl� oldu�unu d���nerek olu�turulan ve kullan�c�ya max 3 hatal� giri� hakk� veren program).
package Projeler;

import java.util.Scanner;

public class Proje11 {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner (System.in);
    
    int giris_hakki=3;
    
    String sys_kullanici_adi = "Gizem";
    String sys_parola = "123456789";
    
    System.out.println("Kullan�c� Giri�ine Ho�geldiniz");
    System.out.println("*****************");
    
    while(true) {
    	
    	System.out.println("Kullan�c� Ad�:");
    	String ad = scanner.nextLine();
    	System.out.println("Parola:");
    	String parola = scanner.nextLine();
    	
    	if(ad.equals(sys_kullanici_adi) && parola.equals(sys_parola) ) {
    		
    	System.out.println("Ho�geldiniz  " +ad);
    	
    	break;
    	}
    	else if (ad.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
    	
    	System.out.println("Parola Hatal�");
    	giris_hakki -=1;
    	}
    	else if (!ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
        	
        System.out.println("Kullan�c� Ad� Hatal�");
        giris_hakki -=1;
        	}	
    	else {
    		
    	System.out.println("Kullan�c� Ad� ve Parola Hatal�");
    	giris_hakki -=1;
    	}
    	
    	if( giris_hakki == 0) {
    		
    	System.out.println("Giri� hakk�n�z bitmi�tir!");
    	break;
    	}
    
    	
    	}
    	
    	
    }
	}


