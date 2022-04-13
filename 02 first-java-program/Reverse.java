import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int m = n;
        int rev = 0;
        while (m > 0) {
            int rem = m % 10;
            rev = rev * 10 + rem;
            m = m / 10;
        }
        System.out.println("The reverse is: " + rev);
    }
}
