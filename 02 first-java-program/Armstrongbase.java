import java.util.Scanner;

public class Armstrongbase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int m = n; int r = 0; int s = 0;
        while(m > 0) {
            r = m % 10;
            s = s + r*r*r;
            m = m / 10;
        }
        if(s == n)
            System.out.println(n+" is an Armstrong number");
        else
        System.out.println(n+" is not an Armstrong number");
    }
}