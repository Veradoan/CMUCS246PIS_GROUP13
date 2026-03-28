
package Exercise1_9;
import java.util.Scanner;
public class CalculateAverageUntil0 {
    public static void main(String args[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter a number(enter 0 to stop): ");
        double number=key.nextDouble();
        
        int dem=0; double sum=0;
        while(number!=0){
             dem++;
             sum+=number;
            System.out.print("Enter a number(enter 0 to stop): ");
            number=key.nextInt();      
        }
        if(dem>0){
        System.out.println("The average is: "+sum*1.0/dem);
    }else{
            System.out.println("Error.");
        }
        
    }
}

