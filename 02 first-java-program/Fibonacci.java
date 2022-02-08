import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a = 0; int b = 1; int c = 0;
        System.out.print(a+" "+b+" ");
        for (int i = 3; i <=n; i++) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
