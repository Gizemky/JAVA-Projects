//Swicth Case Ýle Basit Hesap Makinesi.....
import java.util.Scanner;

public class Proje7 {
	 public static void main(String[] args) {
		    
Scanner scanner=new Scanner(System.in);

String islemler = "1 Numaralý Ýþlem Toplama\n" 
                + "2 Numaralý Ýþlem Çýkarma\n" 
		        + "3 Numaralý Ýþlem Çarpma \n" 
                + "4 Numaralý Ýþlem Bölme\n";
System.out.println(islemler);
System.out.println("-------------------------------------------------");
System.out.println("Ýþlem yapmak istediðiniz birinci sayýyý giriniz: ");
int a = scanner.nextInt();

System.out.println("Ýþlem yapmak istediðiniz ikinci sayýyý giriniz: ");
int b = scanner.nextInt();

System.out.println("Yapmak Ýstediðiniz iþlemin numarasýný girin: ");
int islem = scanner.nextInt();


switch (islem) {

case 1:

 System.out.println("Toplama :" + (a + b));
break;
case 2:

	 System.out.println("Çýkarma :" + (a - b));
break;
case 3:

	 System.out.println("Çarpma :" + (a * b));
break;	 
case 4:

	 System.out.println("Bölme :" + ((double)a /b));
	 
break;

default:
System.out.println("Geçersiz iþlem numarasý girdiniz!");


}
}
}
