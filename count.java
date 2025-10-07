import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1 =scan.nextInt();
       //num1 = Math.abs(num1);
        int count=0;
        while(num1>0){
             num1/=10;
             count++;

        
   
       
        }
        System.out.println(count);
    }
}   
