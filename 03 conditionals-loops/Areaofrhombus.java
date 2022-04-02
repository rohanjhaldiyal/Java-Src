import java.util.Scanner;

public class Areaofrhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimension of the side: ");
        double a = in.nextDouble();
        double area = a * a;
        System.out.println("The area is: " + area);
    }
}
