import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int Fact = 1;

        for (int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }
        
        System.out.println(Fact);
    }
}