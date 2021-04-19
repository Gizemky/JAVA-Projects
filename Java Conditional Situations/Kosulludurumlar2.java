/*
 Kullan�c�dan al�nan vize ve final notlar�n�n ortalmas�n�n hesaplanmas� 
 ve hesaplanan ortalamaya g�re kullan�ca harf notunun g�sterilmesi.
*/

import java.util.Scanner;

public class Kosulludurumlar2 {
	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	
	System.out.println("L�tfen vize notunuzu girin:");
	int a = scanner.nextInt();
	
	System.out.println("L�tfen final notunuzu girin:");
    int b = scanner.nextInt();
    
    double ortalama = (a * (4 / 10.0 ) + b * (6 / 10.0 ) ); // girilen say�lar�n tam olarak y�zdeliklerini alabilmek i�in 10.0 �eklinde bir kullan�m ger�ekle�tirdik.
    
    System.out.println("Okul ortalaman�z� giriniz: ");
    double okulort = scanner .nextDouble();
    
    
    if (ortalama >= 90 ) {
	   
	System.out.println("Harf Notunuz : AA");

   }
   
    else if (ortalama >= 95) {
	   
	   System.out.println(" Harf Notunuz : BA ");
	   
   }
   else if (ortalama >= 80) {
	   
	   System.out.println(" Harf Notunuz : BB ");
	   
   }
   
   else if (ortalama >= 70) {
	   
	   System.out.println(" Harf Notunuz : CB ");
	   
   }
   
   else if (ortalama >= 60) {
	   
	   System.out.println(" Harf Notunuz : CC ");
	   
   }
   
   else if (ortalama >= 50) {
	   
	   System.out.println(" Harf Notunuz : DC ");
	   
   }
   
   else if (ortalama >= 40) {
	   
	   System.out.println(" Harf Notunuz : DD  ");
	   
	   if (okulort < 1.80) {        //ko�ullu durumun i�inde ba�ka bir ko�ulu kontrol etmek i�in if ko�ulunu kulland�k.
		   
	   System.out.println("Bu dersten �artl� ge�ebilmeniz i�in ortalaman�z�n 2.5 'in �zerinde olmal�!");
	   }
	   
   }
   
   else {
	
	 System.out.println(" Harf Notunuz: FF  \n Bu dersten kald�n�z!!  ");
	
   
    	
    }
	}

}
