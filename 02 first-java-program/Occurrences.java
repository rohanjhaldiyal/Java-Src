import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter the digit you want to count: ");
        int d = in.nextInt();
        int m = n; int r = 0; int c = 0;
        while(m > 0) {
            r = m % 10;
            if(r == d) {
                c++;
            }            
            m = m / 10;    
        }
        System.out.println(d+" occurs "+c+" times");
    }
}