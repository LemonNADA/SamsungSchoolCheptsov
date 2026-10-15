import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = 4 + i * 3;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
