import java.util.Scanner;

public class Usd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        double inr = in.nextDouble();
        double rate = 0.013;
        double usd = inr*rate;

        System.out.println("The amount in USD is: "+usd);
    }
}