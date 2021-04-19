//Bir say�n�n armstrong say� olup olmad���n� bulan program.

package Projeler;

import java.util.Scanner;

public class Proje9 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println ("L�tfen bir say� giriniz:");
	int sayi = scanner.nextInt();
	
	System.out.println("L�tfen girdi�iniz say�n�n basamak say�s�n� giriniz:");
	int basamak = scanner.nextInt();
	
    int gecici = sayi;                    // programda hata ��kmamas� i�in say�m�z� ge�ici say�ya at�yoruz. ��lemleri ge�ici say� �zerinden ger�ekle�tirece�iz.
    int toplam = 0;
    
    do {
    	
    	int basamak_de�eri = gecici %10;          //say�n�n birler basama��n� bulmak i�in 10 ile b�l�m�nden kalan� al�yoruz.
    	gecici = gecici / 10;                    //birler basama��ndaki say�y� ald�k ve ge�ici say�y� g�ncellememiz gerekiyor.Bunun i�in ge�ici say�y� 10'a b�l�yoruz.
    	toplam += Math.pow(basamak_de�eri, basamak);  //basamak de�erinin basamak say�s� kadar kuvvetini almak i�in bu fonksiyonu kullan�yoruz.
    	
    }while(gecici > 0);

     if (sayi == toplam) {    //armstrong say� olma ko�ulu
    	 
    	 System.out.println("Bu say� bir armstrong say�s�d�r...");
     }
     else {
    	 System.out.println("Bu say� bir armstrong say�s� de�ildir.."); 
      
     }
     
}

}
