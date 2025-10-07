
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        boolean prime=true;
        if(num<=1){
            System.out.println("false");
        }else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num % i ==0){
                    prime=false;
                    break;
                }

            
            }

        }
        if(prime){
            System.out.println("prime num");
        }else{
            System.out.println("not prime");
        }
    }
    
}
