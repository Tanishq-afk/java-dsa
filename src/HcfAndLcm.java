import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number to find HCF and LCM: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 1;
        for (int i = 1; i <= Math.min(a,b)/2; i++) {
            if(a%i == 0 && b%i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.print("LCM: " + lcm);
        System.out.print("\nHCF: " + hcf);

    }
}
