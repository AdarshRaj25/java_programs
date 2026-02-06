import java.util.Scanner;
public class bitMul{
    static int add(int a,int b){
        while(b !=0) {
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        return a;
    }
    static int multiply(int a, int b) {
        boolean negative = false;
        if(a<0){
            a = add(~a, 1);
            negative = !negative;
        }
        if (b < 0) {
             b = add(~b, 1); 
             negative = !negative;
            }
        int result=0;
        while(b!=0){
            if((b & 1)==1)
                result = add(result, a);

            a<<=1;
            b>>=1;
        }
        return negative?add(~result, 1):result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no to be multiplied");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("The mul of two number "+num1+" and "+num2+" is "+ multiply(num1, num2));
        }
}
