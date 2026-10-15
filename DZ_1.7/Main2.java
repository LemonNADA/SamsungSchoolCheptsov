import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x;

        do {
            x = scanner.nextInt();
            if (x > 10) {
                sum += x;
            }
        } while (x % 5 != 0);

        System.out.print(sum);
    }
}