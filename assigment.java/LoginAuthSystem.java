import java.util.Scanner;
public class LoginAuthSystem{
    public static void main(String[] args) {
        System.out.println("\t!!WELCOME!!\n    This is login page");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String password=sc.next();
        for (int i = 0; i < 3; i++) {
            if(i==0){
                System.out.println("Enter the password you entered pastly");
            }
            if(!sc.next().equals(password)){
                System.out.println("You entered the wrong password\n Try again!!");
            }
            else{
                System.out.println("Login page unlocked");
                break;
            }
        }
        System.out.println("!!  Webpage is locked   !!"); 
        sc.close();
    }
}