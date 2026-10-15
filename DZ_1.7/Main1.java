import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        int x = scanner.nextInt();
        counter++;  

        while (x >= 0) {
            x = scanner.nextInt();
            counter++;
        }

        System.out.println(counter);
    }
}