import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        
        System.out.println(x >= 3 && x <= 8 ? true : false);
    }
}