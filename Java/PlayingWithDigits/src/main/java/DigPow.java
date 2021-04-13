public class DigPow {

    public static long digPow(int n, int p) {
        // your code
        if (n < 1 || p < 1) {
            return -1;
        }
        String strNum = Integer.toString(n);
        double result = 0;
        double comparison = 0;
        int power = p;
        //Loop each digit in n
        for (int i = 0; i < strNum.length(); i++) {
            //for each digit calculate n to power of p
            result += Math.pow(Integer.parseInt(Character.toString(strNum.charAt(i))), power);
            //increment copy of p by 1 for each digit
            power++;
        }
        //Calculate comparison value
        comparison = result / n;
        //If not positive or whole number return - 1
        if ((comparison < 1) || !(comparison % 1 == 0)) {
            return -1;
        } else {
            return (long) comparison;
        }
    }
}
