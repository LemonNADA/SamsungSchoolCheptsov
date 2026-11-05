import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));

        byte b = (byte) x;
        System.out.println((x == b) ? "YES" : "NO");

        short s = (short) x;
        System.out.println((x == s) ? "YES" : "NO");
    }
}