import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Choose an operator (+,-,*,/): ");
        char op = in.next().trim().charAt(0);
        if(op == '+')
            System.out.println(a+b);
        else if(op == '-')
            System.out.println(a-b);
        else if(op == '*')
            System.out.println(a*b);   
        else if(op == '/')
            System.out.println(a/b);     
    }
}
