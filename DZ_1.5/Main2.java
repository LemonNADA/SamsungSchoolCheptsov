import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        
        System.out.println((x >= -3 && x <= 5) || (x >= 9 && x <= 15) ? true : false);
    }
}