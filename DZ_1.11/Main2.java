import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Проверяем условия обычным if-else
                if (i + j == n - 1) {
                    System.out.print(1);
                } else if (i + j < n - 1) {
                    System.out.print(0);
                } else {
                    System.out.print(2);
                }

                // Ставим пробел после каждого числа, кроме последнего в строке
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Перенос на новую строку
        }
    }
}