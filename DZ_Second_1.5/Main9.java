import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println((x * x + y * y <= 1) || (x * x + y * y >= 1 && y <= 1 && y >= 0 && x <= 1 && x >= 0) ? "YES" : "NO");
    }
}