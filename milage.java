
import java.util.Scanner;

public class milage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter beginning odometer reading ");
        float f1=scan.nextFloat();
        System.out.println("Enter ending odometer reading");
        float f2=scan.nextFloat();
         float kilometer =f2-f1;
         System.out.println("enter the milage per liter");
         int milage=scan.nextInt();
         float fuelprice=(kilometer*milage);
         System.out.printf( "%.2f %.2f",kilometer  , fuelprice);
     //   System.out.printf("%.2f" ,fuelprice );

    }
    

}
