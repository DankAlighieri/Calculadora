import java.util.Scanner;

public class Calculadora {
    public double[] nums = new double[2];
    Scanner scan = new Scanner(System.in);

    public double doOperation(double firstNumber, double secondNumber, String operation){
        switch (operation) {
            case ("1") : return firstNumber + secondNumber;
            case ("2") : return firstNumber - secondNumber;
            case ("3") : return firstNumber * secondNumber;
            case ("4") : return firstNumber / secondNumber;
        }
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        double result = 0;

        System.out.println("Enter your first number");
        double firstNumber = calculator.scan.nextDouble();
        calculator.nums[0] = firstNumber;

        System.out.println("Enter your second number");
        double secondNumber = calculator.scan.nextDouble();
        calculator.nums[1] = secondNumber;

        System.out.println("Which operation do you want to realize?");
        System.out.println("""
                    For sum press 1\s
                    For subtraction press 2\s
                    For multiplication press 3\s
                    For division press 4\s
                """);
        String operation = calculator.scan.next();

        if(calculator.nums.length > 0) {
            result = calculator.doOperation(firstNumber, secondNumber, operation);
            System.out.println(result);
        }
        else System.out.println("At least one number");

    }
}