import java.util.Scanner;

public class Areaofisoscelestriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimensions of side: ");
        double a = in.nextDouble();
        System.out.print("Enter dimensions of base: ");
        double b = in.nextDouble();
        double h = Math.sqrt(a * a - (b * b) / 4);
        double area = 0.5 * b * h;
        System.out.println("The Area is: " + area);
    }
}
