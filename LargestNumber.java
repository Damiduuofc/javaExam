import java.util.*;

public class LargestNumber {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter first number: ");  
        int a = scanner.nextInt();  
        
        System.out.print("Enter Second number: ");  
        int b = scanner.nextInt();
        
        System.out.print("Enter third number: ");  
        int c = scanner.nextInt();
	  
	  int latgest = ( a > b) ? ((a>c) ? a :c) : ((b > c) ? b : c);
	  System.out.println("The Largest number is: "+ latgest);
    }  
}  
