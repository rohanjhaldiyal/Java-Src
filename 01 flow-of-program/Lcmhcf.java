import java.util.Scanner;

public class Lcmhcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int max = Math.max(a, b);
        int hcf = 0; int lcm = 0;
        for (int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0)
            hcf = i;
        }
        System.out.println("HCF is: "+hcf);
        while(true){
            if(max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            else
            max++;
        }
        System.out.println("LCM is: "+lcm);
    }
}
