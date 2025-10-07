
import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        if(num>=1){
            System.out.println(num +": the number is positive");
        }
        else if (num<0) {
            System.out.println(num +": the number is nagtive");
            
        }
        else{
            System.out.println("0");
        }
    }
    
}
