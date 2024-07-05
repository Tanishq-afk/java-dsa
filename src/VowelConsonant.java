import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character to check: ");
        String str = in.nextLine().toLowerCase();
        if(str.length() != 1 || !Character.isLetter(str.charAt(0))) {
            System.out.println("Invalid input.");
        }
        char lch = str.charAt(0);
        if(lch == 'a' || lch == 'e' || lch == 'i' || lch == 'o' || lch == 'u' ) {
            System.out.print(lch + " is a vowel.");
        }
        else System.out.println(lch + " is consonant.");
    }
}
