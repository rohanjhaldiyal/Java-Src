import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of base: ");
        double b = in.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = in.nextDouble();
        double a = 0.5 * b * h;
        System.out.println("The area os the triangle is: "+a);
    }
}
