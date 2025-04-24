import java.util.Scanner;

public class ReversNumber {
	public static void main (String[] args){
		Scanner num = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int number = num.nextInt();
		int reverse = 0;
		
		while (number != 0){
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
			System.out.println("Reversed number is : " + reverse );
	}
}