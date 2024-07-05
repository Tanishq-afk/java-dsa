import java.util.Scanner;

public class MilkMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        if (n >= 1 && n <= 1000) {
            boolean isWrongInput = false;
            for (int i = 0; i < n; i++) {
                if (in.hasNextInt()) {
                    arr[i] = in.nextInt();
                }
                else{
                    isWrongInput = true;
                    break;
                }
            }
            if(isWrongInput) {
                System.out.println("Wrong input");
                return;
            }
            for (int i = 0; i < n; i++) {
                int num = arr[i];
                if (num > 0 && num <= Math.pow(50, 5)) {
                    int count = 0, count10 = 0, count7 = 0, count5 = 0, count1 = 0;
                    count10 += num / 10;
                    num %= 10;

                    count7 += num / 7;
                    num %= 7;

                    count5 += num / 5;
                    num %= 5;

                    count1 += num;

                    count = count1 + count5 + count7 + count10;
                    System.out.println("Total-> " + count);

                    if (count10 > 0) {
                        System.out.println("10-> " + count10);
                    }
                    if (count7 > 0) {
                        System.out.println("7-> " + count7);
                    }
                    if (count5 > 0) {
                        System.out.println("5-> " + count5);
                    }
                    if (count1 > 0) {
                        System.out.println("1-> " + count1);
                    }
                } else {
                    System.out.println("wrong input");
                }
            }
        }
    }
}