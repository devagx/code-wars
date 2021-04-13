public class Multiples {
    public int solution(int number) {
        //TODO: Code stuff here
        int result = 0;

        //if number is negtaive return 0
        if (number < 0) {
            return 0;
        }
        //Loop where counter is < number
        for (int i = 1; i < number; i++) {
            //check if number is a multiple of 3 or 5 add to result
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
