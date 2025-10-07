import java.util.Scanner;

public class minm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      
        System.out.println("enter the num to check");
          int num1=scan.nextInt();
            int num2=scan.nextInt();
             int max=(num1>num2)?num1:num2;
             int min =(num1<num2)?num1:num2;
             System.out.println("MAX"+max   +"  min" +min);
    }
}            