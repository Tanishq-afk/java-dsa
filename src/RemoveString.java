import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s2;
        s2 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s2);
    }
}
