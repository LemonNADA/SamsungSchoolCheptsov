import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(x * x + y * y <= 1 && (y <= x || y >= -x) ? "YES" : "NO");
    }
}