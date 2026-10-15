import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isAEven = (a % 2 == 0);
        boolean isBEven = (b % 2 == 0);
        boolean isCEven = (c % 2 == 0);

        boolean result = (isAEven && isBEven) || (isAEven && isCEven) || (isBEven && isCEven);

        System.out.println(result);
    }
}