
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rev =scan.nextInt();
        if(rev==0){
            System.out.println("0");
        }
        else{
            while(rev>0){
                int digit= rev%10;
                System.out.println(digit +" ");
                 rev/=10;
            }
           
        }
        scan.close();
    }
    
}
