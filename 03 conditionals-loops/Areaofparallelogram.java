import java.util.Scanner;

public class Areaofparallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimensions of the base: ");
        double b = in.nextDouble();
        System.out.print("Enter the dimesnsions of the height: ");
        double h = in.nextDouble();
        double area = b * h;
        System.out.println("The area is: " + area);
    }
}
