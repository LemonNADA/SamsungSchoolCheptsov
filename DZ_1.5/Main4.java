import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        
        System.out.println((x > 99) && (x < 1000) && (x % 5 == 0) ? true : false);
    }
}