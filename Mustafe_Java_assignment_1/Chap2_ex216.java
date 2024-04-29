import java.util.Scanner;
public class Chap2_ex216 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstnum = input.nextInt();
        System.out.print("Enter the second integer: ");
        int secondnum = input.nextInt();
        if (firstnum > secondnum) {
            System.out.println(firstnum + " is larger");
        } else if (secondnum > firstnum) {
            System.out.println(secondnum + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
        
        input.close();
    }
}
