//Kullanýcý giriþ programý (Kullanýcýnýn sitemde daha önceden kayýtlý olduðunu düþünerek oluþturulan ve kullanýcýya max 3 hatalý giriþ hakký veren program).
package Projeler;

import java.util.Scanner;

public class Proje11 {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner (System.in);
    
    int giris_hakki=3;
    
    String sys_kullanici_adi = "Gizem";
    String sys_parola = "123456789";
    
    System.out.println("Kullanýcý Giriþine Hoþgeldiniz");
    System.out.println("*****************");
    
    while(true) {
    	
    	System.out.println("Kullanýcý Adý:");
    	String ad = scanner.nextLine();
    	System.out.println("Parola:");
    	String parola = scanner.nextLine();
    	
    	if(ad.equals(sys_kullanici_adi) && parola.equals(sys_parola) ) {
    		
    	System.out.println("Hoþgeldiniz  " +ad);
    	
    	break;
    	}
    	else if (ad.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
    	
    	System.out.println("Parola Hatalý");
    	giris_hakki -=1;
    	}
    	else if (!ad.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
        	
        System.out.println("Kullanýcý Adý Hatalý");
        giris_hakki -=1;
        	}	
    	else {
    		
    	System.out.println("Kullanýcý Adý ve Parola Hatalý");
    	giris_hakki -=1;
    	}
    	
    	if( giris_hakki == 0) {
    		
    	System.out.println("Giriþ hakkýnýz bitmiþtir!");
    	break;
    	}
    
    	
    	}
    	
    	
    }
	}


