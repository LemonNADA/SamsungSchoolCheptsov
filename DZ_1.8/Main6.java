import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int popular = arr[0];
        int maxcount = 0;
        
        for (int i = 0; i < n; i++) {
            int currentcount = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    currentcount++;
                }
            }
            if (currentcount > maxcount) {
                maxcount = currentcount;
                popular = arr[i];
            }
        }
        
        System.out.println(popular);
    }
}
