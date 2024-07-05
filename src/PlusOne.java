import java.util.Arrays;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int nums = 0;
        for(int i = 0; i < n; i++) {
            nums *= 10;
            nums += digits[i];
        }
        nums += 1;
        //System.out.println(nums);
        int length = (int)(Math.log10(nums)+1);
        //System.out.println(length);
        int[] result = new int[length];
        for(int i = length-1 ; i >= 0; i--) {
            result[i] = nums%10;
           // System.out.println(result[i]);
            nums /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}