import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[30];
        int count = 0;

        for (int i = 0; n > 0; i++) {
            arr[i] = n % 2;
            n = n / 2;
            count = count + 1;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
    }
}
