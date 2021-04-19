//Çarpým tablosu oluþturan program.
package Projeler;

public class Proje10 {

	public static void main(String[] args) {
		
    for(int i = 1; i<=10 ; i++) { 
    
    System.out.println("************************************");
    	for(int j = 1; j<=10 ; j++) {
    		
    System.out.println(i + "x" + j + "=" + (i*j));
    }
    System.out.println("************************************");	
    }
	}

}


/*Burada programýn mantýðý þu i=1 olduðunda j de 1 oluyor.
i=1 durumundaki döngü j=10 olana kadar devam ediyor.Daha sonra i=2 oluyor
j yine 1 den baþlýyor ve 10 olana kadar devam ediyor.Döngümüz i=10 ve j=10 olduðunda 
duruyor. */
