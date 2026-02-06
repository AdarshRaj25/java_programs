import java.util.Scanner;
public class QuotWIthoutDivision{
    static int divide(int dividend, int divisor) {
        if (divisor==0) 
        throw new ArithmeticException("Divide by zero");
        boolean negative=(dividend<0)^(divisor<0);
        if (dividend<0)
        dividend=~dividend+1;
        if (divisor<0)
        divisor=~divisor+1;
        int quotient=0;
        for (int i=31;i>=0;i--) {
            if ((dividend>>i)>=divisor) {
                dividend=dividend^(divisor<<i);
                quotient|=(1<<i);
            }
        }

        return negative?~quotient+1:quotient;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no to be divided");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("The quotient of two number "+num1+" and "+num2+" is "+divide(num1, num2));
    }
}
