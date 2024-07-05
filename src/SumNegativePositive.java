import java.util.Scanner;

public class SumNegativePositive {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;
        while(true) {
            System.out.print("Enter number: ");
            int num = in.nextInt();
            if(num==0) {
                break;
            }
            else if(num<0){
                sumNegative += num;
            }
            else if(num%2==0) {
                sumPositiveEven += num;
            }

            else sumPositiveOdd += num;
        }
        System.out.print("The sum is: \nNegative number:  " + sumNegative + "\nPositive even number: " + sumPositiveEven + "\nPositive odd number: " + sumPositiveOdd);
    }
}


