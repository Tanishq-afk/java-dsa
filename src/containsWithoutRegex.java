import java.util.Scanner;
public class containsWithoutRegex {
    public static boolean containsAlphabet(String[] arr) {
        for (String str : arr) {
            for (char c : str.toCharArray()) {
                if (!((c >= 'a' && c <= 'm') || (c >= 'N' && c <= 'Z'))) {
                    return false;
                }
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
