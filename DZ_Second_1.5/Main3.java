import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(y <= 2 - x * x && ((x >= 0 && y >= 0) || (x < 0 && y >= x)) ? "YES" : "NO");
    }
}