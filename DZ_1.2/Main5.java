import java.util.Scanner;

public class Main5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int hours = (n / 3600) % 24;
        int minuts = (n % 3600) / 60;
        int seconds = n % 60;

        String sMinuts = "" + minuts;
        String sSeconds = "" + seconds;


        if (minuts < 10) {
            sMinuts = "0" + minuts;
        }
        if (seconds < 10) {
            sSeconds = "0" + seconds;
        }

        System.out.println(hours + ":" + sMinuts + ":" + sSeconds);
    }
}