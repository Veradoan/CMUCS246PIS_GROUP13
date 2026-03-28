package Exercise1_9;
import java.util.Scanner;
import java.util.*;

public class NumberGuessingGame {

    public static void main(String args[]) {
       Scanner key = new Scanner(System.in);
        Random rand = new Random();
            int  n=rand.nextInt(100)+1;
            System.out.println("Computer generates the number from 1 to 100: ");
            System.out.print("Your guess: ");
            int n1=key.nextInt();
        System.out.println("Computer generates the number: "+n);
            while(n!=n1){
            
            if (n > n1) {
                System.out.println("Your number is lower than the secret number");
                
            } else {
                System.out.println("Your number is higher than the secret number");
                 
            }
                System.out.print("Your guess: ");
                n1=key.nextInt();
        } 
        System.out.println ("Congratulations!You guessed correctly!");
    }

    
}

