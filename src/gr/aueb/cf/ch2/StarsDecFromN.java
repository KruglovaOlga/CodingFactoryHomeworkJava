package gr.aueb.cf.ch2;

import java.util.Scanner;


    /**
     * ο χρήστης θα δίνει το πλήθος
     * των stars, έστω n
     * – τυπώνει από n εώς 1 οριζόντια αστεράκια
     */

    public class StarsDecFromN {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = 0;
            int i = 0;
            int j = 0;

            System.out.println("please insert the N-number");
            n = in.nextInt();

            for (i = n; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

