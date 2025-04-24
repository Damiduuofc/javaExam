import java.util.Scanner;

public class VowelChecker {
	
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an alphabet: ");
	char alphabet = scanner.next().charAt(0);

	alphabet = Character.toLowerCase(alphabet);

	if (isVowel(alphabet)){
		System.out.println(alphabet + " is a vowel.");
	}else {System.out.println(alphabet + " is not a vowel.");
	}
	}
	public static boolean isVowel (char alphabet){
		return alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u';
	}
}