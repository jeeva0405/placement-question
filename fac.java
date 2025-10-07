import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();

        if(a<0){
            System.out.println("dhi");
        }
        else{
            long fact=1;
            for (int i = 1; i <=a; i++) {
                fact*=i;

                
            }
            System.out.println(fact);
        }
        scan.close();

    }
}    