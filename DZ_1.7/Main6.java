import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int sum = 0;
        int i = 26;

        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println(sum);
    }
}