import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.2f\n", average);
        } else {
            System.out.println("NO");
        }
    }
}
