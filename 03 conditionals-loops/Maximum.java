import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0)
                break;
            else {
                if (n > max)
                    max = n;
            }
        }
        System.out.println("The Largest No. is: " + max);
    }
}
