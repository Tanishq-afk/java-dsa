public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ans = flooring(arr, target);
        System.out.println(ans);
    }
    static int flooring(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(target  == arr[mid]) {
                return arr[mid];
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

}
