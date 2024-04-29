
import java.util.Scanner;
public class Chap4_ex417 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int totalMiles = 0;
    int totalGallons = 0;
    int tourCount = 0;
 System.out.println("Enter the miles driven and gallons used (Enter 0 to stop):");

    while (true) {
        System.out.print("Miles driven for trip " + (tourCount + 1) + ": ");
        int miles = scanner.nextInt();
        if (miles == -1) {
            break;
        }

        System.out.print("Gallons used for trip " + (tourCount + 1) + ": ");
        int gallons = scanner.nextInt();
        if (gallons == -1) {
            break;
        }

        double milesPerGallon = (double) miles / gallons;
        System.out.printf("Miles per gallon for trip %d: %.2f%n", (tourCount + 1), milesPerGallon);

        totalMiles += miles;
        totalGallons += gallons;
        tourCount++;
    }

    if (tourCount > 0) {
        double overallMilesPerGallon = (double) totalMiles / totalGallons;
        System.out.printf("%nCombined miles per gallon for all tour: %.2f%n", 
        overallMilesPerGallon);
    } else {
        System.out.println("No trips recorded.");
    }

    scanner.close(); 
}
}

