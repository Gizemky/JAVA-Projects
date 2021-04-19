//Kullanýcýdan alýnan 3 sayý arasýndan maks sayýyý bulma.
import java.util.Scanner;

public class Proje5 {
	public static void main(String[] args) {
		
 
Scanner scanner = new Scanner (System.in);

System.out.println("Birinci sayýyý giriniz:");
int a = scanner.nextInt();

System.out.println("Ýkinci sayýyý giriniz:");
int b = scanner.nextInt();

System.out.println("Üçüncü sayýyý giriniz:");
int c = scanner.nextInt();

int maks = -1; // Buraya -1 vermemizin nedeni javanýn sýkýntý çýkarmasýnýn önüne geçmek. Burasý -1000 de olabilirdi.

/* 
Aþaðýda ki koþullu iþlemlerimizde her sayýyý birbiri ile karþýlaþtýrýyoruz.
Ve maks deðiþkenine atýyoruz.Koþul saðlanýr ise bize maks deðeri dönecek.
*/
if (a >= b && b >=c) { // a'nýn b ve c den büyüklüðünü kontrol ediyoruz.Eðer iki durum da true olursa a maks deðer olarak dönüyor.
	
	maks = a;
}

else if (b >= a && b >= c) {  // b'nin a ve c den büyüklüðünü kontrol ediyoruz.Eðer iki durum da true olursa b maks deðer olarak dönüyor.
	
	maks = b;
	
}

else { // Yukarýda ki durumlar saðlanmýyor ise c en büyük deðer oluyor.
	
	maks = c;
}

System.out.println("Maksimum Sayý:" + maks); 
}

}
