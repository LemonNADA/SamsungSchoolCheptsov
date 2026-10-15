import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int sum = 0;

        while (x >= 10 && x <= 99) {
            sum += x % 10 + x / 10;
            x = scanner.nextInt();
        }

        System.out.println(sum);
    }
}