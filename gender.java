
import java.util.Scanner;

public class gender {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the gender male means 1 or female means 2 ");
        int gender = scan.nextInt();
        System.out.println("enter the age");
        int age =scan.nextInt();

        if(gender==1){
            if(age <25){
                System.out.println("group 1");
            }
            else if(age >=25 || age <45){
                System.out.println("group 3");
           }    
        }
        else if (gender==2){
            if(age <25){
                System.out.println("group 2");
            }
            else if(age >=25 || age <45){
                System.out.println("group 4");
           }    
            
        }
        else {
            System.out.println("Invalid if user enters other gender codes");
                                

        }

    }
    
}
