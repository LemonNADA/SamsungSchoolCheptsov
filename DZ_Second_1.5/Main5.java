import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(x * x + y * y <= 1 && (y >= x || (x <= 0 && y <= 0)) ? "YES" : "NO");
    }
}