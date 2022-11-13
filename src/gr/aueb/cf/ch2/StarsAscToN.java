package gr.aueb.cf.ch2;

import java.util.Scanner;


    /**
     * ο χρήστης θα δίνει το πλήθος
     * των stars, έστω n
     * – τυπώνει από 1 εώς n οριζόντια αστεράκια
     */


    public class StarsAscToN {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = 0;
            int i = 0;
            int j = 0;

            System.out.println("please insert the N-number");
            n = in.nextInt();

            for (i = 0; i < n; i++) {
                for (j = 0; j < i + 1; j++) {
                    System.out.print(" :) ");
                }
                System.out.println();
            }
        }
    }
