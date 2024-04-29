
public class Chap3_ex312Test {
    public static void main(String[] args) {
        Chap3_ex312 employee1 = new Chap3_ex312("John", "Doe", 5000.0);
        Chap3_ex312 employee2 = new Chap3_ex312("Jane", "Smith", 2000.0); 

        // display each employee's yearly salary
        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: $%.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.printf("%s %s's yearly salary after raise: $%.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary after raise: $%.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
    }
}

