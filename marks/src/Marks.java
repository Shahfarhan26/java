import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = input.nextInt();
        if(marks> 90){
            System.out.println(" O grade");
        }else if(marks<90 && marks>80){
            System.out.println(" A grade");
        }else if(marks<80 && marks>70){
            System.out.println(" B grade");
        }else if(marks<70 && marks>60){
            System.out.println(" C grade");
        }else if(marks<60 && marks>50){
            System.out.println(" D grade");
        }else if(marks<40){
            System.out.println(" Fail");
        }
    }
}
