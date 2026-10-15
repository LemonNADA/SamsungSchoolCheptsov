import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 0;

        while (a >= b) {
            a = a - b;
            counter++;
        }

        System.out.println(counter + " " + a);
    }
}