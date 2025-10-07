import java.util.Scanner;

class fibbo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num =scan.nextInt();
        int first=0, second=1;
        for(int i=1;i<=num;i++){
            System.out.print(first+ " ");
            int next=first+second;
            first =second;
            second=next;


        
    }
}