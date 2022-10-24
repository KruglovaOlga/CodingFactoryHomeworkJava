package gr.aueb.cf.ch1;
/*
 * Coding Factory 3
 * @author Olga Kruglova
 */

//program print date(simplified)


import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        System.out.println("This program prints date");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = sc.nextInt();

        System.out.println("Enter a month");
        int month = sc.nextInt();

        System.out.println("Enter a year");
        int year = sc.nextInt();

        System.out.printf(" The date is: %d/%d/%d", day, month, year);
    }
}
