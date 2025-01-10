import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix (n) : ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the square matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
