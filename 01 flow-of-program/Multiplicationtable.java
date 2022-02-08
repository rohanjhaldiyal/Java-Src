import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print((n*i)+" ");
        }
    }
}