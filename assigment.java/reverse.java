import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
 int number = 12345;
 int reverse = 0;
int sum = 0;
int count = 0;
int temp = number; 

        while (temp != 0) {
 int digit = temp % 10; 
   reverse = reverse * 10 + digit; 
  sum += digit; 
       count++;
 temp /= 10; 
        }

 System.out.println("Original number: " + number);
  System.out.println("Reversed number: " + reverse);
     System.out.println("Sum of digits: " + sum);
     System.out.println("Count of digits: " + count);
    }
}
