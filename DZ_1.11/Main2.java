import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(1 + " ");
                } else if (i + j < n - 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
            System.out.println();
        }
    }
}