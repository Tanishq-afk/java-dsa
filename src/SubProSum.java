import java.util.Scanner;

public class SubProSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int num = in.nextInt();
        int pro = 1;
        int sum = 0;
        while(num>0) {
            int i = num % 10;
            pro = pro * i;
            sum = sum + i;
            num /= 10;
        }
        System.out.print("Value of difference between sum and product is: " + (Math.abs(pro-sum)));
    }
}
