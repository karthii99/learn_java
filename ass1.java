import java.util.Scanner;
public class ass1 {
    public static void main(String args[])
    {
        double result;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first operand");
        double a=sc.nextDouble();

        System.out.println("Enter the second operand");
        double b=sc.nextDouble();

        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);

        if (op == '+'){
            System.out.println("Result="+(a+b));
        }
        else if (op =='-'){
            System.out.println("Result="+(a-b));
        }
        else if (op =='*'){
            System.out.println("Result="+(a*b));
        }
        else if (op =='/'){
            System.out.println("Result="+(a/b));
        }
        else{
            System.out.println("Enter a valid operator");
        }
    }
    
}
