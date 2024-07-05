import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome in lower case: ");
        String s = input.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome) {
            System.out.println(s + " is palindrome.");
        }
        else System.out.println(s + " is not palindrome");
    }
}
