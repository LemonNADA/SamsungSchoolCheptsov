import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println((y <= 1 && y >= x - 1 && x >= 0) || (y <= x - 1 && x * x + y * y <= 1) ? "YES" : "NO");
    }
}