import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println((y >= 1 - x && x <= 1 && y >= 2 * x * x) || (y >= 1 - x && x <= 1 && x >= 0 && y <= 2 * x * x) ? "YES" : "NO");
    }
}