
import java.util.Scanner;

public class sumofdigiha {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n,sum=0;
         
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        if(n%sum==0)
            System.out.println("harsed");
        
        else
            System.out.println("not harsed");
        }
        
    }

