public class Dartboard {

    public String getScore(double x, double y)
    {
        double result = Math.sqrt((x * x) + (y * y));
        int[] scores = new int[]{20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5};

        //Bull's eye: `12.70 mm`
        if ((result < 12.70 / 2)) {
            return "DB";
        }
        //Bull: `31.8 mm`
        if ((result < 31.8 / 2)) {
            return "SB";
        }
        //Double ring outer circle: `340 mm`
        if ((result > 340 / 2)) {
            return "X";
        }

        double a = Math.atan2(x, y);
        int i = (int) (20.5 + a * 10.0 / Math.PI);
        i %= 20;

        String prefix = "";
        if (result > 198 / 2 && result < 214 / 2) prefix = "T";
        if (result > 324 / 2 && result < 340 / 2) prefix = "D";

        return prefix + scores[i];
    }
}