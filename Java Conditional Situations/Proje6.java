// Kullanýcýnýn beden kitle endeksini hesaplama ve kullanýcýya beden kitle indeksinin durumunu gösterme. 
import java.util.Scanner;

public class Proje6 {
	
public static void main(String[] args) {
		
		 
Scanner scanner = new Scanner (System.in);

System.out.println("Lütfen Kilonuzu Girniz:");
int kilo = scanner.nextInt();

System.out.println("Lütfen Boyunuzu Giriniz (1.63 Gibi):");
double boy = scanner.nextDouble();

double bmi = kilo /(boy*boy);
System.out.println("BMI: " + bmi);

if ( bmi < 18.5) {
	
	System.out.println("Zayýf");
	
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
