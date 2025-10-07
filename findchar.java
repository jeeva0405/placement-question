
import java.util.Scanner;

class findch{
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the char");
    char ch=scan.next().charAt(0);
    if((ch=='A' && ch=='B')||(ch=='a'&& ch=='b')){
        System.out.println("alphat");
    }
    else if(ch==1 &&ch==9){
        System.out.println("number");
    }else{
        System.out.println("special");
    }
        
    }
}