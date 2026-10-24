public class MyArrays {
    //Write your code here
    public static double avgOf4Digit(int[] arr) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 999 && arr[i] < 10000) {
                sum += arr[i];
                count += 1;
            }
        }
        
        if(count == 0) {
            return -1;
        }
        
        return (double) sum / count;
    }
}