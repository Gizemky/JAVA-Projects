// Kullan�c�n�n beden kitle endeksini hesaplama ve kullan�c�ya beden kitle indeksinin durumunu g�sterme. 
import java.util.Scanner;

public class Proje6 {
	
public static void main(String[] args) {
		
		 
Scanner scanner = new Scanner (System.in);

System.out.println("L�tfen Kilonuzu Girniz:");
int kilo = scanner.nextInt();

System.out.println("L�tfen Boyunuzu Giriniz (1.63 Gibi):");
double boy = scanner.nextDouble();

double bmi = kilo /(boy*boy);
System.out.println("BMI: " + bmi);

if ( bmi < 18.5) {
	
	System.out.println("Zay�f");
	
}

else if ( bmi >=18.5 && bmi < 25) { 
	
	System.out.println("Normal");
}

else if ( bmi >=25 && bmi < 30) { 
	
	System.out.println("Fazla Kilolu");
}

else {
	System.out.println("Obez");
}


}
}
