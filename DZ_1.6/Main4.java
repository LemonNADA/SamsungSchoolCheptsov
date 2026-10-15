import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        
        if (A == 0) {
            if (B > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else if (A > 0) {
            if (B > 0) {
                System.out.println("any x");
            } else {
                float k = (float) -B / A;
                System.out.printf(Locale.US, "x<-%.1f or x>%.1f\n", k, k);
            }
        } else {
            if (B <= 0) {
                System.out.println("no such x");
            } else {
                float k = (float) -B / A;
                System.out.printf(Locale.US, "-%.1f<x<%.1f\n", k, k);
            }
        }
    }
}
