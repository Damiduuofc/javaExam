import java.util.Scanner;

public class Factorial {
	public static void main (String[] args){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = num.nextInt();
		
		
		int factorial = 1;
		
		for (int i = 1;   i <= number;		i= i + 1){
				factorial = factorial  * i;
		
		
		}
		
		
		System.out.println("Factorial of "+ number + " is: " + factorial);
	}
}