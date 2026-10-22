import java.util.Scanner;

public class Coordinates {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X,y coordinate: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x > 0 && y > 0){
            System.out.println("i");
        }else if(x < 0 && y > 0){
            System.out.println("ii");
        }else if(x < 0 && y < 0){
            System.out.println("iii");
        }else{
            System.out.println("iv");
        }
    }
}
