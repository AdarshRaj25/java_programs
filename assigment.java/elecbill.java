import java.util.Scanner;

public class elecbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of units consumed:");
    int units = sc.nextInt();
     double billamount;
      if (units <=100) {
     billamount = units * 2.0;
        }
         else if (units <= 200) {
         billamount=(100* 2.0) + ((units - 100) * 3.0);
        }
 else {
        billamount = (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0);
        }
        int metercharge = 50;
        System.out.println("Total electricity bill: " + (billamount + metercharge));
        sc.close();
    }
}
