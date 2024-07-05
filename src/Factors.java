import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num) {
            if((num%i)==0) {
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
