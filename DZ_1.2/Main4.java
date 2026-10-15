import java.util.Scanner;

public class Main4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int rub = scanner.nextInt();
        int cop = scanner.nextInt();
        int n = scanner.nextInt();

        int priceInCop = rub * 100 + cop;
        int fullPriceInCop = priceInCop * n;

        System.out.println(fullPriceInCop / 100 + " " + fullPriceInCop % 100);
    }
}