import java.util.Scanner;
import java.util.regex.Pattern;

public class containsInRange {

    public static boolean containsAlphabet(String[] arr) {
        Pattern patternRange1 = Pattern.compile("^[a-m]+$");
        Pattern patternRange2 = Pattern.compile("^[N-Z]+$");

        for (String str : arr) {
            if (!(patternRange1.matcher(str).matches() || patternRange2.matcher(str).matches())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            String[] arr = new String[x];
            for (int j = 0; j < x; j++) {
                arr[j] = scanner.next();
            }
            boolean res = containsAlphabet(arr);
            System.out.println(res);
        }
    }
}