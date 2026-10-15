import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int x = n + 1;

        while (true) {
            int k = 0;
            int i = 2;
            
            while (i < x) {
                if (x % i == 0) {
                    k++;
                }
                i++;
            }

            if (k == 0 && x > 1) {
                System.out.println(x);
                break;
            }
            
            x++;
        }
    }
}