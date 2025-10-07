
import java.util.Scanner;

class findchar1{
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the char");
    char ch=scan.next().charAt(0);
    if((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z')){
        System.out.println("alphat");
    }
    else if(ch>=1 ||ch<=9){
        System.out.println("number");
    }
    else{
        System.out.println("special");
    }
        
    }
}