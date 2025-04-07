import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = Scanner.nextInt();
        int sum = a + b;
        System.out.println("The Sum of is " + sum);
    }
}