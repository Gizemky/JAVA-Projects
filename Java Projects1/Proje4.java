//Kullanýcýdan alýnan kenar deðerleri ile hipotenüsün hesaplanmasý.
import java.util.Scanner;

public class Proje4 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int a;
	int b;
	
	System.out.print("Üçgeninizin birinci dik kenar deðerini giriniz:");
	a = scanner.nextInt();
	
	System.out.print("Üçgeninizin ikinci dik kenar deðerini giriniz:");
	b = scanner.nextInt();
	
	double hipotenüs = Math.sqrt(a * a + b * b);
	
	System.out.print("Üçgenin hipotenüsü:" + hipotenüs);
			
		

	}}
