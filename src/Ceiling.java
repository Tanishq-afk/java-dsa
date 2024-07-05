public class Ceiling {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'l';
        char ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static char ceiling(char[] arr, char target) {
        if(target >= arr[arr.length - 1]) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
//            if(target  == arr[mid]) {
//                return mid;
//            }
            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start% arr.length];
    }
}
