import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Number = scanner.nextInt();
        
        if (Number % 100 >= 11 && Number % 100 <= 14) {
            System.out.println(Number + " TORTOV");
        } else if (Number % 10 == 1) {
            System.out.println(Number + " TORT");
        } else if (Number % 10 >= 2 && Number % 10 <= 4) {
            System.out.println(Number + " TORTA");
        } else {
            System.out.println(Number + " TORTOV");
        }
    }
}