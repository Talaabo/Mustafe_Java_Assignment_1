
import java.util.Scanner;
public class Chap2_ex232{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int negativeCount = 0;
    int positiveCount = 0;
    int zeroCount = 0;

    for (int i = 0; i < 5; i++) {
        System.out.printf("Enter number %d: ", i + 1);
        int number = input.nextInt();

        if (number < 0) {
            negativeCount++;
        } else if (number > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }
    }

    System.out.printf("Number of negative numbers: %d%n", negativeCount);
    System.out.printf("Number of positive numbers: %d%n", positiveCount);
    System.out.printf("Number of zeros: %d%n", zeroCount);

    input.close();
}
}

