import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
System.out.println("Enter the lower limit:");
int lower = sc.nextInt();
 System.out.println("Enter the upper limit:");
     int upper = sc.nextInt();
 System.out.println("Prime numbers between " + lower + " and " + upper + ":");
 for (int num = lower; num <= upper; num++) {
     if (isPrime(num)) {
           System.out.print(num + " ");
            }
        }
    }

public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    return false;
}
}
