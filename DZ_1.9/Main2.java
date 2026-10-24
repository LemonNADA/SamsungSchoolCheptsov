public class NumberDigits {
    //Write your code here
    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            if(i > 9 && i < 100 && i % 7 == 0) {
                int i_copy = i;
                while(i_copy != 0) {
                    sum += i_copy % 10;
                    i_copy = i_copy / 10;
                }
            }
        }
        return sum;
    }
}