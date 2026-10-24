public class MyArrays {
    //Write your code here
    public static void minToBegin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int min = arr[minIndex];

        for (int i = minIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = min;
    }
}