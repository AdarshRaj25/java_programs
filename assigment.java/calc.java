import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary:");
        int basicsalary = sc.nextInt();
     int total;
        if(basicsalary>=30000){
       int hra = (basicsalary * 20) / 100;  
        int da = (basicsalary * 15) / 100;
        total = basicsalary + hra + da;
        }
        else{
            int hra = (basicsalary * 10) / 100;
            int da = (basicsalary * 8) / 100;
            total = basicsalary + hra + da;
        }
        int pf = (basicsalary * 12) / 100;
        total = total - pf;
        System.out.println("Total salary: " + total);
    }
}

