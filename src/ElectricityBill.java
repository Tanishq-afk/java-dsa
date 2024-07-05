import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        double amount = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units: ");
        int units = in.nextInt();
        if(units<=100) {
            amount = units*2.5;
        }
        else if(units<=200) {
            amount = units*3.5;
        }
        else if(units<=300) {
            amount = units*4.5;
        }
        else if(units<300) {
            amount = units*7;
        }
        else System.out.println("Enter valid amount");
        System.out.print("Your electricity bill is: " + amount);
    }
}
