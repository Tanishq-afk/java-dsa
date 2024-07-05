public class EvenDayOut {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 31; i += 2) {
            count++;
        }
        System.out.println(count);
    }
}
