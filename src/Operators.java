import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Choose operator (+,-,*,/): ");
        char op = input.next().charAt(0);
        if(op == '+') {
            System.out.println("The addition: "+ (num1+num2));
        }
        else if(op == '-') {
            System.out.println("The subtraction: "+ (num1-num2));
        }
        else if(op == '*') {
            System.out.println("The multiplication: "+ (num1*num2));
        }
        else if(op == '/') {
            System.out.println("The division: "+ (num1/num2));
        }
        else System.out.println("Please choose valid operator.");



    }
}
