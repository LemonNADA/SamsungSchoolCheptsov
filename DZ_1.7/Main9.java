import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int min = 10;

        while (n > 0) {
            if (n % 10 < min && n % 10 != 0) {
                min = n % 10;
            }
            n /= 10;
        }
        System.out.println(min);
    }
}