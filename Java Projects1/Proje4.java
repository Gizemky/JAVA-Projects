//Kullan�c�dan al�nan kenar de�erleri ile hipoten�s�n hesaplanmas�.
import java.util.Scanner;

public class Proje4 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int a;
	int b;
	
	System.out.print("��geninizin birinci dik kenar de�erini giriniz:");
	a = scanner.nextInt();
	
	System.out.print("��geninizin ikinci dik kenar de�erini giriniz:");
	b = scanner.nextInt();
	
	double hipoten�s = Math.sqrt(a * a + b * b);
	
	System.out.print("��genin hipoten�s�:" + hipoten�s);
			
		

	}}
