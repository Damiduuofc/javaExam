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
	  
	  int latgest = ( a > b) ? ((a>c) ? a :c) : ((b > c) ? b : c);
	  System.out.println("The Largest number is: "+ latgest);
    }  
}  

// condition ? valueIfTrue : valueIfFalse

/* First, it checks if a > b:

If true, it then checks if a > c:

If true, a is the largest
If false, c is the largest


If false (meaning b ≥ a), it then checks if b > c:

If true, b is the largest
If false, c is the largest */ 