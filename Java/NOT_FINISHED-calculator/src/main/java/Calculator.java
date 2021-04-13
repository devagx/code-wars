import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
    public static void main(String[] args) {
        double x =  Calculator.evaluate("2 / 2 + 3 * 4 - 6");
        System.out.println(x);
    }

    public static Double evaluate(String expression) {
        String[] parts = expression.split("(?=[/*+-])|(?<=[/*+-])");

        double result = Double.parseDouble(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            double val = Double.parseDouble(parts[i+1]);
            switch (op) {
                case "*" :
                    result *= val;
                    break;
                case "/" :
                    result /= val;
                    break;
                case "+" :
                    result += val;
                    break;
                case "-" :
                    result -= val;
                    break;
            }
        }
        return result;
    }
}