public class NumberDigits {
    //Write your code here
    public static int sumOfThirteen(int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int i_copy = i;
            while(i_copy != 0) {
                sum += i_copy % 10;
                i_copy /= 10;
            }
            if(sum % 13 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
