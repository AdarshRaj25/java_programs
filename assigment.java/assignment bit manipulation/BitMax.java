import java.util.Scanner;
public class BitMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no to be compared");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while (y != 0) {
            int borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
        }
        int k = x >> 31; 
        int max = a ^ ((a ^ b) & k);
        System.out.println("The max of two number " + a + " and " + b + " is " + max);
    }
}
