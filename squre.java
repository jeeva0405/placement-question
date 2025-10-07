
import java.util.Scanner;

public class squre {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int value=(int)Math.sqrt(num);
        if(value*value==num)
            System.out.println("perfect sq");
        else
            System.out.println("no");
        
    }
    
}
