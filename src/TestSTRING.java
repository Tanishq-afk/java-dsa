import java.util.*;

public class TestSTRING {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] flippedArray = new int[10][];
        String ruleValue = "sachdev";
        List<List<String>> listOfLists = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            List<String> inner= new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                inner.add(j, in.nextLine());
            }
            listOfLists.add(inner);
        }
        for (List<String> outer : listOfLists) {
            for(String s : outer) {
                if(s.equals(ruleValue)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}