import java.util.Scanner;

public class Calculator {
    private double[] operands = new double[2];
    private Scanner scanner = new Scanner(System.in);

    public double doOperation(double firstNumber, double secondNumber, String operation) {
        return switch (operation) {
            case "1" -> firstNumber + secondNumber;
            case "2" -> firstNumber - secondNumber;
            case "3" -> firstNumber * secondNumber;
            case "4" -> {if (secondNumber != 0) {
                    yield firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("Division by zero!");
                }
            }
            default -> throw new IllegalArgumentException("Invalid Operation!");
        };
    }

    public void performCalculation() {
        System.out.println("Enter your first number");
        operands[0] = scanner.nextDouble();

        System.out.println("Enter your second number");
        operands[1] = scanner.nextDouble();

        System.out.println("Which operation do you want to perform?");
        System.out.println("For sum press 1");
        System.out.println("For subtraction press 2");
        System.out.println("For multiplication press 3");
        System.out.println("For division press 4");

        String operation = scanner.next();

        try {
            double result = doOperation(operands[0], operands[1], operation);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performCalculation();
    }
}
