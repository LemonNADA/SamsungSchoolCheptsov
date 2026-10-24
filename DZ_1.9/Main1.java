public class NumberDigits {
    //Write your code here
    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}