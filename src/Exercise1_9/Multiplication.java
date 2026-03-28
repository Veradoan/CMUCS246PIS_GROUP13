
package Exercise1_9;
import java.util.Scanner;
public class Multiplication {
    public static void main(String args[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter an integer from 2 to 9: ");
        int n=key.nextInt();
        while(n<2||n>9){
            System.out.print("Enter an integer from 2 to 9: ");
         n=key.nextInt();
        }
        System.out.println("Output: ");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        
    }
}

