import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = in.nextInt();
        System.out.print("Enter the value of R: ");
        int r = in.nextInt();
        int factN = 1;
        int factR = 1;
        int factNR = 1;
        if(n>=r && r>=0) {
            System.out.print("Enter 'c' for Combination and 'p' for Permutation: ");
            char check = in.next().charAt(0);
            for(int i = 1; i <= n; i++) {
                factN = factN * i;
            }
            for(int i = 1; i <= r; i++) {
                factR = factR * i;
            }
            for(int i = 1; i <=(n-r); i++) {
                factNR = factNR * i;
            }
            if(check == 'c' || check == 'C') {
                System.out.print("The combination(nCr): " + (factN/(factR * factNR)));
            }
            else if(check == 'p' || check == 'P') {
                System.out.print("The permutation(nPr): " + (factN/factNR));
            }
        }
        else System.out.println("Enter valid values for N and R.");
    }
}
