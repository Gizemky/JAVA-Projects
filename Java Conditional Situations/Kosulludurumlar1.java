//Kullan�c�dan ald���m�z de�ere g�re kullan�c�ya uyar� mesaj� g�sterme!!
import java.util.Scanner;

public class Kosulludurumlar1 {
	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("L�tfen ya��n�z� girin:");
	int yas = scanner .nextInt();
	
	if (yas >= 18) {
		
	System.out.println("Mekana Giri� Yapabilirisiniz");
		
	
	}
	
	else {
		
	System.out.println("Mekana Giri� Yapamazs�n�z!!");
		
	}
		
		
 }
}
