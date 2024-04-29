
import java.util.Scanner;
public class Chap2_ex217 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Enter first integer: ");
            int number1 = input.nextInt();
    
            System.out.print("Enter second integer: ");
            int number2 = input.nextInt();
    
            System.out.print("Enter third integer: ");
            int number3 = input.nextInt();
    
            int sum = number1 + number2 + number3;
            int average = sum / 3;
            int multipilacation = number1 * number2 * number3;
    
            int smallest = number1;
            if (number2 < smallest) {
                smallest = number2;
            }
            if (number3 < smallest) {
                smallest = number3;
            }
    
            int largest = number1;
            if (number2 > largest) {
                largest = number2;
            }
            if (number3 > largest) {
                largest = number3;
            }
    
            System.out.printf("Sum: %d%n", sum );
            System.out.printf("Average: %d%n", average );
            System.out.printf("Product: %d%n", multipilacation );
            System.out.printf("Smallest: %d%n", smallest);
            System.out.printf("Largest: %d%n", largest);
    
            input.close();
        }
    }
    

