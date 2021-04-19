/*
 Kullanýcýdan alýnan vize ve final notlarýnýn ortalmasýnýn hesaplanmasý 
 ve hesaplanan ortalamaya göre kullanýca harf notunun gösterilmesi.
*/

import java.util.Scanner;

public class Kosulludurumlar2 {
	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	
	System.out.println("Lütfen vize notunuzu girin:");
	int a = scanner.nextInt();
	
	System.out.println("Lütfen final notunuzu girin:");
    int b = scanner.nextInt();
    
    double ortalama = (a * (4 / 10.0 ) + b * (6 / 10.0 ) ); // girilen sayýlarýn tam olarak yüzdeliklerini alabilmek için 10.0 þeklinde bir kullaným gerçekleþtirdik.
    
    System.out.println("Okul ortalamanýzý giriniz: ");
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
	   
	   if (okulort < 1.80) {        //koþullu durumun içinde baþka bir koþulu kontrol etmek için if koþulunu kullandýk.
		   
	   System.out.println("Bu dersten þartlý geçebilmeniz için ortalamanýzýn 2.5 'in üzerinde olmalý!");
	   }
	   
   }
   
   else {
	
	 System.out.println(" Harf Notunuz: FF  \n Bu dersten kaldýnýz!!  ");
	
   
    	
    }
	}

}
