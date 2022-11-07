package gr.aueb.cf.ch2;
/**
 * program that checks whether an year is a leap year or not
 */

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args){
        int year = 1;
        Scanner in = new Scanner(System.in);

        while (year > 0) {
            System.out.println("\nEnter the Year or Press 0 for Exit: ");
            year = in.nextInt();

            if (year == 0) {
                System.out.println("You pressed Exit!\nBye!");
                return;
            } else if ((year % 4 == 0) && (year % 100 != 0))
                System.out.printf("\nThe %d is a Leap Year.",year);
            else if (year % 400 == 0)
                System.out.printf("\nThe %d is a Leap Year.",year);
            else
                System.out.printf("\nThe %d is not a Leap Year.",year);
        }
    }
}
