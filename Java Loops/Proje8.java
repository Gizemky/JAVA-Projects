//Basit ATM programý.

package Projeler;

import java.util.Scanner;

public class Proje8 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
    int bakiye = 1000;
    String islemler = "1.Ýþlem : Bakiye Öðrenme\n"
    		          +"2.Ýþlem : Para Çekme\n"
    		          +"3.Ýþlem : Para Yatýrma\n"
    		          +"Çýkýþ iþlemi : q";

    System.out.println(islemler);
    System.out.println("*************************************");
    
while(true) { //Döngü true oldukça devam edecek kullaný q deðerini girene kadar.
	
	System.out.print("Yapmak istediðiniz iþlem numarasýný giriniz: " );
	String islem = scanner.nextLine();
	 
	if (islem.equals("q")) {
		 
     System.out.print("Sistemden çýkýþ yapýlýyor...");
	 break;
 }
	 
	else if (islem.equals("1")) {
	
	System.out.println("Güncel Bakiyeniz: " +bakiye);
	
	
	 
  }
	else if (islem.equals("2")) {
		
    System.out.println("Çekmek istediðiniz tutarý giriniz:");
    int tutar = scanner.nextInt();
	scanner.nextLine();	//Ýnt deðeri aldýktan sonra döngü baþa dönüp bakiye soracak bunun önüne geçmek için bu iþlemi yaptýk.
	    if (tutar > bakiye) { //else if içinde 2 koþul tanýmlamamýz gerekti önce if daha sonra else koþulunu oluþturduk.
				 
		System.out.println("Bakiyeniz yetersiz!\n Bakiyeniz :" + bakiye);
	   }
			 
		else {
				
		bakiye -= tutar;
	    System.out.println("Ýþlem Baþarýlý. Yeni Bakiyeniz:" + bakiye);
		}
 }
	
	else if (islem.equals("3")) {
		
		System.out.println("Yatýrmak istediðiniz tutarý giriniz:");
		int tutar = scanner.nextInt();
		scanner.nextLine();
		
		bakiye+=tutar;
		System.out.println("Ýþlem baþarýlý. Yeni bakiyeniz :" + bakiye);
	}
	else {
		
		System.out.println("Geçersiz iþlem!");
	}
	
	
}}}
