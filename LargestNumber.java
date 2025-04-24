import java.util.Scanner;

public class LargestNumber {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter first number: ");  
        int a = scanner.nextInt();  
        
        System.out.print("Enter Second number: ");  
        int b = scanner.nextInt();
        
        System.out.print("Enter third number: ");  
        int c = scanner.nextInt();

       System.out.print("Enter fourth number: ");
        int d = scanner.nextInt(); 
	  
        int latgest1 = Math.max(Math.max(Math.max(a,b),c),d);
        int largest2 = Math.max(Math.max(a, b), c);

	  System.out.println("The Largest in 4 number is: "+ latgest1);
	  System.out.println("The Largest in 3 number is: "+ largest2);

    }  
}  

