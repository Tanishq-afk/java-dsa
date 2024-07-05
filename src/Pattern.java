import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);

    }
    public static void drawBox(char[][] ch, int n, int startX, int startY, int end) {
        for(int i = startX; i <= end; i++) {
            if (i == startX || i == end) {
                for(int j = startY; j <= end; j++) {
                    ch[i][j] = '*';
                }
            }
            else {
                ch[i][startY] = '*';
                ch[i][end] = '*';
            }
        }

    }
    public static void pattern(int n) {
        char[][] ch = new char[n][n];
        drawBox(ch, n,0, 0, n-1);
        if (n >= 7) {
            drawBox(ch, n,2, 2, n - 3 );
        }
        if (n >= 11) {
            drawBox(ch, n, 4, 4, n - 5);
        }


        for(int i = 0; i < n; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                if(ch[i][j]=='*') {
                    System.out.print(ch[i][j]);
                }
                else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
    }

}
