    
import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the days");
        int days =scan.nextInt();
        int year=days/365;
        int remaindays= days%365;
        int months=remaindays/30;
        int  daysdays=remaindays%30;
         System.out.println("years :" +year);
         System.out.println("months :" +months);
         System.out.println("days:" +daysdays);
    }
}
