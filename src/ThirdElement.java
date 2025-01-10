import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> countryName = new ArrayList<>();
        System.out.println("Enter the no. of countries: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            countryName.add(in.nextLine());
        }
        System.out.println(countryName.get(3));
    }
}
