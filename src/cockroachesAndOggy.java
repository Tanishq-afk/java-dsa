import java.util.Scanner;

public class cockroachesAndOggy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(Math.abs(x - z) == Math.abs(y - z)) {
            System.out.println("Oggy O");
        } else if(Math.abs(x - z) < Math.abs(y - z)) {
            System.out.println("Cockroach C1");
        } else {
            System.out.println("Cockroach C2");
        }
    }
}
