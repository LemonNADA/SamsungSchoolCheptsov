import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println(y >= 0 && y <= 0.5 && y <= Math.sin(x) && x >= 0 && x <= Math.PI ? "YES" : "NO");
    }
}