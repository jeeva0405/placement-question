
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size =scan.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr [i]=scan.nextInt();
        }
      //  int value=scan.nextInt();
        Arrays.sort(arr);
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
    
}
