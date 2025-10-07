
import java.util.Scanner;

public class shape{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if (a==b && a==c && b==a && b==c &&c==a &&c==b){
            System.out.println("Equilateral Triangle");
        }else if(a==b ||a==c && b!=c){
            System.out.println("Isosceles Triangle   ");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
}        