import java.util.Scanner;
public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the item:");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of the item:");
        int quantity = sc.nextInt();
        double total = price *quantity;
        if(total>=2000){
            total = total - (total*0.05);
        }
        else if(total>=5000){
            total = total -(total*0.10);
        }
        total = total+(total*0.18);
        System.out.println("Total price: " + total);
    }
}