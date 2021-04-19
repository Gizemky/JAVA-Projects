//Kullanýnýn yakýt kullanýmýnýn ve km baþýna harcadýðý yakýtýn hesaplanmasý.
import java.util.Scanner;

public class Proje3 {
public static void main(String[] args) {
	
	  
	    
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the volume of your fuel tank:");
		int volume = scanner.nextInt();
		System.out.print("Please enter your current fuel usage amount (Like 0,25):");
		double fuel = scanner.nextDouble();
		System.out.print("Please enter how many kilometers you traveled by car:");
		double km = scanner.nextDouble();
		
		double fuelburned = (volume*fuel);
		double remainingfuel = volume-fuelburned;
	    double kmfuel = fuelburned/km;
	    
	    System.out.println("Your spent fuel:"+fuelburned);
	    System.out.println("your remaining fuel in your tank:"+remainingfuel);
	    System.out.println("Fuel burned per km:"+kmfuel);
				
		
		
		

}
}
