/**
 * This program adds 2 numbers
 * @author Syed Mustafa
 * @version 1.0
 */
import java.util.Scanner; 

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum is : " + sum);
    }
}