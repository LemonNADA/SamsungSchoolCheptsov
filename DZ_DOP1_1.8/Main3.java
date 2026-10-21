import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int[][] Vasya = new int[n][n];
        int[][] Petya = new int[n][n];

        int CurrentV = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Vasya[i][j] = CurrentV;
                CurrentV++;
            }
        }

        int CurrentP = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                Petya[i][j] = CurrentP;
                CurrentP++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Vasya[i][j] == Petya[i][j]) {
                    System.out.print(Vasya[i][j] + " ");
                }
            }
        }
    }
}