import java.util.Scanner;
public class bitSub{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no to be subtracted");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("The diff of two number "+num1+" and "+num2+" is ");
        num2=~num2+1;
        while(num2!=0){
            int carry=(num1&num2)<<1;
            num1=num1^num2;
            num2=carry;
        }
        System.out.println(num1);
    }
}