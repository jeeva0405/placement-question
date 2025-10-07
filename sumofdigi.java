
import java.util.Scanner;

public class sumofdigi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println(sum);
    }
}
