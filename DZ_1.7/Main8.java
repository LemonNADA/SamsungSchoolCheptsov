import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int result = -1;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                result = digit;
                break;
            }
            n /= 10;
        }

        if (result == -1) System.out.println("NO");
        else System.out.println(result);
    }
}