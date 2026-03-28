package Exercise1_9;

import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        long fac = 1;
        System.out.print("Enter a non-negative integer: ");
        int n = key.nextInt();
        while (n < 0) {
            System.out.print("Enter a non-negative integer: ");
            n = key.nextInt();
        }
        for (int i = n; i >= 1; i--) {
            fac *= i;
        }
        System.out.println("The factorial of " + n + " is: " + fac);
    }
}

