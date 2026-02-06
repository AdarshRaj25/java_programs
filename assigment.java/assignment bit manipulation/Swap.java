import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no to be swapped");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.print("The swap of two number "+num1+" and "+num2+" is "+num1+","+num2);
    }
}