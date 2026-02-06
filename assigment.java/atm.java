import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter account balance:");
    double balance = sc.nextDouble();
    System.out.println("Enter withdrawal amount:");
    double withdrawal = sc.nextDouble();
if (withdrawal % 100 == 0 && (balance - withdrawal) >= 1000) {
     balance -= withdrawal;
    System.out.println("Withdrawal successful. Remaining balance: " + balance);
     }
else {
     System.out.println("Withdrawal failed. Please check the conditions.");
        }
    }
}
