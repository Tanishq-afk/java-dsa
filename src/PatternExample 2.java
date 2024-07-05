class PatternExample2 {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces based on the pattern
            for (int j = 0; j < rows - i - 2; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces based on the pattern
            for (int j = 0; j < 2; j++) {
                if (i < 2 || (j == 1 && i >= 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
