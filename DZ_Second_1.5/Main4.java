import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(y >= x * x - 2 && ((x <= 0 && y <= -x) || (x > 0 && y <= x)) ? "YES" : "NO");
    }
}