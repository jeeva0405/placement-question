
import java.util.Scanner;

public class sbi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Age of primary applicant");
        int age = scan.nextInt();
        System.out.println(" Age of add-on card applicant");
        int card =scan.nextInt();
        System.out.println("Salaried(1), Self-employed(2), Student(3), Retired pensioner(4)");
        int emp=scan.nextInt();
        System.out.println("income");
        int income= scan.nextInt();

        if( age >=20 || age <=65){
            if( card>=18){
                if(income>30000){
                System.out.println("Yes. You are eligible for SBI credit cards ");
                }else{
                    System.out.println("not eligibel for applying card ");
                }
                
            }
            else{
                System.out.println("No. You are not eligible for SBI credit cards");
            }

            
            }
        else{
            System.out.println("No. You are not eligible for SBI credit cards");
                                
        }


    }
    
}
