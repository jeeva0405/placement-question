
import java.util.Scanner;

class evenorodd{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();

        if(num%2==0){
            System.out.println(num + ": the num is even");
        }
        else{
            System.out.println(num + ": the num is odd");

        }
    }
}