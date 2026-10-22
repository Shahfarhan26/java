
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        double basicSalary = input.nextDouble();

        double da = 0.5 * basicSalary;
        double hra = 0.2 * basicSalary;
        double pf = 0.11 * basicSalary;

        double allow = 0;
        char grade;

        if (basicSalary > 40000) {
            grade = 'a';
        } else if (basicSalary >= 20000) {
            grade = 'b';
        } else {
            grade = 'c';
        }

        if (grade == 'a') {
            allow = 1700;
        } else if (grade == 'b') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double totalSalary = basicSalary + hra + da + allow - pf;

        System.out.println("Grade: " + grade);
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}
