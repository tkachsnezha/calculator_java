import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Ошибка: неверный оператор!");
                break;
        }
    }
}
