
import java.util.Scanner;

class minmax3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number ");
        int a =scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int max ;

        if(a>=b && a>=c){
            max =a;
        }
        else if(b>=a && b>=c){
            max =b;
        }
        else{
            max =c;
        }
        System.out.println(max);
    }
}