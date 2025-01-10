public class Compare {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,3,2,1};
        boolean[] found = new boolean[4];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    found[i] = true;
                }
                else {
                    found[i] = false;
                }
            }
        }
        for (int i = 0; i < found.length; i++) {
            if(found[i] == false) {
                System.out.println("Not Equal");
            }
        }
        System.out.println("Equal");
    }
}
