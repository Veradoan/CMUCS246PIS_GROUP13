package Exercise1_9;

import java.util.Scanner;

public class InputValidation {

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a number from 1 to 10: ");
           n = key.nextInt();
            if(n<1||n>10){
                 System.out.println("Invalid number, please try agian. ");
            }
        } while (n < 1 || n > 10);
        System.out.println("You entered the number: " + n);

    }
}

