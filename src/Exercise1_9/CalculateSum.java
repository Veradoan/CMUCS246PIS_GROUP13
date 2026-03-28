
package Exercise1_9;
import java.util.Scanner;
public class CalculateSum {
    public static void main(String args[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int sum=0;
        int n=key.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of numbers from 1 to "+n+ " is: "+sum);
    }
}
