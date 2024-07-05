import java.util.Arrays;

public class ModifyString {
    public static void main(String[] args) {
        String s = "Tanishq monika";
        String a = "Vanshika";
        int len1 = s.length();
        int len2 = a.length();
        char[] c = a.toCharArray();
        String[] word = s.split("\\s+");
        String x;
        int count = 0;
        for (String string : word) {
            x = string;
            for (int j = 0; j < x.length(); j++) {
                for (int k = 0; k < len2; k++) {
                    if (c[k] == x.charAt(j)) {
                        System.out.println(j + " " + c[k]);

                    }

                }
            }

        }


//        for (int i = 0; i < ; i++) {
//
//        }
//        for (int i = 0; i < len1; i++) {
//            for (int j = 0; j < len2; j++) {
//                if(c[j] == c1[i]) {
//                    System.out.println(j + " " + c1[i]);
//                    count++;
//                }
//            }
//        }
//        System.out.println(s.charAt(7));
//        System.out.println(c1[7]);
//        System.out.println(count);

    }
}
