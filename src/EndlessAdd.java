import java.util.Scanner;

public class EndlessAdd {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter number: ");
            int num = in.nextInt();
            if(num>0) {
                sum = sum + num;
            }
            else if(num==0) {
                break;
            }
        }
        System.out.print("The sum is: " + sum);
    }
}
