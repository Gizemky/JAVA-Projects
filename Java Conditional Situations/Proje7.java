//Swicth Case �le Basit Hesap Makinesi.....
import java.util.Scanner;

public class Proje7 {
	 public static void main(String[] args) {
		    
Scanner scanner=new Scanner(System.in);

String islemler = "1 Numaral� ��lem Toplama\n" 
                + "2 Numaral� ��lem ��karma\n" 
		        + "3 Numaral� ��lem �arpma \n" 
                + "4 Numaral� ��lem B�lme\n";
System.out.println(islemler);
System.out.println("-------------------------------------------------");
System.out.println("��lem yapmak istedi�iniz birinci say�y� giriniz: ");
int a = scanner.nextInt();

System.out.println("��lem yapmak istedi�iniz ikinci say�y� giriniz: ");
int b = scanner.nextInt();

System.out.println("Yapmak �stedi�iniz i�lemin numaras�n� girin: ");
int islem = scanner.nextInt();


switch (islem) {

case 1:

 System.out.println("Toplama :" + (a + b));
break;
case 2:

	 System.out.println("��karma :" + (a - b));
break;
case 3:

	 System.out.println("�arpma :" + (a * b));
break;	 
case 4:

	 System.out.println("B�lme :" + ((double)a /b));
	 
break;

default:
System.out.println("Ge�ersiz i�lem numaras� girdiniz!");


}
}
}
