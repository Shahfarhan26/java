import java.util.Scanner;

public class ArTriangle {
    public static void main(String[] args) {
        float height,base;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        height = input.nextFloat();
        System.out.print("Enter the base of the triangle: ");
        base = input.nextFloat();
        System.out.print("Area of the triangle: "+ (0.5*height*base));
    }
}
