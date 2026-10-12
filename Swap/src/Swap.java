public class Swap {
    public static void main(String[] args) {
        //using temp.
        int a = 1;
        int b = 2;
        System.out.println(a+ " , " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " , " + b);
        //without temp
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " , " + b);
    }
}
