import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int end = arr.length - 1;
        while(end > 0) {
            boolean swapped = false;
            for(int i = 1; i <= end; i++) {
                if(arr[i-1] > arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                    //dev changes
                }
            }
            if(!swapped) {
                break;
            }
            end--;
        }
        System.out.println((Arrays.toString(arr)));
    }

}
