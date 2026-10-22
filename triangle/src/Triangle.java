import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        if (side1 == side2 && side1 == side3) {
            System.out.println("equilateral Triangle");
        }else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("isosceles Triangle");
        }else{
            System.out.println("scalene Triangle");
        }
    }
}
