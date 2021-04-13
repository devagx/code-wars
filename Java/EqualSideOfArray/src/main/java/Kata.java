
public class Kata {
    public static int findEvenIndex(int[] arr) {
        // your code
        int leftSum = 0;
        int rightSum = 0;

        //Check if total right side = left side empty array
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }
        if (leftSum == rightSum) {
            return 0;
        }
        for (int l = 0; l < arr.length; l++) {
            leftSum += arr[l];
            rightSum = 0;
            for (int r = arr.length - 1; r > l + 1; r--) {
                rightSum += arr[r];
            }
            if (leftSum == rightSum) {
                return l + 1;
            }
        }
        return -1;
    }
}