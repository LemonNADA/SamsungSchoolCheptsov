import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] Arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            Arr[i] = scanner.nextInt();
        }
        
        int X = scanner.nextInt();
        int Index = -1;
        
        for (int i = 0; i < N; i++) {
            if (Arr[i] == X) {
                Index = i + 1;
                break;
            }
        }
        
        if (Index != -1) {
            System.out.println(Index);
        } else {
            System.out.println("NO");
        }
    }
}