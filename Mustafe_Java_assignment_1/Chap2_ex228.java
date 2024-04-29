import java.util.Scanner;

public class Chap2_ex228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Diameter is %.2f%n", diameter);
        System.out.printf("Circumference is %.2f%n", circumference);
        System.out.printf("Area is %.2f%n", area);

        input.close();
    }
}


