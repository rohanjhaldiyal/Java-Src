import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an year to check: ");
        int year = in.nextInt();
        if(year % 4 == 0)
        System.out.println(year+" is a leap year");
        else
        System.out.println(year+" is not a leap year");
    }
}
