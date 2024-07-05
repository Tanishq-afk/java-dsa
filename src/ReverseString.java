import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.print("Reversed String: " + reversed);
    }
}
