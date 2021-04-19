//Vücut kitle indeksini hesaplanmasý.
import java.util.Scanner;
  
public class Proje1 {
	
        public static void main(String[] args) {
	    
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Please enter your weight:");
		int weight = scanner.nextInt();
		
		System.out.print("Please enter your height(Like 1,60):");
		double height = scanner.nextDouble();
		
		double index = weight /(height*height) ;
		
		System.out.print("Body mass index:"+ index);
		
		}
	}


