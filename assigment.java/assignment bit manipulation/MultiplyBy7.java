import java.util.Scanner;
public class MultiplyBy7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        int result=(x<<3)-x;
        System.out.println("Result = " + result);
    }
}
