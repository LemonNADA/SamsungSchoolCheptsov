import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Number = scanner.nextInt();
        
        if (Number >= 0 && Number < 10) {
            System.out.println("DIGIT");
        } else if (Number >= 10 && Number < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}