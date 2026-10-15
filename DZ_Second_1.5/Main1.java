import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(x <= 2 && y <= x && y >= 0 && (x * x + y * y >= 4) ? "YES" : "NO");
    }
}