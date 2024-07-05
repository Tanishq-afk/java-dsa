import java.util.Arrays;
class MainWow {
    public static void main(String[] args) {
        int[] a = {1, 2, -4, 3, -6};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum values in the array
        for (int num : a) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        int last = max;
        if (min < 0) {
            last = max - min;
        }

        // Print the histogram-like visualization
        System.out.println(last);
        System.out.println(max);
        System.out.print(Arrays.toString(a));
        for (int i = 0; i < last + 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < max) {
                    if (i < max - a[j]) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (i < max - a[j]) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
