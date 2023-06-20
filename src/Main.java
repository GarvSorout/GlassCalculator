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

    }
}

