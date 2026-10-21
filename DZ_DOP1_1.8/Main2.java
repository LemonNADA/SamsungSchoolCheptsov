import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int TotalSum = 0;
        int CurrentSum = 0;

        for (int i = 1; i <= n; i++) {
            TotalSum += i;
        }

        for (int i = 0; i < n - 1; i++) {
            CurrentSum += arr[i];
        }

        int LostCard = TotalSum - CurrentSum;
        
        System.out.println(LostCard);
    }
}