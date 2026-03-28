
package Exercise1_9;
import java.util.Scanner;
public class DrawARightAngledTriangle {
public static void main(String args[]){
    Scanner key=new Scanner(System.in);
    System.out.print("Enter the height:");
    int h=key.nextInt();
    for(int i=1;i<=h;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}    
}

