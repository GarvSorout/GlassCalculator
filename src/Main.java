import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the operation");
        char operation = scanner.next().charAt(0);
        System.out.println("Enter the second number");
        double secondNumber = scanner.nextDouble();
        output test = new output(0.0);
        return test.calculator(firstNumber, operation, secondNumber);

    }
}

class output {
    double result;
    //constructor for output class
    public output(Double result){
        this.result = result;
    }
    //method to run the calculation
    public double calculator(double firstNumber, char operation, double secondNumber){
        switch (operation){
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
            case '/':
                if (secondNumber != 0){
                    result = firstNumber / secondNumber;
                }
                else {System.out.println("division by zero is not allowed");
                }
                break;
            default: System.out.println("Invalid operator");



        }
       return result;
    }
}