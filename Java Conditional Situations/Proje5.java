//Kullan�c�dan al�nan 3 say� aras�ndan maks say�y� bulma.
import java.util.Scanner;

public class Proje5 {
	public static void main(String[] args) {
		
 
Scanner scanner = new Scanner (System.in);

System.out.println("Birinci say�y� giriniz:");
int a = scanner.nextInt();

System.out.println("�kinci say�y� giriniz:");
int b = scanner.nextInt();

System.out.println("���nc� say�y� giriniz:");
int c = scanner.nextInt();

int maks = -1; // Buraya -1 vermemizin nedeni javan�n s�k�nt� ��karmas�n�n �n�ne ge�mek. Buras� -1000 de olabilirdi.

/* 
A�a��da ki ko�ullu i�lemlerimizde her say�y� birbiri ile kar��la�t�r�yoruz.
Ve maks de�i�kenine at�yoruz.Ko�ul sa�lan�r ise bize maks de�eri d�necek.
*/
if (a >= b && b >=c) { // a'n�n b ve c den b�y�kl���n� kontrol ediyoruz.E�er iki durum da true olursa a maks de�er olarak d�n�yor.
	
	maks = a;
}

else if (b >= a && b >= c) {  // b'nin a ve c den b�y�kl���n� kontrol ediyoruz.E�er iki durum da true olursa b maks de�er olarak d�n�yor.
	
	maks = b;
	
}

else { // Yukar�da ki durumlar sa�lanm�yor ise c en b�y�k de�er oluyor.
	
	maks = c;
}

System.out.println("Maksimum Say�:" + maks); 
}

}
