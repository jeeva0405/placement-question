
import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int sumodd=0, sumeven=0;
        for (int i=1;i<=a;i++){
            if(i%2==0){
                sumeven+=i;

            }
            else{
                sumodd +=i;
            }
        }
        System.out.println(sumodd +" " +sumeven);
    }
    
}
