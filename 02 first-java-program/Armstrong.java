import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i = min+1; i < max; i++) {
            int m = i; int r = 0; int s = 0;
            while(m > 0) {
                r = m % 10;
                s = s + r*r*r;
                m = m / 10;
            }
            if(s == i) 
                System.out.println(i+" is an Armstrong number");          
        }
    }
}

