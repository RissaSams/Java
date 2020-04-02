public class Calculator {
    public static void main(String[] args) {
        while (true) {
            double num1, num2, answer;
            String operator;
            num1 = Utils.getDouble("Enter #1 ");
            num2 = Utils.getDouble("Enter #2 ");
            operator = Utils.getInput("Enter a math operator: ");
            answer = calculate(num1, num2, operator);
            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
        }
    }
    public static  double calculate(double num1, double num2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                break;
            case "abs":
                result = Math.abs(num1);
                break;
            case "age":
                result = num1 * 365.24 * 24 * 60 * 60;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
