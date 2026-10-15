import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int counter = 0;

        while (n > 0) {
            n = n / 2;
            counter++;
        }

        System.out.println(counter);
    }
}