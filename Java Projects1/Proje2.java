// Kullanýcýdan alýnan iki deðerin yerine deðiþtirme.
import java.util.Scanner;

public class Proje2 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int birincideger;
		int ikincideger;
		
		System.out.print("Birinci deðeri giriniz:");
		birincideger = scanner.nextInt();
	    
		System.out.print("Ýkinci deðeri giriniz:");
		ikincideger = scanner.nextInt();
		
		
		int gecici = birincideger; // Girdiðimiz sayýyý tutmak için geçici bir deðiþken oluþturmamýz gerekiyor.
		birincideger = ikincideger;
		ikincideger = gecici; // Birinci sayiyi geçici deðiþkenine attýðýmýz için ikinci sayiyi da yer deðiþtirmek amacý ile geçici deðiþkenine atýyoruz.
		
		System.out.println("Deðerler deðiþtirildikten sonra....");
		
		System.out.println("Birinci deðer: " + birincideger + " Ýkinci deðer: " + ikincideger);
		
		
		
		
		 

}
}
