import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f*i;
        }
        System.out.println("Facorial of "+n+" is "+f);
    }
}
