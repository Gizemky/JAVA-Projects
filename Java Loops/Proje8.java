//Basit ATM program�.

package Projeler;

import java.util.Scanner;

public class Proje8 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
    int bakiye = 1000;
    String islemler = "1.��lem : Bakiye ��renme\n"
    		          +"2.��lem : Para �ekme\n"
    		          +"3.��lem : Para Yat�rma\n"
    		          +"��k�� i�lemi : q";

    System.out.println(islemler);
    System.out.println("*************************************");
    
while(true) { //D�ng� true olduk�a devam edecek kullan� q de�erini girene kadar.
	
	System.out.print("Yapmak istedi�iniz i�lem numaras�n� giriniz: " );
	String islem = scanner.nextLine();
	 
	if (islem.equals("q")) {
		 
     System.out.print("Sistemden ��k�� yap�l�yor...");
	 break;
 }
	 
	else if (islem.equals("1")) {
	
	System.out.println("G�ncel Bakiyeniz: " +bakiye);
	
	
	 
  }
	else if (islem.equals("2")) {
		
    System.out.println("�ekmek istedi�iniz tutar� giriniz:");
    int tutar = scanner.nextInt();
	scanner.nextLine();	//�nt de�eri ald�ktan sonra d�ng� ba�a d�n�p bakiye soracak bunun �n�ne ge�mek i�in bu i�lemi yapt�k.
	    if (tutar > bakiye) { //else if i�inde 2 ko�ul tan�mlamam�z gerekti �nce if daha sonra else ko�ulunu olu�turduk.
				 
		System.out.println("Bakiyeniz yetersiz!\n Bakiyeniz :" + bakiye);
	   }
			 
		else {
				
		bakiye -= tutar;
	    System.out.println("��lem Ba�ar�l�. Yeni Bakiyeniz:" + bakiye);
		}
 }
	
	else if (islem.equals("3")) {
		
		System.out.println("Yat�rmak istedi�iniz tutar� giriniz:");
		int tutar = scanner.nextInt();
		scanner.nextLine();
		
		bakiye+=tutar;
		System.out.println("��lem ba�ar�l�. Yeni bakiyeniz :" + bakiye);
	}
	else {
		
		System.out.println("Ge�ersiz i�lem!");
	}
	
	
}}}
