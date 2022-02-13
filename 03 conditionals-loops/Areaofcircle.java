import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = in.nextInt();
        double a = 3.14 * r * r;
        System.out.println("Area of the Circle is: "+a);
    }
}
