import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[][] arr = new long[n][m];

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                arr[i][j] = scanner.nextLong();

        System.out.println(m + " " + n);
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) 
                System.out.print(arr[i][j] + (i > 0 ? " " : ""));
            System.out.println();
        }
    }
}