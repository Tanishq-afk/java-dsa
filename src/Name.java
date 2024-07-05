import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if(name.equals("Tanishq")) {
            System.out.println("Hello " + name + " have a great day ahead!");
        }
        else if(name.equals("Monika")) {
            System.out.println("Wow " + name + " have a nice day");
        }
        else System.out.println("Namaste " + name);


    }
}
