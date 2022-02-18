import java.util.Scanner;

public class Sumall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        while(true) {
            int n = in.nextInt();
            if(n == 0)
                break;
            else
                s = s+n;
        }
        System.out.println("The Sum is: "+s);
    }
}
