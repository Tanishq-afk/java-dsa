public class SampleInt {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(i);
        int i = 10;
        System.out.println(i);
        {
            //int temp = i;
            i = 22;
            System.out.println(i);
        }
        //int temp = 10;
        System.out.println(i);
    }

    static void check(int x) {
        x *= x;
        System.out.println(i);
        //System.out.println(x);
    }
}
