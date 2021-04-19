//Bir sayýnýn armstrong sayý olup olmadýðýný bulan program.

package Projeler;

import java.util.Scanner;

public class Proje9 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println ("Lütfen bir sayý giriniz:");
	int sayi = scanner.nextInt();
	
	System.out.println("Lütfen girdiðiniz sayýnýn basamak sayýsýný giriniz:");
	int basamak = scanner.nextInt();
	
    int gecici = sayi;                    // programda hata çýkmamasý için sayýmýzý geçici sayýya atýyoruz. Ýþlemleri geçici sayý üzerinden gerçekleþtireceðiz.
    int toplam = 0;
    
    do {
    	
    	int basamak_deðeri = gecici %10;          //sayýnýn birler basamaðýný bulmak için 10 ile bölümünden kalaný alýyoruz.
    	gecici = gecici / 10;                    //birler basamaðýndaki sayýyý aldýk ve geçici sayýyý güncellememiz gerekiyor.Bunun için geçici sayýyý 10'a bölüyoruz.
    	toplam += Math.pow(basamak_deðeri, basamak);  //basamak deðerinin basamak sayýsý kadar kuvvetini almak için bu fonksiyonu kullanýyoruz.
    	
    }while(gecici > 0);

     if (sayi == toplam) {    //armstrong sayý olma koþulu
    	 
    	 System.out.println("Bu sayý bir armstrong sayýsýdýr...");
     }
     else {
    	 System.out.println("Bu sayý bir armstrong sayýsý deðildir.."); 
      
     }
     
}

}
