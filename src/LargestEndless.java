import java.util.Scanner;

public class LargestEndless {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        long largest = 0;
        while (i < 1) {
            System.out.print("Enter number: ");
            long num = in.nextLong();
            if (num > 0) {
                largest = Math.max(largest, num);
            } else if (num == 0) {
                break;
            }
        }
        System.out.print("The largest no. is: " + largest);
    }
}


