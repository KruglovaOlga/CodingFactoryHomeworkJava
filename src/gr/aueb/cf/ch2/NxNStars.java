package gr.aueb.cf.ch2;

import java.util.Scanner;

    /**
     * ο χρήστης θα δίνει το πλήθος
     * των stars, έστω n
     * – n σειρές από n οριζόντια αστεράκια,
     */

    public class NxNStars {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = 0;
            int i = 0;
            int j = 0;

            System.out.println("please insert number of stars");
            n = in.nextInt();

            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
/*
            while (i <= n) {
                while (j <= n) {
                    System.out.print("*");
                    j++;
                    //System.out.print(i + " " + j);
                }
                System.out.println("*");
                i++;
                //System.out.print(i + " " + j);
            }
            System.out.println();
            // System.out.println("Bye\n");

 */


        }

    }

