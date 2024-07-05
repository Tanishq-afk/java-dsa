import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range between which you want to find the armstrong number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i = num1; i<= num2; i++) {
            int temp = 0;
            int number = i;
            while(number>0) {
                int a = number%10;
                temp = temp+(a*a*a);
                number = number/10;
            }
            if(temp==i) {
                System.out.println(i);
            }
        }
    }
}
