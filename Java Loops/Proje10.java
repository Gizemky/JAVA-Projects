//�arp�m tablosu olu�turan program.
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


/*Burada program�n mant��� �u i=1 oldu�unda j de 1 oluyor.
i=1 durumundaki d�ng� j=10 olana kadar devam ediyor.Daha sonra i=2 oluyor
j yine 1 den ba�l�yor ve 10 olana kadar devam ediyor.D�ng�m�z i=10 ve j=10 oldu�unda 
duruyor. */
