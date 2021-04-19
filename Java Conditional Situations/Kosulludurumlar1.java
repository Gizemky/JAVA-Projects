//Kullanýcýdan aldýðýmýz deðere göre kullanýcýya uyarý mesajý gösterme!!
import java.util.Scanner;

public class Kosulludurumlar1 {
	
	public static void main (String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Lütfen yaþýnýzý girin:");
	int yas = scanner .nextInt();
	
	if (yas >= 18) {
		
	System.out.println("Mekana Giriþ Yapabilirisiniz");
		
	
	}
	
	else {
		
	System.out.println("Mekana Giriþ Yapamazsýnýz!!");
		
	}
		
		
 }
}
