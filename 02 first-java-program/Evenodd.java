import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if(n % 2 == 0)
        System.out.println(n+" is an even number");
        else
        System.out.println(n+" is an odd number");
    }
    
}
