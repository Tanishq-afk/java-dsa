public class PatternExample {
    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 7;

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Determine the number of leading spaces
            int spaces = Math.min(i, 2);

            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces based on the pattern
            if (i < 2) {
                System.out.println("* ");
            } else {
                System.out.println("** ");
            }
        }
    }
}
