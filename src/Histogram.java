
public class Histogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, -4, 3, -6};
        int[] newArr = arr.clone();
        int max = 0;
        for (int value : arr) {
            max = Math.max(max, value);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = max + Math.abs(arr[i]);
            }
        }
        int newMax = 0;
        for (int k : arr) {
            newMax = Math.max(newMax, k);
        }

        for (int i = 0; i < newMax+1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i < max) {
                    if(i < max - newArr[j]) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if(i < max - newArr[j]) {
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

