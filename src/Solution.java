import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        System.out.println();Arrays.stream(candies).sorted();
//        int max = 0;
//        Arrays.sort(candies);
//        for (int j : candies) {
//            if (max < j) {
//                max = j;
//            }
//        }
//
//        for (int candy : candies) {
//            if(candy + extraCandies >= max) {
//                ls = true;
//            }
//        }
//        return Collections.singletonList(ls);
//    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int[] wow = candies.clone();
        Arrays.sort(wow);
        System.out.println(Arrays.toString(wow));
        System.out.println(Arrays.toString(candies));

        int extra = 3;
//        List<Boolean> ls = kidsWithCandies(candies, extra);
//        System.out.println(ls);
    }
}