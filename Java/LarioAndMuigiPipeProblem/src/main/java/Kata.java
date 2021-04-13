public class Kata {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int startVal = numbers[0];
        int endVal = numbers[numbers.length - 1];
        int loopVal = endVal - startVal + 1;

        int[] res = new int[loopVal];

        for (int i = 0; i < loopVal; i++) {
            if (i == 0) {
                res[i] = numbers[0];
            } else {
                res[i] = res[i - 1] + 1;
            }
        }
        return res;
    }
}