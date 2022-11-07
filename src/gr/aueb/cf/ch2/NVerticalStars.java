package gr.aueb.cf.ch2;

import java.util.Scanner;

    /**
     * ο χρήστης θα δίνει το πλήθος
     * των stars, έστω n
     * – n κάθετα αστεράκια,
     */

    public class NVerticalStars {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = 0;
            int i = 1;

            System.out.println("please insert number of stars");
            n = in.nextInt();

            while (i <= n) {
                System.out.println("*");
                i++;
            }
            System.out.println();
            // System.out.println("Bye\n");
        }

    }

