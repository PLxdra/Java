import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;
        do {
            System.out.println("Enter an expression: ");
            expression = scanner.nextLine();
            if (expression != null && expression.length() > 2) {
                int indexMinus = expression.lastIndexOf("-");
                int indexPlus = expression.lastIndexOf("+");
                int result;
                try {
                    if (indexPlus > 0) {
                        result = Integer.valueOf(expression.substring(0, indexPlus)) + Integer.valueOf(expression.substring(indexPlus + 1));
                    } else {
                        result = Integer.valueOf(expression.substring(0, indexMinus)) - Integer.valueOf(expression.substring(indexMinus + 1));
                    }
                    System.out.println("Result = " + result);
                } catch (Exception e) {
                    System.out.println("Parsing Error");
                }
            }
        } while (!"quit".equals(expression));
    }
}