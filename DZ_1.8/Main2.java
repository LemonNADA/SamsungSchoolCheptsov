import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int Sum = 0;
        int Count = 0;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                Sum += arr[i];
                Count++;
            }
        }
        
        if (Count > 0) {
            System.out.println(Sum);
        } else {
            System.out.println("NO");
        }
    }
}
