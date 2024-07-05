public class Count {
    public static void main(String[] args) {
        int n = 1385757879;
        int temp = 0;
        int count =0;
        while(n>0) {
            temp = n % 10;
            if (temp == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
