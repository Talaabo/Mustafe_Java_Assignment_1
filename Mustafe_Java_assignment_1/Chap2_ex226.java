import java.util.Scanner;
public class Chap2_ex226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = input.nextInt();

        if (firstNum % secondNum == 0) {
            System.out.println(firstNum + " is a multiple of " + secondNum);
        } else {
            System.out.println(firstNum + " is not a multiple of " + secondNum);
        }

        input.close();
    }
}
    

