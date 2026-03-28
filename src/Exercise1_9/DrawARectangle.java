
package Exercise1_9;
import java.util.Scanner;
public class DrawARectangle {
    public static void main(String args[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h=key.nextInt();
        System.out.print("Enter the width:");
        int w=key.nextInt();
        System.out.println("Output:");
        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

