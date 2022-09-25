import java.lang.reflect.Constructor;
import java.util.Scanner;

public class UserInteraction {

    private Scanner scanner;
    private Arithmetic arithmetic;

    public UserInteraction() {
        scanner = new Scanner(System.in);
        arithmetic = new Arithmetic();
    }

    public void getUsersEntry() {
        System.out.println("Enter the first number");
        double numberOne = scanner.nextDouble();

        System.out.println("Enter the second number");
        double numberTwo = scanner.nextDouble();

        System.out.println("Choose one of the following operators: +, - , *, /");
        char operator = scanner.next().charAt(0);

        usersChoice(numberOne, numberTwo, operator);
    }

    private void usersChoice(double numberOne, double numberTwo, char operator) {
        switch(operator) {
            case '+':
                System.out.println(arithmetic.addition(numberOne, numberTwo));
                break;
            case '-':
                System.out.println(arithmetic.subtraction(numberOne, numberTwo));
                break;
            case '*':
                System.out.println(arithmetic.multiply(numberOne, numberTwo));
                break;
            case '/':
                System.out.println(arithmetic.division(numberOne, numberTwo));
                break;
            default:
                System.out.println("Invalid input operator");
        }
    }
    
}
