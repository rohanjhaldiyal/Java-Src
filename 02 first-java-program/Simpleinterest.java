import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = in.nextInt();
        System.out.print("Enter the rate %: ");
        int r = in.nextInt();
        System.out.print("Enter the time in years: ");
        int t = in.nextInt();
        double si = (p*r*t)/100;
        System.out.println("The Simple Interest is: "+si);
    }
}
