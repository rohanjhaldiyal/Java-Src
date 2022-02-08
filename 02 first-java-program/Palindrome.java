import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        if(s.equalsIgnoreCase(r))
            System.out.println(s+" is a palindrome");
        else
        System.out.println(s+ " is not a palindrome");
    }
}
