// Kullan�c�dan al�nan iki de�erin yerine de�i�tirme.
import java.util.Scanner;

public class Proje2 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int birincideger;
		int ikincideger;
		
		System.out.print("Birinci de�eri giriniz:");
		birincideger = scanner.nextInt();
	    
		System.out.print("�kinci de�eri giriniz:");
		ikincideger = scanner.nextInt();
		
		
		int gecici = birincideger; // Girdi�imiz say�y� tutmak i�in ge�ici bir de�i�ken olu�turmam�z gerekiyor.
		birincideger = ikincideger;
		ikincideger = gecici; // Birinci sayiyi ge�ici de�i�kenine att���m�z i�in ikinci sayiyi da yer de�i�tirmek amac� ile ge�ici de�i�kenine at�yoruz.
		
		System.out.println("De�erler de�i�tirildikten sonra....");
		
		System.out.println("Birinci de�er: " + birincideger + " �kinci de�er: " + ikincideger);
		
		
		
		
		 

}
}
