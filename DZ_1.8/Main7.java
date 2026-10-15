import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] res = new int[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                res[index] = arr[i];
                index++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[index] = arr[i];
                index++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}