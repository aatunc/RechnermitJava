import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie die erste Zahl ein:");
        num1 = input.nextDouble();

        System.out.println("Bitte geben Sie den Operator ein (+, -, *, /):");
        operator = input.next().charAt(0);

        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        num2 = input.nextDouble();

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ungültiger Operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
