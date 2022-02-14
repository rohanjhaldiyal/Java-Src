import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l = in.nextDouble();
        System.out.print("Enter the breadth: ");
        double b = in.nextDouble();
        double a = l * b;
        System.out.println("Area of the Reactangle is: "+a);
    }
}
