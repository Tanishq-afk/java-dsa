import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the main box (minimum 3): ");
        int n = in.nextInt();

        if (n < 3) {
            System.out.println("Size must be at least 3. Exiting program.");
            return;
        }

        pattern(n);
    }

    public static void pattern(int n) {
        char[][] grid = new char[n][n];

        // Draw outermost box
        drawBox(grid, 0, 0, n - 1, '*');

        // Draw additional nested boxes if applicable
        if (n >= 7) {
            drawBox(grid, 2, 2, n - 3, '*');
        }
        if (n >= 11) {
            drawBox(grid, 4, 4, n - 5, '*');
        }

        // Print the grid
        printGrid(grid);
    }

    // Function to draw a box with given start and end coordinates
    public static void drawBox(char[][] grid, int startX, int startY, int endX, char symbol) {
        for (int i = startX; i <= endX; i++) {
            if (i == startX || i == endX) {
                for (int j = startY; j <= endX; j++) {
                    grid[i][j] = symbol; // Draw top and bottom rows
                }
            } else {
                grid[i][startY] = symbol; // Draw left side
                grid[i][endX] = symbol;   // Draw right side
            }
        }
    }

    // Function to print the grid
    public static void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '*') {
                    System.out.print(grid[i][j]);
                } else {
                    System.out.print(" "); // Print space for empty areas
                }
            }
            System.out.println();
        }
    }
}
