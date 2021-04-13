import java.util.stream.IntStream;

public class Kata {
    public static int[] beggars(int[] values, int n) {
        // show me the code!
        if (n == 0) {
            int[] result = {};
            return result;
        } else {
            int[] result = new int[n];
            for (int i = 0; i < values.length; i++) {
                result[i % n] += values[i];
            }
            return result;
        }
    }
}